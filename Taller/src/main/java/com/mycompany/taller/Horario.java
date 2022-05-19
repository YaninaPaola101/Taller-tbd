
package com.mycompany.taller;


public class Horario extends javax.swing.JFrame {

    
    public Horario() {
        initComponents();
        this.setLocationRelativeTo(null); 
        this.setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableHorario = new javax.swing.JTable();
        ButtonAgregarClase = new javax.swing.JButton();
        ButtonActualizar = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonEliminar = new javax.swing.JButton();
        ButtonMenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(84, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Horario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        TableHorario.setBackground(new java.awt.Color(255, 255, 255));
        TableHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Disciplina", "Instructor", "Hora de inicio", "Hora de fin"
            }
        ));
        jScrollPane1.setViewportView(TableHorario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 400, 330));

        ButtonAgregarClase.setBackground(new java.awt.Color(204, 204, 204));
        ButtonAgregarClase.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtonAgregarClase.setForeground(new java.awt.Color(0, 0, 0));
        ButtonAgregarClase.setText("Agregar Clase");
        ButtonAgregarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarClaseActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonAgregarClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 140, 40));

        ButtonActualizar.setBackground(new java.awt.Color(204, 204, 204));
        ButtonActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonActualizar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonActualizar.setText("Actualizar");
        jPanel1.add(ButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 120, 40));

        ButtonEditar.setBackground(new java.awt.Color(204, 204, 204));
        ButtonEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonEditar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonEditar.setText("Editar");
        jPanel1.add(ButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 120, 40));

        ButtonEliminar.setBackground(new java.awt.Color(204, 204, 204));
        ButtonEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonEliminar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonEliminar.setText("Eliminar");
        jPanel1.add(ButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 120, 40));

        ButtonMenuPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        ButtonMenuPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtonMenuPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        ButtonMenuPrincipal.setText("Menu Principal");
        ButtonMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMenuPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAgregarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarClaseActionPerformed
        this.setVisible(true);
        new AgregarClase().setVisible(true);
    }//GEN-LAST:event_ButtonAgregarClaseActionPerformed

    private void ButtonMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMenuPrincipalActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_ButtonMenuPrincipalActionPerformed

   
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
            java.util.logging.Logger.getLogger(Horario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Horario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Horario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Horario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Horario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonActualizar;
    private javax.swing.JButton ButtonAgregarClase;
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonEliminar;
    private javax.swing.JButton ButtonMenuPrincipal;
    private javax.swing.JTable TableHorario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
