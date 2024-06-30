package Test;
import javax.swing.*;
import java.awt.datatransfer.*;
import java.io.*;
import java.nio.file.*;

public class FileDropDemo extends JFrame {
    private JTextArea textArea;
    private JTextField keyField;

    public FileDropDemo() {
        setTitle("CriptoBJ");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new JTextArea("acá va el contenido del archivo");
        textArea.setDragEnabled(true);
        configureFileDrop(textArea);

        keyField = new JTextField(20);

        JButton copyButton = new JButton("Copiar");
        JButton encryptButton = new JButton("Cifrar");
        JButton decryptButton = new JButton("Decifrar");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JScrollPane(textArea));
        panel.add(new JLabel("Clave:"));
        panel.add(keyField);
        panel.add(copyButton);
        panel.add(encryptButton);
        panel.add(decryptButton);

        add(panel);

        setVisible(true);
    }

    public static void configureFileDrop(JTextArea textArea) {
        textArea.setTransferHandler(new TransferHandler() {
            @Override
            public boolean canImport(TransferSupport support) {
                if (!support.isDrop()) {
                    return false;
                }
                return support.isDataFlavorSupported(DataFlavor.javaFileListFlavor);
            }

            @Override
            public boolean importData(TransferSupport support) {
                if (!canImport(support)) {
                    return false;
                }

                Transferable transferable = support.getTransferable();
                try {
                    java.util.List<File> files = (java.util.List<File>) transferable.getTransferData(DataFlavor.javaFileListFlavor);
                    for (File file : files) {
                        if (file.isFile() && isTextFile(file)) {
                            textArea.setText(new String(Files.readAllBytes(file.toPath()), "UTF-8"));
                            return true;
                        }
                    }
                } catch (UnsupportedFlavorException | IOException ex) {
                    ex.printStackTrace();
                }
                return false;
            }

            private boolean isTextFile(File file) {
                String[] textFileExtensions = { "txt", "json", "properties", "html" };
                String fileName = file.getName().toLowerCase();
                for (String extension : textFileExtensions) {
                    if (fileName.endsWith("." + extension)) {
                        return true;
                    }
                }
                return false;
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(FileDropDemo::new);
    }
}
