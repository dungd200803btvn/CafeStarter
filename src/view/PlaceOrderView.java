/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import dao.CartDao;
import dao.DeliveryInfoDao;
import dao.OrderDao;
import dao.PaymentInfoDao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cart;
import model.DeliveryInfo;
import model.Order;
import model.PaymentInfo;
import model.User;

/**
 *
 * @author Dungpc
 */
public class PlaceOrderView extends javax.swing.JFrame {

    private int userId;
    private Cart cart;
    private Menu menuView;

    /**
     * Creates new form PlaceOrder_Final
     */
    public PlaceOrderView() {
        initComponents();
    }

    public PlaceOrderView(int userId, Cart cart, Menu menuView) {
        this();
        this.userId = userId;
        this.cart = cart;
        this.menuView = menuView;
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItems = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnRemoveDeliveryInfo = new javax.swing.JButton();
        btnAddDeliveryInfo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDelivery = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        rbtnCredit = new javax.swing.JRadioButton();
        rbtnCOD = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPayment = new javax.swing.JTable();
        btnRemovePaymentInfo = new javax.swing.JButton();
        btnAddPaymentInfo = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbxVoucher = new javax.swing.JComboBox<>();
        btnPurchase = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        lblShipCost = new javax.swing.JLabel();
        lblDiscount = new javax.swing.JLabel();
        lblFinalCost = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtNote = new javax.swing.JTextArea();
        btnClose = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("PLACE ORDER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 245, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Item List");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 99, 120, -1));

        tblItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Product Name", "Unit Price", "Quantity", "Total"
            }
        ));
        jScrollPane1.setViewportView(tblItems);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 600, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Total: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 88, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Ship cost: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 620, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Discount:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 660, 88, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Final cost:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 710, 88, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Delivery Info");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, -1, -1));

        btnRemoveDeliveryInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRemoveDeliveryInfo.setText("Remove");
        btnRemoveDeliveryInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveDeliveryInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemoveDeliveryInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1033, 113, -1, -1));

        btnAddDeliveryInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddDeliveryInfo.setText("Add");
        btnAddDeliveryInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDeliveryInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddDeliveryInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1166, 113, -1, -1));

        tblDelivery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Recipient Name", "Phone number", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblDelivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDeliveryMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDelivery);
        if (tblDelivery.getColumnModel().getColumnCount() > 0) {
            tblDelivery.getColumnModel().getColumn(0).setMinWidth(0);
            tblDelivery.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblDelivery.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 480, 130));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Payment Method: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, -1, -1));

        buttonGroup1.add(rbtnCredit);
        rbtnCredit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtnCredit.setText("Credit Cash");
        rbtnCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCreditActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnCredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, 126, -1));

        buttonGroup1.add(rbtnCOD);
        rbtnCOD.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rbtnCOD.setText("Cash on Delivery");
        rbtnCOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCODActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnCOD, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 340, -1, -1));

        tblPayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Owner Name", "Card Number", "Expirement Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPaymentMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblPayment);
        if (tblPayment.getColumnModel().getColumnCount() > 0) {
            tblPayment.getColumnModel().getColumn(0).setMinWidth(0);
            tblPayment.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblPayment.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, 485, 90));

        btnRemovePaymentInfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRemovePaymentInfo.setText("Remove");
        btnRemovePaymentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePaymentInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnRemovePaymentInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 480, -1, -1));

        btnAddPaymentInfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddPaymentInfo.setText("Add");
        btnAddPaymentInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPaymentInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddPaymentInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 480, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Voucher: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Note: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 570, 65, -1));

        cbxVoucher.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(cbxVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 530, 194, -1));

        btnPurchase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnPurchase.setText("Purchase");
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
            }
        });
        getContentPane().add(btnPurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 670, 134, 62));

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTotal.setText("$0,000");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 580, 74, -1));

        lblShipCost.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblShipCost.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblShipCost.setText("$0,000");
        getContentPane().add(lblShipCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 620, 80, -1));

        lblDiscount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDiscount.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDiscount.setText("$0,000");
        getContentPane().add(lblDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 660, 74, -1));

        lblFinalCost.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFinalCost.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblFinalCost.setText("$0,000");
        getContentPane().add(lblFinalCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 710, 74, -1));

        txtNote.setColumns(18);
        txtNote.setRows(4);
        jScrollPane4.setViewportView(txtNote);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 570, -1, -1));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 40, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/images/full-page-background.PNG"))); // NOI18N
        jLabel15.setText("jLabel15");
        jLabel15.setMaximumSize(new java.awt.Dimension(1366, 768));
        jLabel15.setMinimumSize(new java.awt.Dimension(1366, 768));
        jLabel15.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, -1, 980));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    DefaultTableModel tblItemsModel;
    DefaultTableModel tblDeliveryModel;
    DefaultTableModel tblPaymentModel;

    private double total;
    private double shipCost = 1;
    private double discount = 0;
    private double finalCost;

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        loadItems();
        loadDeliveryInfos();
        loadPaymentInfos();

        btnRemoveDeliveryInfo.setVisible(false);
        btnRemovePaymentInfo.setVisible(false);

        rbtnCredit.setSelected(true);

        loadVouchers();
    }//GEN-LAST:event_formComponentShown

    private void btnAddDeliveryInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDeliveryInfoActionPerformed
        new AddDeliveryInfo(userId, this).setVisible(true);
    }//GEN-LAST:event_btnAddDeliveryInfoActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void tblDeliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDeliveryMouseClicked
        if (tblDelivery.getSelectedRow() != -1) {
            btnRemoveDeliveryInfo.setVisible(true);
        } else {
            btnRemoveDeliveryInfo.setVisible(false);
        }
        validateFields();
    }//GEN-LAST:event_tblDeliveryMouseClicked

    private void btnRemoveDeliveryInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveDeliveryInfoActionPerformed
        int ans = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove this delivery info?");
        if (ans != JOptionPane.YES_OPTION) {
            return;
        }
        int id = (Integer) tblDeliveryModel.getValueAt(tblDelivery.getSelectedRow(), 0);
        DeliveryInfoDao.getInstance().remove(id);
        loadDeliveryInfos();
        btnRemoveDeliveryInfo.setVisible(false);
        validateFields();
    }//GEN-LAST:event_btnRemoveDeliveryInfoActionPerformed

    private void btnAddPaymentInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPaymentInfoActionPerformed
        new AddPaymentInfo(userId, this).setVisible(true);
    }//GEN-LAST:event_btnAddPaymentInfoActionPerformed

    private void btnRemovePaymentInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePaymentInfoActionPerformed
        int ans = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove this payment info?");
        if (ans != JOptionPane.YES_OPTION) {
            return;
        }
        int id = (Integer) tblPaymentModel.getValueAt(tblPayment.getSelectedRow(), 0);
        PaymentInfoDao.getInstance().remove(id);
        loadPaymentInfos();
        btnRemovePaymentInfo.setVisible(false);
        validateFields();
    }//GEN-LAST:event_btnRemovePaymentInfoActionPerformed

    private void rbtnCODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCODActionPerformed
//        tblPayment.setEnabled(false);
        tblPayment.setVisible(false);
        validateFields();
    }//GEN-LAST:event_rbtnCODActionPerformed

    private void rbtnCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCreditActionPerformed
//        tblPayment.setEnabled(true);
        tblPayment.setVisible(true);
        validateFields();
    }//GEN-LAST:event_rbtnCreditActionPerformed

    private void tblPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPaymentMouseClicked
        if (tblPayment.getSelectedRow() != -1) {
            btnRemovePaymentInfo.setVisible(true);
        } else {
            btnRemovePaymentInfo.setVisible(false);
        }
        validateFields();
    }//GEN-LAST:event_tblPaymentMouseClicked

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed
        Order order = new Order(cart);
        User user = new User();
        user.setId(userId);
        order.setUser(user);
        order.setTotalCost(Double.parseDouble(lblTotal.getText().substring(2)));
        order.setShipCost(Double.parseDouble(lblShipCost.getText().substring(2)));
        order.setDiscount(Double.parseDouble(lblDiscount.getText().substring(4)));
        DeliveryInfo deliveryInfo = new DeliveryInfo();
        deliveryInfo.setId((Integer) tblDelivery.getValueAt(tblDelivery.getSelectedRow(), 0));
        order.setDeliveryInfo(deliveryInfo);
        if (rbtnCredit.isSelected()) {
            order.setPaymentMethodId(1);
            PaymentInfo paymentInfo = new PaymentInfo();
            paymentInfo.setId((Integer) tblPayment.getValueAt(tblPayment.getSelectedRow(), 0));
            order.setPaymentInfo(paymentInfo);
        } else {
            order.setPaymentMethodId(2);
        }
        OrderDao.getInstance().saveOrder(order);
        setVisible(false);
        cart.getItems().clear();
        menuView.loadCart();
    }//GEN-LAST:event_btnPurchaseActionPerformed

    private void loadItems() {
        tblItemsModel = (DefaultTableModel) tblItems.getModel();
        tblItemsModel.setRowCount(0);
        cart.getItems().forEach(item -> {
            double price;
            int quantity;
            tblItemsModel.addRow(new Object[]{
                tblItems.getRowCount() + 1,
                item.getProduct().getName(),
                price = item.getProduct().getPrice(),
                quantity = item.getQuantity(),
                "%.2f".formatted(price * quantity)
            });
            total += price * quantity;
        });

        updateCosts();
        validateFields();
    }

    private void updateCosts() {
        finalCost = total + shipCost - discount;

        lblTotal.setText("$ %.2f".formatted(total));
        lblShipCost.setText("$ %.2f".formatted(shipCost));
        lblDiscount.setText("- $ %.2f".formatted(discount));
        lblFinalCost.setText("$ %.2f".formatted(finalCost));
    }

    void loadDeliveryInfos() {
        List<DeliveryInfo> infos = DeliveryInfoDao.getInstance().getByUser(userId);
        tblDeliveryModel = (DefaultTableModel) tblDelivery.getModel();
        tblDeliveryModel.setRowCount(0);

        infos.forEach(info -> {
            tblDeliveryModel.addRow(new Object[]{info.getId(), info.getRecipientName(), info.getPhoneNumber(), info.getAddress()});
        });
        validateFields();
    }

    void loadPaymentInfos() {
        List<PaymentInfo> infos = PaymentInfoDao.getInstance().getByUser(userId);
        tblPaymentModel = (DefaultTableModel) tblPayment.getModel();
        tblPaymentModel.setRowCount(0);

        infos.forEach(info -> {
            tblPaymentModel.addRow(new Object[]{info.getId(), info.getOwnerName(), info.getCardNumber(), info.getExpMonth() + "/" + info.getExpYear()});
        });
        validateFields();
    }

    private void loadVouchers() {
        cbxVoucher.addItem("None");
    }

    private void validateFields() {
        if (tblDelivery.getSelectedRow() != -1
                && (rbtnCOD.isSelected() || (rbtnCredit.isSelected() && tblPayment.getSelectedRow() != -1))) {
            btnPurchase.setEnabled(true);
        } else {
            btnPurchase.setEnabled(false);
        }
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
            java.util.logging.Logger.getLogger(PlaceOrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceOrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceOrderView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDeliveryInfo;
    private javax.swing.JButton btnAddPaymentInfo;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JButton btnRemoveDeliveryInfo;
    private javax.swing.JButton btnRemovePaymentInfo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbxVoucher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblDiscount;
    private javax.swing.JLabel lblFinalCost;
    private javax.swing.JLabel lblShipCost;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JRadioButton rbtnCOD;
    private javax.swing.JRadioButton rbtnCredit;
    private javax.swing.JTable tblDelivery;
    private javax.swing.JTable tblItems;
    private javax.swing.JTable tblPayment;
    private javax.swing.JTextArea txtNote;
    // End of variables declaration//GEN-END:variables
}
