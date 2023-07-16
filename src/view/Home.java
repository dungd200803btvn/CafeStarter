/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.UserDao;
import javax.swing.JOptionPane;

/**
 *
 * @author Dungpc
 */
public class Home extends javax.swing.JFrame {

    private String email;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    public Home(String userEmail) {
        initComponents();
        email = userEmail;
        System.out.println(email);
        if (!email.equals("admin@email.com")) {
            btnCategory.setVisible(false);
            btnNewProduct.setVisible(false);
            btnViewEditDeleteProduct.setVisible(false);
            btnVerifyUsers.setVisible(false);
            btnOrder.setVisible(false);
            btnVoucher.setVisible(false);
            btnStaff.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnMyOrders = new javax.swing.JButton();
        btnViewMenu = new javax.swing.JButton();
        btnChangeSecQuestion = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnCategory = new javax.swing.JButton();
        btnNewProduct = new javax.swing.JButton();
        btnViewEditDeleteProduct = new javax.swing.JButton();
        btnVerifyUsers = new javax.swing.JButton();
        btnChangePassword = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        btnVoucher = new javax.swing.JButton();
        btnStaff = new javax.swing.JButton();
        btnProfile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, -1, -1));

        btnMyOrders.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMyOrders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view edit delete product.png"))); // NOI18N
        btnMyOrders.setText("My Orders");
        btnMyOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMyOrdersActionPerformed(evt);
            }
        });
        getContentPane().add(btnMyOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

        btnViewMenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        btnViewMenu.setText("View Menu");
        btnViewMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

        btnChangeSecQuestion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChangeSecQuestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Security Question.png"))); // NOI18N
        btnChangeSecQuestion.setText("Change Security Question");
        btnChangeSecQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeSecQuestionActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangeSecQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, -1, -1));

        btnCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        btnCategory.setText("Manage Category");
        btnCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 620, -1, -1));

        btnNewProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNewProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new product.png"))); // NOI18N
        btnNewProduct.setText("New Product");
        btnNewProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnNewProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, -1, -1));

        btnViewEditDeleteProduct.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnViewEditDeleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view edit delete product.png"))); // NOI18N
        btnViewEditDeleteProduct.setText("View,Edit & Delete Product");
        btnViewEditDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEditDeleteProductActionPerformed(evt);
            }
        });
        getContentPane().add(btnViewEditDeleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 620, -1, -1));

        btnVerifyUsers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVerifyUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verify users.png"))); // NOI18N
        btnVerifyUsers.setText("Verify Users");
        btnVerifyUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyUsersActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerifyUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 690, -1, -1));

        btnChangePassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/change Password.png"))); // NOI18N
        btnChangePassword.setText("Change Password");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        btnOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        btnOrder.setText("Manage Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 690, -1, -1));

        btnVoucher.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVoucher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        btnVoucher.setText("Manage Voucher");
        btnVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoucherActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 690, -1, -1));

        btnStaff.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        btnStaff.setText("Manage Staff");
        btnStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffActionPerformed(evt);
            }
        });
        getContentPane().add(btnStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 690, -1, -1));

        btnProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        btnProfile.setText("My Profile");
        btnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfileActionPerformed(evt);
            }
        });
        getContentPane().add(btnProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home-background-image.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel1.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMyOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMyOrdersActionPerformed
        new ViewOrManageOrders(UserDao.getInstance().getByEmail(email).getId()).setVisible(true);
    }//GEN-LAST:event_btnMyOrdersActionPerformed

    private void btnViewMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMenuActionPerformed
        new Menu(UserDao.getInstance().getByEmail(email).getId()).setVisible(true);
    }//GEN-LAST:event_btnViewMenuActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Close Application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryActionPerformed
        // TODO add your handling code here:
        new ManageCategory().setVisible(true);
    }//GEN-LAST:event_btnCategoryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to Logout", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNewProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewProductActionPerformed
        // TODO add your handling code here:
        new AddNewProduct().setVisible(true);
    }//GEN-LAST:event_btnNewProductActionPerformed

    private void btnViewEditDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEditDeleteProductActionPerformed
        new ViewEditDeleteProduct().setVisible(true);
    }//GEN-LAST:event_btnViewEditDeleteProductActionPerformed

    private void btnVerifyUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyUsersActionPerformed
        new VerifyUsers().setVisible(true);
    }//GEN-LAST:event_btnVerifyUsersActionPerformed

    private void btnChangeSecQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeSecQuestionActionPerformed
        // TODO add your handling code here:
        new ChangeSecurityQuestion(email).setVisible(true);
    }//GEN-LAST:event_btnChangeSecQuestionActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        new ChangePassword(email).setVisible(true);
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        new ViewOrManageOrders().setVisible(true);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoucherActionPerformed
        new ManageVoucher().setVisible(true);
    }//GEN-LAST:event_btnVoucherActionPerformed

    private void btnStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffActionPerformed
        new ManageStaff().setVisible(true);
    }//GEN-LAST:event_btnStaffActionPerformed

    private void btnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfileActionPerformed
        new ViewProfile(UserDao.getInstance().getByEmail(email).getId()).setVisible(true);
    }//GEN-LAST:event_btnProfileActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategory;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnChangeSecQuestion;
    private javax.swing.JButton btnMyOrders;
    private javax.swing.JButton btnNewProduct;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnProfile;
    private javax.swing.JButton btnStaff;
    private javax.swing.JButton btnVerifyUsers;
    private javax.swing.JButton btnViewEditDeleteProduct;
    private javax.swing.JButton btnViewMenu;
    private javax.swing.JButton btnVoucher;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
