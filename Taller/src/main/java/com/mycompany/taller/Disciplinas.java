
package com.mycompany.taller;

import Funcionalidades.DisciplinaDao;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.DisciplinaModel;
import model.UsuarioModel;


public class Disciplinas extends javax.swing.JFrame {

    DisciplinaDao dis = new DisciplinaDao();
    private DefaultTableModel disciplina;
    public Disciplinas() {
        initComponents();
        this.setLocationRelativeTo(null); 
        this.setResizable(false);
        listarDis();
    }

    private void listarDis(){
        ArrayList<DisciplinaModel> listaDisciplinas=new ArrayList();
        listaDisciplinas = dis.listarDisciplina();
        disciplina = (DefaultTableModel) TableDisciplina.getModel();
        disciplina.setRowCount(0);
        Object[] ob = new Object[2];
        for(int i=0; i<listaDisciplinas.size(); i++){
            ob[0]=listaDisciplinas.get(i).getId();
            ob[1]=listaDisciplinas.get(i).getDisciplina();
            disciplina.addRow(ob);
        }
        TableDisciplina.setModel(disciplina);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDisciplina = new javax.swing.JTable();
        ButtonActualizarDisciplina = new javax.swing.JButton();
        ButtonRegistrarDisciplina = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ButtonEditarDisciplina = new javax.swing.JButton();
        ButtonEliminarDisciplina = new javax.swing.JButton();
        ButtonMenuPrincipal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(84, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        TableDisciplina.setBackground(new java.awt.Color(204, 204, 204));
        TableDisciplina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Disciplina"
            }
        ));
        jScrollPane1.setViewportView(TableDisciplina);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 87, -1, 350));

        ButtonActualizarDisciplina.setBackground(new java.awt.Color(204, 204, 204));
        ButtonActualizarDisciplina.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonActualizarDisciplina.setForeground(new java.awt.Color(0, 0, 0));
        ButtonActualizarDisciplina.setText("Actualizar");
        jPanel1.add(ButtonActualizarDisciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 120, 40));

        ButtonRegistrarDisciplina.setBackground(new java.awt.Color(204, 204, 204));
        ButtonRegistrarDisciplina.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtonRegistrarDisciplina.setForeground(new java.awt.Color(0, 0, 0));
        ButtonRegistrarDisciplina.setText("Registrar Disciplina");
        ButtonRegistrarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistrarDisciplinaActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonRegistrarDisciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 140, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Disciplinas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        ButtonEditarDisciplina.setBackground(new java.awt.Color(204, 204, 204));
        ButtonEditarDisciplina.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonEditarDisciplina.setForeground(new java.awt.Color(0, 0, 0));
        ButtonEditarDisciplina.setText("Editar");
        jPanel1.add(ButtonEditarDisciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 120, 40));

        ButtonEliminarDisciplina.setBackground(new java.awt.Color(204, 204, 204));
        ButtonEliminarDisciplina.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonEliminarDisciplina.setForeground(new java.awt.Color(0, 0, 0));
        ButtonEliminarDisciplina.setText("Eliminar");
        jPanel1.add(ButtonEliminarDisciplina, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 120, 40));

        ButtonMenuPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        ButtonMenuPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtonMenuPrincipal.setForeground(new java.awt.Color(0, 0, 0));
        ButtonMenuPrincipal.setText("Menu Principal");
        ButtonMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMenuPrincipalActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRegistrarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarDisciplinaActionPerformed
        this.setVisible(true);
        new AgregarDisciplina().setVisible(true);
    }//GEN-LAST:event_ButtonRegistrarDisciplinaActionPerformed

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
            java.util.logging.Logger.getLogger(Disciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Disciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Disciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Disciplinas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Disciplinas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonActualizarDisciplina;
    private javax.swing.JButton ButtonEditarDisciplina;
    private javax.swing.JButton ButtonEliminarDisciplina;
    private javax.swing.JButton ButtonMenuPrincipal;
    private javax.swing.JButton ButtonRegistrarDisciplina;
    private javax.swing.JTable TableDisciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
