/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import common.OpenPdf;
import dao.BillDao;
import dao.CategoryDao;
import dao.ProductDao;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Bill;
import model.Category;
import model.Product;

/**
 *
 * @author Admin
 */
public class PlaceOrder extends javax.swing.JFrame {

    private CategoryDao categoryDao = new CategoryDao();
    
    private int billId;
    private double grandTotal;
    private double productPrice;
    private double productTotal;
    private String emailPattern = "^[A-Za-z0-9.]+[@][A-Za-z0-9]+[.][A-Za-z0-9]+$";
    private String mobileNumberPattern = "^[0-9]{10}$";
    private String userEmail;

    /**
     * Creates new form PlaceOrder
     */
    public PlaceOrder() {
        initComponents();
    }

    public PlaceOrder(String userEmail) {
        this();
        this.userEmail = userEmail;
        txtProdName.setEditable(false);
        txtProdPrice.setEditable(false);
        txtProdTotal.setEditable(false);
        btnAddToCart.setEnabled(false);
        btnGenerateBillPrint.setEnabled(false);
        JFormattedTextField tf = ((JSpinner.DefaultEditor) jSpinner1.getEditor()).getTextField();
        tf.setEnabled(false);
    }

    private void filterProductsByCategory(String category) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        List<Product> products = ProductDao.filterByCategory(category);
        products.stream().forEach(p -> model.addRow(new Object[]{p.getName()}));
    }

    private void filterProductsByName(String name, String category) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        List<Product> products = ProductDao.filterByName(name, category);
        products.stream().forEach(p -> model.addRow(new Object[]{p.getName()}));
    }

    private void clearProductFields() {
        txtProdName.setText("");
        txtProdPrice.setText("");
        jSpinner1.setValue(1);
        txtProdTotal.setText("");
        btnAddToCart.setEnabled(false);
    }

    private void validateFields() {
        String customerName = txtCusName.getText();
        String customerMobileNumber = txtCusMobileNo.getText();
        String customerEmail = txtCusEmail.getText();
        if (!customerName.isBlank()
                && customerMobileNumber.matches(mobileNumberPattern)
                && customerEmail.matches(emailPattern)
                && grandTotal > 0.0) {
            btnGenerateBillPrint.setEnabled(true);
        } else {
            btnGenerateBillPrint.setEnabled(false);
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

        jLabel1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCusName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCusMobileNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCusEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtProdName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtProdPrice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        txtProdTotal = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnAddToCart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        lblGrandTotal = new javax.swing.JLabel();
        btnGenerateBillPrint = new javax.swing.JButton();
        lblBillId = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/place order.png"))); // NOI18N
        jLabel1.setText("Place Order");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1334, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bill ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 84, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customer Details:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 122, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 160, -1, -1));

        txtCusName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCusName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCusNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtCusName, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 189, 244, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mobile number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 230, -1, -1));

        txtCusMobileNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCusMobileNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCusMobileNoKeyReleased(evt);
            }
        });
        getContentPane().add(txtCusMobileNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 259, 244, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 300, -1, -1));

        txtCusEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCusEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCusEmailKeyReleased(evt);
            }
        });
        getContentPane().add(txtCusEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 329, 244, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Category");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 84, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 119, 250, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Search");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 160, -1, -1));

        txtSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 189, 250, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 240, 250, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Name");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 84, -1, -1));

        txtProdName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtProdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 119, 225, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Price");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1054, 84, -1, -1));

        txtProdPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtProdPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1054, 119, 224, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Quantity");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 160, -1, -1));

        jSpinner1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 189, 225, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1054, 160, -1, -1));

        txtProdTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtProdTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1054, 189, 224, -1));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btnClear.setText("Clear");
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 240, -1, -1));

        btnAddToCart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add to cart.png"))); // NOI18N
        btnAddToCart.setText("Add to cart");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddToCart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1147, 240, -1, -1));

        jTable2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Price", "Quantity", "Total"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 297, 530, 370));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Grand Total: $");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 690, -1, -1));

        lblGrandTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblGrandTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblGrandTotal.setText("000");
        getContentPane().add(lblGrandTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 690, -1, -1));

        btnGenerateBillPrint.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGenerateBillPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/generate bill _ print.png"))); // NOI18N
        btnGenerateBillPrint.setText("Generate Bill & Print");
        btnGenerateBillPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateBillPrintActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerateBillPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(1082, 685, -1, -1));

        lblBillId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblBillId.setForeground(new java.awt.Color(255, 255, 255));
        lblBillId.setText("--");
        getContentPane().add(lblBillId, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 84, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/full-page-background.PNG"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        setVisible(false);
        new Home(userEmail).setVisible(true);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        billId = BillDao.getNextId();
        lblBillId.setText(String.valueOf(billId));
        List<Category> categories = categoryDao.getAllRecords();
        categories.stream().forEach(c -> jComboBox1.addItem(c.getName()));

        String category = (String) jComboBox1.getSelectedItem();
        filterProductsByCategory(category);
    }//GEN-LAST:event_formComponentShown

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        String name = txtSearch.getText();
        String category = (String) jComboBox1.getSelectedItem();
        filterProductsByName(name, category);
    }//GEN-LAST:event_txtSearchKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String productName = model.getValueAt(index, 0).toString();
        Product product = ProductDao.getByName(productName);

        txtProdName.setText(product.getName());

        productPrice = product.getPrice();
        txtProdPrice.setText(String.valueOf(productPrice));

        jSpinner1.setValue(1);
        productTotal = productPrice;
        txtProdTotal.setText(String.valueOf(productTotal));

        btnAddToCart.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        int quantity = (Integer) jSpinner1.getValue();
        if (quantity <= 1) {
            jSpinner1.setValue(1);
            quantity = 1;
        }
        productTotal = productPrice * quantity;
        txtProdTotal.setText(String.valueOf(productTotal));
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String category = (String) jComboBox1.getSelectedItem();
        filterProductsByCategory(category);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        String name = txtProdName.getText();
        double price = Double.parseDouble(txtProdPrice.getText());
        int quantity = (Integer) jSpinner1.getValue();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.addRow(new Object[]{name, price, quantity, productTotal});
        grandTotal += productTotal;
        lblGrandTotal.setText(String.valueOf(grandTotal));

        clearProductFields();
        validateFields();
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void txtCusNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCusNameKeyReleased
        validateFields();
    }//GEN-LAST:event_txtCusNameKeyReleased

    private void txtCusMobileNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCusMobileNoKeyReleased
        validateFields();
    }//GEN-LAST:event_txtCusMobileNoKeyReleased

    private void txtCusEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCusEmailKeyReleased
        validateFields();
    }//GEN-LAST:event_txtCusEmailKeyReleased

    private void btnGenerateBillPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateBillPrintActionPerformed
        String customerName = txtCusName.getText();
        String customerMobileNumber = txtCusMobileNo.getText();
        String customerEmail = txtCusEmail.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        LocalDate today = LocalDate.now();
        String createdBy = userEmail;

        Bill bill = new Bill();
        bill.setId(billId);
        bill.setName(customerName);
        bill.setEmail(customerEmail);
        bill.setDate(today);
        bill.setTotal(grandTotal);
        bill.setCreatedBy(createdBy);
        BillDao.save(bill);

        String path = "D:\\";
        Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path + "bill_no_" + billId + ".pdf"));
            doc.open();
            
            Paragraph cafeName = new Paragraph("                                                    Cafe Management System\n");
            doc.add(cafeName);
            
            Paragraph starLine = new Paragraph("****************************************************************************************************************\n");
            doc.add(starLine);
            
            Paragraph info = new Paragraph("\tBill ID: " + billId
                    + "\n\tCustomer name: " + customerName
                    + "\n\tTotal paid: " + grandTotal);
            doc.add(info);
            doc.add(starLine);
            
            PdfPTable tb1 = new PdfPTable(4);
            tb1.addCell("Name");
            tb1.addCell("Price");
            tb1.addCell("Quantity");
            tb1.addCell("Total");
            for (int i=0; i<jTable2.getRowCount(); i++) {
                tb1.addCell(jTable2.getValueAt(i, 0).toString());
                tb1.addCell(jTable2.getValueAt(i, 1).toString());
                tb1.addCell(jTable2.getValueAt(i, 2).toString());
                tb1.addCell(jTable2.getValueAt(i, 3).toString());
            }
            doc.add(tb1);
            doc.add(starLine);
            
            Paragraph thanksMsg = new Paragraph("Thanks for purchasing! Hope you visit again!");
            doc.add(thanksMsg);
            
            OpenPdf.openById(billId);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        doc.close();
        setVisible(false);
        new PlaceOrder(userEmail).setVisible(true);
    }//GEN-LAST:event_btnGenerateBillPrintActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        int index = jTable2.getSelectedRow();
        int ans = JOptionPane.showConfirmDialog(null, "Dou you really want to remove this product?", "Select", JOptionPane.YES_NO_OPTION);
        if (ans==0) {
            TableModel model = jTable2.getModel();
            double total = (Double) model.getValueAt(index, 3);
            grandTotal -= total;
            lblGrandTotal.setText(grandTotal+"");
            ((DefaultTableModel) model).removeRow(index);
        }
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlaceOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaceOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnGenerateBillPrint;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblBillId;
    private javax.swing.JLabel lblGrandTotal;
    private javax.swing.JTextField txtCusEmail;
    private javax.swing.JTextField txtCusMobileNo;
    private javax.swing.JTextField txtCusName;
    private javax.swing.JTextField txtProdName;
    private javax.swing.JTextField txtProdPrice;
    private javax.swing.JTextField txtProdTotal;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
