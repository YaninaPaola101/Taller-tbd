
package com.mycompany.taller;

import Funcionalidades.LoginDAO;
import model.LoginModel;
import Funcionalidades.RolDao;
import java.util.ArrayList;
import model.RolModel;


public class RegistroUsuario extends javax.swing.JFrame {

    
    public RegistroUsuario() {
        initComponents();
        this.setLocationRelativeTo(null); 
        this.setResizable(false);
    }

    private void limpiarUsuario(){
        textNombre.setText("");
        textContrasenia.setText("");
        textEdad.setText("");
        textActivo.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textContrasenia = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();
        textEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ButtonAceptar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        textActivo = new javax.swing.JTextField();
        ButtonCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ComboBoxRol = new javax.swing.JComboBox<>();

        jPanel1.setBackground(new java.awt.Color(84, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contrasenia:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edad:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        textContrasenia.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(textContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 210, 30));

        textNombre.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 210, 30));

        textEdad.setBackground(new java.awt.Color(204, 204, 204));
        textEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEdadActionPerformed(evt);
            }
        });
        jPanel1.add(textEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 210, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registrar Usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        ButtonAceptar.setBackground(new java.awt.Color(204, 204, 204));
        ButtonAceptar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonAceptar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonAceptar.setText("Aceptar");
        ButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 140, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Activo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        textActivo.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(textActivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 210, 30));

        ButtonCancelar.setBackground(new java.awt.Color(204, 204, 204));
        ButtonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonCancelar.setText("Cancelar");
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 130, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rol:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        ArrayList<RolModel> roles = RolDao.getAllRoles();
        RolModel[] rolesModelos = new RolModel[roles.size()];
        for(int i = 0 ; i<roles.size() ;i++){
            rolesModelos[i]= roles.get(i);
        }
        ComboBoxRol.setBackground(new java.awt.Color(204, 204, 204));
        ComboBoxRol.setForeground(new java.awt.Color(0, 0, 0));
        ComboBoxRol.setModel(new javax.swing.DefaultComboBoxModel(rolesModelos));
        ComboBoxRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxRolActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBoxRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAceptarActionPerformed
        String nombre = textNombre.getText();
        String contrasenia = textContrasenia.getText();
        int edad = Integer.parseInt(textEdad.getText());
        boolean activo  = textActivo.getText().equals("true")? true :false;
        LoginModel loginModel = new LoginModel(nombre, contrasenia, edad, activo);
        LoginDAO.insertarUsuario(loginModel);
        int idUsuario = LoginDAO.getUserId(nombre, contrasenia);
        RolModel rolSeleccionado = (RolModel) ComboBoxRol.getSelectedItem();
        
        RolDao.insertarUsuarioRol(activo, rolSeleccionado.getId(), idUsuario);
        limpiarUsuario();
        this.setVisible(false);
    }//GEN-LAST:event_ButtonAceptarActionPerformed

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void textEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEdadActionPerformed

    private void ComboBoxRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxRolActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAceptar;
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JComboBox<String> ComboBoxRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textActivo;
    private javax.swing.JTextField textContrasenia;
    private javax.swing.JTextField textEdad;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
