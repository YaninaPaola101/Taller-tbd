package com.mycompany.taller;

import Funcionalidades.DatabaseConnection;
import Funcionalidades.LoginDAO;
import Funcionalidades.PermisosDao;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.UsuarioModel;
import Funcionalidades.UsuarioDao;
import HibernateFun.UsuarioManejo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;

public class Usuarios extends javax.swing.JFrame {

    private RegistroUsuario registro;
    UsuarioDao usu = new UsuarioDao();
    UsuarioManejo usumanejo = new UsuarioManejo();
    private DefaultTableModel usuario;

    public Usuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        listarUsuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableUsuarios = new javax.swing.JTable();
        ButtonActualizarUsuario = new javax.swing.JButton();
        ButtonRegistrarCliente = new javax.swing.JButton();
        ButtonEditarUsuario = new javax.swing.JButton();
        ButtonEliminarUsuario = new javax.swing.JButton();
        ButtonMenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(84, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        TableUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        TableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Edad", "Activo", "Rol"
            }
        ));
        jScrollPane1.setViewportView(TableUsuarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 390, 310));

        ButtonActualizarUsuario.setBackground(new java.awt.Color(204, 204, 204));
        ButtonActualizarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonActualizarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        ButtonActualizarUsuario.setText("Actualizar");
        ButtonActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActualizarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonActualizarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 110, 40));
        ButtonActualizarUsuario.getAccessibleContext().setAccessibleName("Activos");

        ButtonRegistrarCliente.setBackground(new java.awt.Color(204, 204, 204));
        ButtonRegistrarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtonRegistrarCliente.setForeground(new java.awt.Color(0, 0, 0));
        ButtonRegistrarCliente.setText("Registrar Usuario");
        ButtonRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistrarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonRegistrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 130, 40));

        ButtonEditarUsuario.setBackground(new java.awt.Color(204, 204, 204));
        ButtonEditarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonEditarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        ButtonEditarUsuario.setText("Editar");
        ButtonEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonEditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 110, 40));

        ButtonEliminarUsuario.setBackground(new java.awt.Color(204, 204, 204));
        ButtonEliminarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonEliminarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        ButtonEliminarUsuario.setText("Habi/Inhabi");
        ButtonEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonEliminarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 120, 40));

        ButtonMenuPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        ButtonMenuPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtonMenuPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        ButtonMenuPrincipal.setText("Menu Principal");
        ButtonMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMenuPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarUsuario() {
        List<UsuarioModel> listaUsuario = new ArrayList();
        listaUsuario = usumanejo.actualizarLista();
        usuario = (DefaultTableModel) TableUsuarios.getModel();
        usuario.setRowCount(0);
        Object[] ob = new Object[5];
        for (int i = 0; i < listaUsuario.size(); i++) {
            ob[0] = listaUsuario.get(i).getId();
            ob[1] = listaUsuario.get(i).getNombreUsuario();
            ob[2] = listaUsuario.get(i).getEdad();
            ob[3] = listaUsuario.get(i).isActivo();
            ob[4] = listaUsuario.get(i).getRol();
            usuario.addRow(ob);
        }
        TableUsuarios.setModel(usuario);
    }
    private void ButtonActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActualizarUsuarioActionPerformed
        listarUsuario();
    }//GEN-LAST:event_ButtonActualizarUsuarioActionPerformed

    private void ButtonRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarClienteActionPerformed
        registro = new RegistroUsuario();
        registro.setVisible(true);
    }//GEN-LAST:event_ButtonRegistrarClienteActionPerformed

    private void ButtonMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMenuPrincipalActionPerformed
        this.setVisible(false);

    }//GEN-LAST:event_ButtonMenuPrincipalActionPerformed

    private void ButtonEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarUsuarioActionPerformed
        int fila = TableUsuarios.getSelectedRow();
        int id = Integer.parseInt(this.TableUsuarios.getValueAt(fila, 0).toString());
        String nombre = TableUsuarios.getValueAt(fila, 1).toString();
        String edad = TableUsuarios.getValueAt(fila, 2).toString();
        String activo = TableUsuarios.getValueAt(fila, 3).toString();
        String rol = TableUsuarios.getValueAt(fila, 4).toString();
        UsuarioModel modelo = new UsuarioModel();
        modelo.setId(id);
        modelo.setActivo(!activo.equals("true"));
        modelo.setEdad(Integer.parseInt(edad));
        modelo.setNombreUsuario(nombre);
        modelo.setRol(rol);
        UsuarioManejo.inhabilitarUsuario(modelo);
        listarUsuario();
    }//GEN-LAST:event_ButtonEliminarUsuarioActionPerformed

    private void ButtonEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarUsuarioActionPerformed
        int fila = TableUsuarios.getSelectedRow();
        int id = Integer.parseInt(this.TableUsuarios.getValueAt(fila, 0).toString());
        String nombre = TableUsuarios.getValueAt(fila, 1).toString();
        String edad = TableUsuarios.getValueAt(fila, 2).toString();
        String activo = TableUsuarios.getValueAt(fila, 3).toString();
        String rol = TableUsuarios.getValueAt(fila, 4).toString();
        UsuarioModel modelo = new UsuarioModel();
        modelo.setActivo(activo.equals("true"));
        modelo.setId(id);
        modelo.setEdad(Integer.parseInt(edad));
        modelo.setNombreUsuario(nombre);
        modelo.setRol(rol);
        UsuarioManejo.modificarUsuario(modelo);
    }//GEN-LAST:event_ButtonEditarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonActualizarUsuario;
    private javax.swing.JButton ButtonEditarUsuario;
    private javax.swing.JButton ButtonEliminarUsuario;
    private javax.swing.JButton ButtonMenuPrincipal;
    private javax.swing.JButton ButtonRegistrarCliente;
    private javax.swing.JTable TableUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
