
package com.mycompany.taller;

import Funcionalidades.InstructorDao;
import Funcionalidades.UsuarioDao;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.InstructorModel;
import model.DisciplinaModel;
import model.UsuarioModel;


public class Instructor extends javax.swing.JFrame {
    InstructorDao instructor = new InstructorDao();
    private DefaultTableModel tablaIns;
    public Instructor() {
        initComponents();
        this.setLocationRelativeTo(null); 
        this.setResizable(false);
        listarInstructor();
    }

    private void listarInstructor(){
        ArrayList<UsuarioModel> listaInstructor=new ArrayList();
        listaInstructor = instructor.listaInstructor();
        tablaIns = (DefaultTableModel) TableInstructor.getModel();
        tablaIns.setRowCount(0);
        Object[] ob = new Object[2];
        for(int i=0; i<listaInstructor.size(); i++){
            ob[0]=listaInstructor.get(i).getId();
            ob[1]=listaInstructor.get(i).getNombreUsuario();
            tablaIns.addRow(ob);
        }
        TableInstructor.setModel(tablaIns);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableInstructor = new javax.swing.JTable();
        ButtonRegistrarInstructor = new javax.swing.JButton();
        ButtonActualizarInstructor = new javax.swing.JButton();
        ButtonMenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(84, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Instructor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        TableInstructor.setBackground(new java.awt.Color(204, 204, 204));
        TableInstructor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(TableInstructor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 420, 340));

        ButtonRegistrarInstructor.setBackground(new java.awt.Color(204, 204, 204));
        ButtonRegistrarInstructor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtonRegistrarInstructor.setForeground(new java.awt.Color(0, 0, 0));
        ButtonRegistrarInstructor.setText("Registrar Usuario");
        ButtonRegistrarInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistrarInstructorActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonRegistrarInstructor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 130, 30));

        ButtonActualizarInstructor.setBackground(new java.awt.Color(204, 204, 204));
        ButtonActualizarInstructor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonActualizarInstructor.setForeground(new java.awt.Color(0, 0, 0));
        ButtonActualizarInstructor.setText("Actualizar");
        ButtonActualizarInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActualizarInstructorActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonActualizarInstructor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 110, 30));

        ButtonMenuPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        ButtonMenuPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtonMenuPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        ButtonMenuPrincipal.setText("Menu Principal");
        ButtonMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMenuPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRegistrarInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarInstructorActionPerformed
        this.setVisible(true);
        new RegistroUsuario().setVisible(true);
    }//GEN-LAST:event_ButtonRegistrarInstructorActionPerformed

    private void ButtonMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMenuPrincipalActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_ButtonMenuPrincipalActionPerformed

    private void ButtonActualizarInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActualizarInstructorActionPerformed
        listarInstructor();
    }//GEN-LAST:event_ButtonActualizarInstructorActionPerformed

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
            java.util.logging.Logger.getLogger(Instructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Instructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Instructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Instructor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instructor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonActualizarInstructor;
    private javax.swing.JButton ButtonMenuPrincipal;
    private javax.swing.JButton ButtonRegistrarInstructor;
    private javax.swing.JTable TableInstructor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
