
package com.mycompany.taller;

import Funcionalidades.PlanDao;
import model.PlanModel;


public class RegistrarPlan extends javax.swing.JFrame {

    
    public RegistrarPlan() {
        initComponents();
        this.setLocationRelativeTo(null); 
        this.setResizable(false);
    }

    private void limpiarPlan(){
        textNombre.setText("");
        textCosto.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textCosto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ComboBoxMeses = new javax.swing.JComboBox(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        ButtonAceptar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();
        jLabelMeses = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(84, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Plan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 30));

        textCosto.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(textCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 210, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Costo:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        ComboBoxMeses.setBackground(new java.awt.Color(204, 204, 204));
        ComboBoxMeses.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(ComboBoxMeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 210, 30));

        ButtonAceptar.setBackground(new java.awt.Color(204, 204, 204));
        ButtonAceptar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonAceptar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonAceptar.setText("Aceptar");
        ButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 130, 30));

        ButtonCancelar.setBackground(new java.awt.Color(204, 204, 204));
        ButtonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonCancelar.setText("Cancelar");
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 130, 30));

        jLabelMeses.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelMeses.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMeses.setText("Meses:");
        jPanel1.add(jLabelMeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        textNombre.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void ButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAceptarActionPerformed
        String nombre = textNombre.getText();
        int costo = Integer.parseInt(textCosto.getText());
        PlanModel planMo = new PlanModel(nombre,costo);
        int meses = (Integer) ComboBoxMeses.getSelectedItem();
        planMo.setMeses(meses);
        PlanDao.registrarPlan(planMo);
        limpiarPlan();
    }//GEN-LAST:event_ButtonAceptarActionPerformed

    
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
            java.util.logging.Logger.getLogger(RegistrarPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarPlan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAceptar;
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JComboBox<String> ComboBoxMeses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelMeses;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textCosto;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
