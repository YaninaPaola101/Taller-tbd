
package com.mycompany.taller;

import Funcionalidades.ClaseDAO;
import Funcionalidades.DisciplinaDao;
import Funcionalidades.InstructorDao;
import Funcionalidades.InstructorDao;
import java.util.ArrayList;
import model.DisciplinaModel;
import model.InstructorModel;

public class AgregarClase extends javax.swing.JFrame {

    
    public AgregarClase() {
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
        ComboBoxInstructor = new javax.swing.JComboBox<>();
        ButtonAgregarClase = new javax.swing.JButton();
        ButtonCancelarClase = new javax.swing.JButton();
        ComboBoxNombre = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        ComboBoxHoraInicio = new javax.swing.JComboBox(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24});
        ComboBoxHoraFin = new javax.swing.JComboBox(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24});
        ComboBoxMinutoFin = new javax.swing.JComboBox(new Integer[]{00, 10, 20, 30, 40, 50});
        jLabel5 = new javax.swing.JLabel();
        ComboBoxMinutoInicio = new javax.swing.JComboBox(new Integer[]{00, 10, 20, 30, 40, 50});

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(84, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar Clase");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 180, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Disciplina:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Instructor:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        ArrayList<InstructorModel> instructor = InstructorDao.getAllInstructor();
        InstructorModel[] instructorModelos = new InstructorModel[instructor.size()];
        for(int i = 0 ; i<instructor.size() ;i++){
            instructorModelos[i]= instructor.get(i);
        }
        ComboBoxInstructor.setBackground(new java.awt.Color(204, 204, 204));
        ComboBoxInstructor.setModel(new javax.swing.DefaultComboBoxModel(instructorModelos));

        ComboBoxNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxInstructorActionPerformed(evt);
            }
        });
        ComboBoxInstructor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxInstructorActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBoxInstructor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 280, 30));

        ButtonAgregarClase.setBackground(new java.awt.Color(204, 204, 204));
        ButtonAgregarClase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonAgregarClase.setForeground(new java.awt.Color(0, 0, 0));
        ButtonAgregarClase.setText("Agregar");
        ButtonAgregarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarClaseActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonAgregarClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 130, 40));

        ButtonCancelarClase.setBackground(new java.awt.Color(204, 204, 204));
        ButtonCancelarClase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonCancelarClase.setForeground(new java.awt.Color(0, 0, 0));
        ButtonCancelarClase.setText("Cancelar");
        ButtonCancelarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarClaseActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonCancelarClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 130, 40));

        ArrayList<DisciplinaModel> disciplina = DisciplinaDao.getAllDisciplina();
        DisciplinaModel[] disciplinasModelos = new DisciplinaModel[disciplina.size()];
        for(int i = 0 ; i<disciplina.size() ;i++){
            disciplinasModelos[i]= disciplina.get(i);
        }
        ComboBoxNombre.setBackground(new java.awt.Color(204, 204, 204));
        ComboBoxNombre.setModel(new javax.swing.DefaultComboBoxModel(disciplinasModelos));
        ComboBoxNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxNombreActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBoxNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 280, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hora Inicio:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        ComboBoxHoraInicio.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(ComboBoxHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 60, 30));

        ComboBoxHoraFin.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(ComboBoxHoraFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 60, 30));

        ComboBoxMinutoFin.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(ComboBoxMinutoFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 60, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hora Fin:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        ComboBoxMinutoInicio.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(ComboBoxMinutoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 60, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarClaseActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_ButtonCancelarClaseActionPerformed

    private void ComboBoxNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxNombreActionPerformed

    private void ComboBoxInstructorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxInstructorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxInstructorActionPerformed

    private void ButtonAgregarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarClaseActionPerformed
        
        DisciplinaModel disciplinaMo = (DisciplinaModel) ComboBoxNombre.getSelectedItem();
        InstructorModel instructorSeleccionado = (InstructorModel) ComboBoxInstructor.getSelectedItem();
        int horaInicio = (Integer) ComboBoxHoraInicio.getSelectedItem();
        int minutoInicio = (Integer) ComboBoxMinutoInicio.getSelectedItem();
        int horaFin = (Integer) ComboBoxHoraFin.getSelectedItem();
        int minutoFin = (Integer) ComboBoxMinutoFin.getSelectedItem();
        String ini = horaInicio+":"+minutoInicio+":00";
        String fin = horaFin+":"+minutoFin+":00";
        
        ClaseDAO.insertarClase(ini, fin, disciplinaMo.getId(), instructorSeleccionado.getId());
    }//GEN-LAST:event_ButtonAgregarClaseActionPerformed

    
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
            java.util.logging.Logger.getLogger(AgregarClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarClase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgregarClase;
    private javax.swing.JButton ButtonCancelarClase;
    private javax.swing.JComboBox<String> ComboBoxHoraFin;
    private javax.swing.JComboBox<String> ComboBoxHoraInicio;
    private javax.swing.JComboBox<String> ComboBoxInstructor;
    private javax.swing.JComboBox<String> ComboBoxMinutoFin;
    private javax.swing.JComboBox<String> ComboBoxMinutoInicio;
    private javax.swing.JComboBox<String> ComboBoxNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
