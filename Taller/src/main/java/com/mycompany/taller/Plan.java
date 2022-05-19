
package com.mycompany.taller;

import Funcionalidades.PlanDao;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.PlanModel;


public class Plan extends javax.swing.JFrame {

    PlanDao plan = new PlanDao();
    private DefaultTableModel tablaPl;
    public Plan() {
        initComponents();
        this.setLocationRelativeTo(null); 
        this.setResizable(false);
        listarPlan();
    }

    private void listarPlan(){
        ArrayList<PlanModel> listaPlan=new ArrayList();
        listaPlan = plan.listPlan();
        tablaPl = (DefaultTableModel) TablePlan.getModel();
        tablaPl.setRowCount(0);
        Object[] ob = new Object[5];
        for(int i=0; i<listaPlan.size(); i++){
            ob[0]=listaPlan.get(i).getId();
            ob[1]=listaPlan.get(i).getNombrePlan();
            ob[2]=listaPlan.get(i).getCosto();
            ob[3]=listaPlan.get(i).getMeses();
            tablaPl.addRow(ob);
        }
        TablePlan.setModel(tablaPl);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePlan = new javax.swing.JTable();
        ButtonRegistrarPlan = new javax.swing.JButton();
        ButtonActualizarPlan = new javax.swing.JButton();
        ButtonEditarPlan = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(84, 81, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Planes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        TablePlan.setBackground(new java.awt.Color(204, 204, 204));
        TablePlan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Meses", "Costo"
            }
        ));
        jScrollPane1.setViewportView(TablePlan);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 440, 310));

        ButtonRegistrarPlan.setBackground(new java.awt.Color(204, 204, 204));
        ButtonRegistrarPlan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ButtonRegistrarPlan.setForeground(new java.awt.Color(0, 0, 0));
        ButtonRegistrarPlan.setText("Registrar Plan");
        ButtonRegistrarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistrarPlanActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonRegistrarPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 140, 30));

        ButtonActualizarPlan.setBackground(new java.awt.Color(204, 204, 204));
        ButtonActualizarPlan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonActualizarPlan.setForeground(new java.awt.Color(0, 0, 0));
        ButtonActualizarPlan.setText("Actualizar");
        ButtonActualizarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActualizarPlanActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonActualizarPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 110, 30));

        ButtonEditarPlan.setBackground(new java.awt.Color(204, 204, 204));
        ButtonEditarPlan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonEditarPlan.setForeground(new java.awt.Color(0, 0, 0));
        ButtonEditarPlan.setText("Editar");
        ButtonEditarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarPlanActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonEditarPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 110, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Menu Principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRegistrarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistrarPlanActionPerformed
        this.setVisible(true);
        new RegistrarPlan().setVisible(true);
    }//GEN-LAST:event_ButtonRegistrarPlanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ButtonActualizarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActualizarPlanActionPerformed
        listarPlan();
    }//GEN-LAST:event_ButtonActualizarPlanActionPerformed

    private void ButtonEditarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarPlanActionPerformed
        int fila = TablePlan.getSelectedRow();
        int id = Integer.parseInt(this.TablePlan.getValueAt(fila, 0).toString());
        String nombre = TablePlan.getValueAt(fila, 1).toString();
        int meses = Integer.parseInt(TablePlan.getValueAt(fila, 2).toString());
        int costo = Integer.parseInt(TablePlan.getValueAt(fila, 3).toString());
        PlanDao.modificarPlan(fila, id, nombre, meses, costo);
    }//GEN-LAST:event_ButtonEditarPlanActionPerformed

    
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
            java.util.logging.Logger.getLogger(Plan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Plan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Plan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Plan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Plan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonActualizarPlan;
    private javax.swing.JButton ButtonEditarPlan;
    private javax.swing.JButton ButtonRegistrarPlan;
    private javax.swing.JTable TablePlan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
