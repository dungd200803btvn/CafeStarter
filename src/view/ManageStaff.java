/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.StaffDao;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dungpc
 */
public class ManageStaff extends javax.swing.JFrame {

    /**
     * Creates new form Manage_Staff
     */
    public ManageStaff() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rbtnCurrent = new javax.swing.JRadioButton();
        rbtnAll = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStaff = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/staff.jpg"))); // NOI18N
        jLabel1.setText("Manage Staff");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        buttonGroup1.add(rbtnCurrent);
        rbtnCurrent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbtnCurrent.setForeground(new java.awt.Color(255, 255, 255));
        rbtnCurrent.setText("Current");
        rbtnCurrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCurrentActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnCurrent, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 98, -1));

        buttonGroup1.add(rbtnAll);
        rbtnAll.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rbtnAll.setForeground(new java.awt.Color(255, 255, 255));
        rbtnAll.setText("All");
        rbtnAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAllActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 98, -1));

        tblStaff.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Full Name", "Sex", "Birth Date", "Phone Number", "Position", "Monthly Salary"
            }
        ));
        tblStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStaffMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStaff);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 143, 1040, 440));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 610, 101, -1));

        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view edit delete product.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 670, 101, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/full-page-background.PNG"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -22, 1440, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        rbtnCurrent.setSelected(true);
        loadStaffList();
    }//GEN-LAST:event_formComponentShown

    private void rbtnCurrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCurrentActionPerformed
        loadStaffList();
    }//GEN-LAST:event_rbtnCurrentActionPerformed

    private void rbtnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAllActionPerformed
        loadStaffList();
    }//GEN-LAST:event_rbtnAllActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        new AddOrEditStaff(this).setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStaffMouseClicked
        if (tblStaff.getSelectedRow() != -1) {
            btnEdit.setVisible(true);
        } else {
            btnEdit.setVisible(false);
        }
    }//GEN-LAST:event_tblStaffMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        new AddOrEditStaff((Integer) tblStaff.getValueAt(tblStaff.getSelectedRow(), 0), this).setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    void loadStaffList() {
        DefaultTableModel tableModel = (DefaultTableModel) tblStaff.getModel();
        tableModel.setRowCount(0);
        if (rbtnCurrent.isSelected()) {
            StaffDao.getInstance().getCurrentStaff().forEach(s -> {
                tableModel.addRow(new Object[]{
                    s.getId(),
                    s.getFullName(),
                    s.getSex(),
                    s.getBirthDate().toString(),
                    s.getPhoneNumber(),
                    s.getPosition(),
                    "$ %.2f".formatted(s.getMonthlySalary())
                });
            });
        } else {
            StaffDao.getInstance().getAllStaff().forEach(s -> {
                tableModel.addRow(new Object[]{
                    s.getId(),
                    s.getFullName(),
                    s.getSex(),
                    s.getBirthDate().toString(),
                    s.getPhoneNumber(),
                    s.getPosition(),
                    "$ %.2f".formatted(s.getMonthlySalary())
                });
            });
        }
        btnEdit.setVisible(false);
    }

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
            java.util.logging.Logger.getLogger(ManageStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageStaff().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEdit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtnAll;
    private javax.swing.JRadioButton rbtnCurrent;
    private javax.swing.JTable tblStaff;
    // End of variables declaration//GEN-END:variables
}
