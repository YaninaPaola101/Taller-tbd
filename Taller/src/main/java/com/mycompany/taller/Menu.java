/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author rybel
 */
public class Menu extends javax.swing.JFrame {

    private Disciplina disciplina;
    private Horario horario;
    private Instructor instructor;
    private Usuarios usuario;
    private Plan plan;
    private Registro registro;
    private Sucursal sucursal;
    public Menu() {
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
        ButtonSucursal = new javax.swing.JButton();
        ButtonHorario = new javax.swing.JButton();
        ButtonInstructor = new javax.swing.JButton();
        ButtonRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setForeground(new java.awt.Color(0, 153, 153));

        ButtonDisciplina.setBackground(new java.awt.Color(204, 255, 255));
        ButtonDisciplina.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonDisciplina.setForeground(new java.awt.Color(0, 0, 0));
        ButtonDisciplina.setText("Disciplina");
        ButtonDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDisciplinaActionPerformed(evt);
            }
        });

        ButtonPlan.setBackground(new java.awt.Color(204, 255, 255));
        ButtonPlan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonPlan.setForeground(new java.awt.Color(0, 0, 0));
        ButtonPlan.setText("Plan");
        ButtonPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonPlanActionPerformed(evt);
            }
        });

        ButtonUsuario.setBackground(new java.awt.Color(204, 255, 255));
        ButtonUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonUsuario.setForeground(new java.awt.Color(0, 0, 0));
        ButtonUsuario.setText("Usuario");
        ButtonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUsuarioActionPerformed(evt);
            }
        });

        ButtonSucursal.setBackground(new java.awt.Color(204, 255, 255));
        ButtonSucursal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonSucursal.setForeground(new java.awt.Color(0, 0, 0));
        ButtonSucursal.setText("Sucursal");
        ButtonSucursal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSucursalActionPerformed(evt);
            }
        });

        ButtonHorario.setBackground(new java.awt.Color(204, 255, 255));
        ButtonHorario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonHorario.setForeground(new java.awt.Color(0, 0, 0));
        ButtonHorario.setText("Horario");
        ButtonHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHorarioActionPerformed(evt);
            }
        });

        ButtonInstructor.setBackground(new java.awt.Color(204, 255, 255));
        ButtonInstructor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ButtonInstructor.setForeground(new java.awt.Color(0, 0, 0));
        ButtonInstructor.setText("Instructor");
        ButtonInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInstructorActionPerformed(evt);
            }
        });

        ButtonRegistro.setBackground(new java.awt.Color(204, 255, 255));
        ButtonRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonRegistro.setForeground(new java.awt.Color(0, 0, 0));
        ButtonRegistro.setText("Registrar Cliente");
        ButtonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ButtonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(ButtonPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(ButtonInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ButtonHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonSucursal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(ButtonRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonPlan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonInstructor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(ButtonSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 400, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistroActionPerformed
        registro = new Registro();
        registro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonRegistroActionPerformed

    private void ButtonInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInstructorActionPerformed
        instructor = new Instructor();
        instructor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonInstructorActionPerformed

    private void ButtonHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHorarioActionPerformed
        usuario = new Usuarios();
        usuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonHorarioActionPerformed

    private void ButtonSucursalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSucursalActionPerformed
        sucursal = new Sucursal();
        sucursal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonSucursalActionPerformed

    private void ButtonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUsuarioActionPerformed
        usuario = new Usuarios();
        usuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonUsuarioActionPerformed

    private void ButtonPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonPlanActionPerformed
        plan = new Plan();
        plan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonPlanActionPerformed

    private void ButtonDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDisciplinaActionPerformed
        disciplina = new Disciplina();
        disciplina.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDisciplina;
    private javax.swing.JButton ButtonHorario;
    private javax.swing.JButton ButtonInstructor;
    private javax.swing.JButton ButtonPlan;
    private javax.swing.JButton ButtonRegistro;
    private javax.swing.JButton ButtonSucursal;
    private javax.swing.JButton ButtonUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
