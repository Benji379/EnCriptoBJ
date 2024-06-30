package com.ec.modelo;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Base64;

public class Encriptador {

    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES/ECB/PKCS5Padding";
    private static final String CHARSET = "UTF-8";

    public static String encriptar(String texto, String clave) throws Exception {
        Key key = generarClaveSecreta(clave);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] textoEnBytes = texto.getBytes(CHARSET);
        byte[] textoEncriptado = cipher.doFinal(textoEnBytes);
        return Base64.getEncoder().encodeToString(textoEncriptado);
    }

    public static String desencriptar(String textoEncriptado, String clave) throws Exception {
        Key key = generarClaveSecreta(clave);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] textoEncriptadoEnBytes = Base64.getDecoder().decode(textoEncriptado);
        byte[] textoDesencriptado = cipher.doFinal(textoEncriptadoEnBytes);
        return new String(textoDesencriptado, CHARSET);
    }

    private static Key generarClaveSecreta(String clave) throws Exception {
        byte[] claveEnBytes = clave.getBytes(CHARSET);
        byte[] claveConLongitudCorrecta = new byte[16];
        int longitud = Math.min(claveEnBytes.length, claveConLongitudCorrecta.length);
        System.arraycopy(claveEnBytes, 0, claveConLongitudCorrecta, 0, longitud);
        return new SecretKeySpec(claveConLongitudCorrecta, ALGORITHM);
    }
}
