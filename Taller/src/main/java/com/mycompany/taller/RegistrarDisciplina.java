/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.taller;

/**
 *
 * @author rybel
 */
public class RegistrarDisciplina extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarDisciplina
     */
    public RegistrarDisciplina() {
        initComponents();
        this.setLocationRelativeTo(null); 
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textInstructor = new javax.swing.JTextField();
        ButtonBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ComboBoxHoraDesde = new javax.swing.JComboBox<>();
        ComboBoxMinutoDesde = new javax.swing.JComboBox<>();
        ComboBoxHoraHasta = new javax.swing.JComboBox<>();
        ComboBoxMinutoHasta = new javax.swing.JComboBox<>();
        ButtonAceptar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(84, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Disciplina");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Instructor:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        textNombre.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 210, 30));

        textInstructor.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(textInstructor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 210, 30));

        ButtonBuscar.setBackground(new java.awt.Color(204, 204, 204));
        ButtonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtonBuscar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonBuscar.setText("Buscar");
        jPanel1.add(ButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 90, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hora Desde:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hora Hasta:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 30));

        ComboBoxHoraDesde.setBackground(new java.awt.Color(204, 204, 204));
        ComboBoxHoraDesde.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(ComboBoxHoraDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 70, 30));

        ComboBoxMinutoDesde.setBackground(new java.awt.Color(204, 204, 204));
        ComboBoxMinutoDesde.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(ComboBoxMinutoDesde, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 70, 30));

        ComboBoxHoraHasta.setBackground(new java.awt.Color(204, 204, 204));
        ComboBoxHoraHasta.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(ComboBoxHoraHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 70, 30));

        ComboBoxMinutoHasta.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(ComboBoxMinutoHasta, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 70, 30));

        ButtonAceptar.setBackground(new java.awt.Color(204, 204, 204));
        ButtonAceptar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonAceptar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonAceptar.setText("Aceptar");
        jPanel1.add(ButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 140, 30));

        ButtonCancelar.setBackground(new java.awt.Color(204, 204, 204));
        ButtonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonCancelar.setText("Cancelar");
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_ButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarDisciplina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAceptar;
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JComboBox<String> ComboBoxHoraDesde;
    private javax.swing.JComboBox<String> ComboBoxHoraHasta;
    private javax.swing.JComboBox<String> ComboBoxMinutoDesde;
    private javax.swing.JComboBox<String> ComboBoxMinutoHasta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textInstructor;
    private javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
