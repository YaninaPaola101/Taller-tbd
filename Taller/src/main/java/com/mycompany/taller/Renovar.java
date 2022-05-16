
package com.mycompany.taller;

import Funcionalidades.SuscripcionDao;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import model.PlanModel;
import model.SuscripcionModel;


public class Renovar extends javax.swing.JFrame {

    
    public Renovar() {
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
        jLabel3 = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        ComboBoxPlan = new javax.swing.JComboBox();
        ButtonGuardar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();
        LabelInformacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(84, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Suscripcion");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 200, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Codigo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Plan:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 30));

        textCodigo.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(textCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 230, 30));

        ArrayList<PlanModel> planes = SuscripcionDao.getAllPlan();
        ComboBoxPlan.setBackground(new java.awt.Color(204, 204, 204));
        ComboBoxPlan.setForeground(new java.awt.Color(0, 0, 0));
        ComboBoxPlan.setModel(new DefaultComboBoxModel(planes.toArray()));
        jPanel1.add(ComboBoxPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 230, 30));

        ButtonGuardar.setBackground(new java.awt.Color(204, 204, 204));
        ButtonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonGuardar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonGuardar.setText("Guardar");
        ButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 150, 30));

        ButtonCancelar.setBackground(new java.awt.Color(204, 204, 204));
        ButtonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonCancelar.setText("Cancelar");
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 140, 30));

        LabelInformacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelInformacion.setForeground(new java.awt.Color(255, 255, 255));
        LabelInformacion.setText("Informacion");
        jPanel1.add(LabelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 360, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void ButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGuardarActionPerformed

        int id = Integer.parseInt(textCodigo.getText());
        PlanModel plan = (PlanModel) ComboBoxPlan.getSelectedItem();
        SuscripcionModel sus = new SuscripcionModel(id, plan.getNombrePlan());
        sus.setPlan(plan.getNombrePlan());
        SuscripcionDao.insertarSuscripcion(id, plan.getNombrePlan());
    }//GEN-LAST:event_ButtonGuardarActionPerformed

   
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
            java.util.logging.Logger.getLogger(Renovar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Renovar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Renovar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Renovar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Renovar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonGuardar;
    private javax.swing.JComboBox<String> ComboBoxPlan;
    private javax.swing.JLabel LabelInformacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textCodigo;
    // End of variables declaration//GEN-END:variables
}
