package Test;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.security.SecureRandom;
import java.security.spec.KeySpec;

public class FileEncryptorDecryptor {

    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES";
    private static final int SALT_LENGTH = 16; // 16 bytes for the salt
    private static final int KEY_LENGTH = 256; // 256 bits for AES-256
    private static final int ITERATION_COUNT = 65536; // Iteration count for PBKDF2

    public static void encrypt(String fileInputPath, String fileOutputPath, String password) throws Exception {
        // Generate a random salt
        byte[] salt = new byte[SALT_LENGTH];
        SecureRandom random = new SecureRandom();
        random.nextBytes(salt);

        // Generate the secret key
        SecretKey secretKey = getSecretKey(password, salt);

        // Initialize the cipher
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        // Encrypt the file
        try (FileOutputStream fos = new FileOutputStream(fileOutputPath); FileInputStream fis = new FileInputStream(fileInputPath)) {

            // Write the salt to the beginning of the output file
            fos.write(salt);

            byte[] inputBytes = new byte[64];
            int bytesRead;

            while ((bytesRead = fis.read(inputBytes)) != -1) {
                byte[] outputBytes = cipher.update(inputBytes, 0, bytesRead);
                if (outputBytes != null) {
                    fos.write(outputBytes);
                }
            }

            byte[] outputBytes = cipher.doFinal();
            if (outputBytes != null) {
                fos.write(outputBytes);
            }
        }
    }

    public static boolean decrypt(String fileInputPath, String fileOutputPath, String password) throws Exception {
        File outputFile = new File(fileOutputPath);
        try (FileInputStream fis = new FileInputStream(fileInputPath);
             FileOutputStream fos = new FileOutputStream(outputFile)) {

            // Read the salt from the beginning of the input file
            byte[] salt = new byte[SALT_LENGTH];
            if (fis.read(salt) != SALT_LENGTH) {
                throw new IOException("Unable to read salt from file");
            }

            // Generate the secret key
            SecretKey secretKey = getSecretKey(password, salt);

            // Initialize the cipher
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);

            byte[] inputBytes = new byte[64];
            int bytesRead;

            while ((bytesRead = fis.read(inputBytes)) != -1) {
                byte[] outputBytes = cipher.update(inputBytes, 0, bytesRead);
                if (outputBytes != null) {
                    fos.write(outputBytes);
                }
            }

            byte[] outputBytes = cipher.doFinal();
            if (outputBytes != null) {
                fos.write(outputBytes);
            }

            return true;
        } catch (Exception e) {
            // If an exception occurs, delete the partially created output file
            if (outputFile.exists()) {
                outputFile.delete();
            }
            System.out.println("ERROR: "+e.getMessage());
            return false;
        }
    }

    private static SecretKey getSecretKey(String password, byte[] salt) throws Exception {
        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, ITERATION_COUNT, KEY_LENGTH);
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        byte[] secretKeyBytes = factory.generateSecret(spec).getEncoded();
        return new SecretKeySpec(secretKeyBytes, ALGORITHM);
    }

    public static void main(String[] args) {
        String fileInputPath = "C:/Users/benja/OneDrive/Escritorio/PRUEBA_COPIAR_ARCHIVO/imagen.png";
        String fileOutputPath = "C:/Users/benja/OneDrive/Escritorio/PRUEBA_COPIAR_ARCHIVO/imagen";
        String password = "Benjamin123*#";

        try {
//             Encrypt the file
            encrypt(fileInputPath, fileOutputPath + ".enc", password);
            System.out.println("File encrypted successfully!");

//             Decrypt the file
//            if (decrypt(fileOutputPath + ".enc", fileOutputPath + ".dec", password)) {
//                System.out.println("File decrypted successfully!");
//            } else {
//                System.out.println("ERROR NO DESENCRIPTADO");
//            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}

//        String fileInputPath = "C:/Users/benja/OneDrive/Escritorio/PRUEBA_COPIAR_ARCHIVO/imagen.png";
//        String fileOutputPath = "C:/Users/benja/OneDrive/Escritorio/PRUEBA_COPIAR_ARCHIVO/imagen_encrypted.png";
