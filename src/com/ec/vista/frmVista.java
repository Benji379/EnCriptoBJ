package com.ec.vista;

import com.ec.controlador.CVista;

public class frmVista extends javax.swing.JFrame {
    
    CVista controlador;
    
    public frmVista() {
        initComponents();
        controlador = new CVista(this);
        controlador.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelCustom1 = new com.ec.componet.PanelCustom();
        jScrollPane1 = new com.benjiBK.scroll.ScrollPaneWin11();
        txtTexto = new javax.swing.JTextArea();
        panelCustom2 = new com.ec.componet.PanelCustom();
        btnCopiar = new com.ec.componet.Button();
        btnRefrescar = new com.ec.componet.Button();
        btnCifrar = new com.ec.componet.Button();
        btnDecrifrar = new com.ec.componet.Button();
        panelCustom3 = new com.ec.componet.PanelCustom();
        txtClave = new com.ec.componet.TextFieldSuggestion();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CriptoBJ");

        jPanel1.setBackground(new java.awt.Color(30, 30, 30));

        panelCustom1.setBackground(new java.awt.Color(255, 255, 255));
        panelCustom1.setShadowColor(new java.awt.Color(0, 0, 0));

        txtTexto.setColumns(20);
        txtTexto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtTexto.setLineWrap(true);
        txtTexto.setRows(5);
        txtTexto.setSelectionColor(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(txtTexto);

        javax.swing.GroupLayout panelCustom1Layout = new javax.swing.GroupLayout(panelCustom1);
        panelCustom1.setLayout(panelCustom1Layout);
        panelCustom1Layout.setHorizontalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1)
                .addGap(15, 15, 15))
        );
        panelCustom1Layout.setVerticalGroup(
            panelCustom1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        panelCustom2.setBackground(new java.awt.Color(35, 35, 35));
        panelCustom2.setShadowColor(new java.awt.Color(0, 0, 0));

        btnCopiar.setForeground(new java.awt.Color(0, 0, 0));
        btnCopiar.setText("Copiar");
        btnCopiar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCopiar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCopiar.setRippleColor(new java.awt.Color(51, 51, 51));
        btnCopiar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });

        btnRefrescar.setForeground(new java.awt.Color(0, 0, 0));
        btnRefrescar.setText("Refresh");
        btnRefrescar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefrescar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnRefrescar.setRippleColor(new java.awt.Color(51, 51, 51));
        btnRefrescar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

        btnCifrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCifrar.setText("Cifrar");
        btnCifrar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCifrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCifrar.setRippleColor(new java.awt.Color(51, 51, 51));
        btnCifrar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnCifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCifrarActionPerformed(evt);
            }
        });

        btnDecrifrar.setForeground(new java.awt.Color(0, 0, 0));
        btnDecrifrar.setText("Descifrar");
        btnDecrifrar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDecrifrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnDecrifrar.setRippleColor(new java.awt.Color(51, 51, 51));
        btnDecrifrar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnDecrifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecrifrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCustom2Layout = new javax.swing.GroupLayout(panelCustom2);
        panelCustom2.setLayout(panelCustom2Layout);
        panelCustom2Layout.setHorizontalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnCopiar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(btnRefrescar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(btnCifrar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(15, 15, 15)
                .addComponent(btnDecrifrar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        panelCustom2Layout.setVerticalGroup(
            panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panelCustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCopiar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(btnDecrifrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCifrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRefrescar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );

        panelCustom3.setBackground(new java.awt.Color(35, 35, 35));
        panelCustom3.setShadowColor(new java.awt.Color(0, 0, 0));

        txtClave.setForeground(new java.awt.Color(255, 255, 255));
        txtClave.setCaretColor(new java.awt.Color(255, 255, 255));
        txtClave.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtClave.setSelectionColor(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clave:");

        javax.swing.GroupLayout panelCustom3Layout = new javax.swing.GroupLayout(panelCustom3);
        panelCustom3.setLayout(panelCustom3Layout);
        panelCustom3Layout.setHorizontalGroup(
            panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        panelCustom3Layout.setVerticalGroup(
            panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCustom3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelCustom3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtClave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(panelCustom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelCustom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCustom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCustom3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCifrarActionPerformed
        controlador.cifrar();
    }//GEN-LAST:event_btnCifrarActionPerformed

    private void btnDecrifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecrifrarActionPerformed
        controlador.decifrar();
    }//GEN-LAST:event_btnDecrifrarActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        controlador.copiar();
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        txtTexto.setText("");
    }//GEN-LAST:event_btnRefrescarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmVista().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.ec.componet.Button btnCifrar;
    public com.ec.componet.Button btnCopiar;
    public com.ec.componet.Button btnDecrifrar;
    public com.ec.componet.Button btnRefrescar;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    public com.ec.componet.PanelCustom panelCustom1;
    public com.ec.componet.PanelCustom panelCustom2;
    public com.ec.componet.PanelCustom panelCustom3;
    public com.ec.componet.TextFieldSuggestion txtClave;
    public javax.swing.JTextArea txtTexto;
    // End of variables declaration//GEN-END:variables
}
