
package com.mycompany.taller;

import Funcionalidades.DatabaseConnection;
import Funcionalidades.LoginDAO;
import HibernateFun.LoginManejo;
import model.LoginModel;
import model.UsuarioRolModel;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.UsuarioModel;
import org.apache.log4j.PropertyConfigurator;


public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null); 
        this.setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textPasword = new javax.swing.JPasswordField();
        ButtonEntrarLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(84, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contrasenia:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        textUsuario.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(textUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 160, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LOGIN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 80, 40));

        textPasword.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(textPasword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 160, 30));

        ButtonEntrarLogin.setBackground(new java.awt.Color(204, 204, 204));
        ButtonEntrarLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonEntrarLogin.setForeground(new java.awt.Color(0, 0, 0));
        ButtonEntrarLogin.setText("Entrar");
        ButtonEntrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEntrarLoginActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonEntrarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonEntrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEntrarLoginActionPerformed
        String usuario = textUsuario.getText();
        String contrasenia = textPasword.getText();
       
        List<UsuarioModel> usuarios = LoginManejo.getListaUsuarios();
        UsuarioModel u = usuarios.get(0);
        int userId = LoginDAO.getLoginStoredProcedures(new LoginModel(usuario, contrasenia,0,false));
        // Para la bitacora
            DatabaseConnection.loginModel = new LoginModel(usuario, contrasenia, 0, true);
            DatabaseConnection.loginModel.id = userId;
        //
        if (userId >= 0) {
            UsuarioRolModel rolModel = LoginDAO.getRol(userId);
            if(rolModel != null ){
                if(!rolModel.activo ){
                     JOptionPane.showMessageDialog(this,
                        "Usuario dado de baja");
                     return;
                }
                LoginDAO.guardarSesion();
                dispose();
                if(rolModel.nombreRol.equals("instructor")){
                    new MenuInstructor().setVisible(true);
                }
                if(rolModel.nombreRol.equals("administrador")){
                    new MenuAdmi().setVisible(true);
                }
                if(rolModel.nombreRol.equals("usuario")){
                    new MenuCliente().setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(this,
                    "No cuenta con rol asignado, contactese con el administrador");
            }
        } else {
            JOptionPane.showMessageDialog(this,
                    "Login fallido");
    }//GEN-LAST:event_ButtonEntrarLoginActionPerformed
    }
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                System.out.println("hello");
//                String log4jConfPath = "log4j2.xml";
//                PropertyConfigurator.configure(log4jConfPath);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEntrarLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField textPasword;
    private javax.swing.JTextField textUsuario;
    // End of variables declaration//GEN-END:variables
}
