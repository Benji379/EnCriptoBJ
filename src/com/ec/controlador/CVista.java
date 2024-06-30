package com.ec.controlador;

import com.ec.modelo.Encriptador;
import com.ec.modelo.TransferirArchivo;
import com.ec.vista.frmVista;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import javax.swing.border.EmptyBorder;

public class CVista {

    frmVista v;

    public CVista(frmVista v) {
        this.v = v;
    }

    public void init() {
        v.setLocationRelativeTo(null);
        v.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/ec/img/icono.png")));
        v.jScrollPane1.setBorder(new EmptyBorder(0, 0, 0, 0));
        TransferirArchivo.configureFileDrop(v.txtTexto);
//        TransferirArchivo.configureFileDrop(v.txtTexto,"C:\\Users\\benja\\OneDrive\\Documentos\\NetBeansProjects\\EnCriptoBJ\\src\\com\\ec\\data\\filesDisponibles.txt");
//        TransferirArchivo.enableCopyPasteCut(v.txtTexto);
    }

    public void cifrar() {
        try {
            String texto = v.txtTexto.getText();
            String clave = v.txtClave.getText();
            String resultado = Encriptador.encriptar(texto, clave);
            v.txtTexto.setText(resultado);
        } catch (Exception e) {
        }
    }

    public void decifrar() {
        try {
            String texto = v.txtTexto.getText();
            String clave = v.txtClave.getText();
            String resultado = Encriptador.desencriptar(texto, clave);
            v.txtTexto.setText(resultado);
        } catch (Exception e) {

        }
    }

    public void copiar() {
        try {
            String texto = v.txtTexto.getText();
            // Obtenemos el Toolkit del sistema
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            // Obtenemos el Clipboard del sistema
            Clipboard clipboard = toolkit.getSystemClipboard();
            // Creamos una StringSelection que contiene el texto a copiar
            StringSelection selection = new StringSelection(texto);
            // Copiamos la StringSelection al Clipboard
            clipboard.setContents(selection, null);
        } catch (HeadlessException e) {
        }
    }

}
