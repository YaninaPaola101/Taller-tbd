/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author rybel
 */
public class MenuAdmi extends javax.swing.JFrame {

    private Disciplinas disciplina;
    private Horario horario;
    private Instructor instructor;
    private Usuarios usuario;
    private Plan plan;
    private RegistroUsuario registro;
    private Sucursal sucursal;
    public MenuAdmi() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ButtonDisciplina = new javax.swing.JButton();
        ButtonPlan = new javax.swing.JButton();
        ButtonUsuario = new javax.swing.JButton();
        ButtonRenovar = new javax.swing.JButton();
        ButtonHorario = new javax.swing.JButton();
        ButtonInstructor = new javax.swing.JButton();
        ButtonSucursal = new javax.swing.JButton();
        ButtonCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(84, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setForeground(new java.awt.Color(0, 153, 153));

        ButtonDisciplina.setBackground(new java.awt.Color(204, 204, 204));
        ButtonDisciplina.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonDisciplina.setForeground(new java.awt.Color(0, 0, 0));
        ButtonDisciplina.setText("Disciplina");
        ButtonDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDisciplinaActionPerformed(evt);
            }
        });

        ButtonPlan.setBackground(new java.awt.Color(204, 204, 204));
        ButtonPlan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonPlan.setForeground(new java.awt.Color(0, 0, 0));
        ButtonPlan.setText("Plan");
        ButtonPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPlanActionPerformed(evt);
            }
        });

        ButtonUsuario.setBackground(new java.awt.Color(204, 204, 204));
        ButtonUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonUsuario.setForeground(new java.awt.Color(0, 0, 0));
        ButtonUsuario.setText("Usuario");
        ButtonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUsuarioActionPerformed(evt);
            }
        });

        ButtonRenovar.setBackground(new java.awt.Color(204, 204, 204));
        ButtonRenovar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonRenovar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonRenovar.setText("Renovar");
        ButtonRenovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRenovarActionPerformed(evt);
            }
        });

        ButtonHorario.setBackground(new java.awt.Color(204, 204, 204));
        ButtonHorario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonHorario.setForeground(new java.awt.Color(0, 0, 0));
        ButtonHorario.setText("Horario");
        ButtonHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHorarioActionPerformed(evt);
            }
        });

        ButtonInstructor.setBackground(new java.awt.Color(204, 204, 204));
        ButtonInstructor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonInstructor.setForeground(new java.awt.Color(0, 0, 0));
        ButtonInstructor.setText("Instructor");
        ButtonInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInstructorActionPerformed(evt);
            }
        });

        ButtonSucursal.setBackground(new java.awt.Color(204, 204, 204));
        ButtonSucursal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonSucursal.setForeground(new java.awt.Color(0, 0, 0));
        ButtonSucursal.setText("Sucursal");

        ButtonCerrarSesion.setBackground(new java.awt.Color(204, 204, 204));
        ButtonCerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonCerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        ButtonCerrarSesion.setText("Cerrar sesion");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ButtonInstructor, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(ButtonUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonHorario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonSucursal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ButtonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ButtonPlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(ButtonRenovar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonRenovar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 490, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInstructorActionPerformed
        instructor = new Instructor();
        instructor.setVisible(true);

    }//GEN-LAST:event_ButtonInstructorActionPerformed

    private void ButtonHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHorarioActionPerformed
        usuario = new Usuarios();
        usuario.setVisible(true);

    }//GEN-LAST:event_ButtonHorarioActionPerformed

    private void ButtonRenovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRenovarActionPerformed
        sucursal = new Sucursal();
        sucursal.setVisible(true);

    }//GEN-LAST:event_ButtonRenovarActionPerformed

    private void ButtonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUsuarioActionPerformed
        usuario = new Usuarios();
        usuario.setVisible(true);

    }//GEN-LAST:event_ButtonUsuarioActionPerformed

    private void ButtonPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPlanActionPerformed
        plan = new Plan();
        plan.setVisible(true);

    }//GEN-LAST:event_ButtonPlanActionPerformed

    private void ButtonDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDisciplinaActionPerformed
        disciplina = new Disciplinas();
        disciplina.setVisible(true);

    }//GEN-LAST:event_ButtonDisciplinaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCerrarSesion;
    private javax.swing.JButton ButtonDisciplina;
    private javax.swing.JButton ButtonHorario;
    private javax.swing.JButton ButtonInstructor;
    private javax.swing.JButton ButtonPlan;
    private javax.swing.JButton ButtonRenovar;
    private javax.swing.JButton ButtonSucursal;
    private javax.swing.JButton ButtonUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
