package com.ec.modelo;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import javax.swing.JTextArea;
import javax.swing.TransferHandler;

public class TransferirArchivo {

    public static void configureFileDrop(JTextArea textArea) {
        TransferHandler oldTransferHandler = textArea.getTransferHandler();
        TransferHandler fileTransferHandler = new TransferHandler() {
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
                    List<File> files = (List<File>) transferable.getTransferData(DataFlavor.javaFileListFlavor);
                    for (File file : files) {
                        if (file.isFile()) {
                            try {
                                String content = new String(Files.readAllBytes(file.toPath()), "UTF-8");
                                textArea.setText(content);
                                return true;
                            } catch (IOException e) {
                                System.out.println("ERROR: " + e.getMessage());
                                return false;
                            }
                        }
                    }
                } catch (UnsupportedFlavorException | IOException ex) {
                    System.out.println("ERROR: " + ex.getMessage());
                }
                // Retornar true para indicar que la operación de transferencia de archivos ha sido manejada
                return true;
            }
        };

        // Combina los TransferHandlers solo si hay uno previamente establecido
        if (oldTransferHandler != null) {
            TransferHandler combinedTransferHandler = new TransferHandler() {
                @Override
                public boolean canImport(TransferSupport support) {
                    return oldTransferHandler.canImport(support) || fileTransferHandler.canImport(support);
                }

                @Override
                public boolean importData(TransferSupport support) {
                    // Solo maneja la importación de datos si es una transferencia de archivos
                    if (fileTransferHandler.canImport(support)) {
                        return fileTransferHandler.importData(support);
                    } else {
                        // Delega a las acciones predeterminadas de importación de datos
                        return oldTransferHandler.importData(support);
                    }
                }
            };
            textArea.setTransferHandler(combinedTransferHandler);
        } else {
            // Si no hay ningún TransferHandler previamente establecido, establece el nuevo TransferHandler
            textArea.setTransferHandler(fileTransferHandler);
        }
    }

}
