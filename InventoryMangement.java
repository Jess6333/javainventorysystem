package databaseconnection;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author CYBORG 15
 */
public class InventoryMangement extends javax.swing.JFrame {

    /**
     * Creates new form InventoryMangement
     */
    public InventoryMangement() {
        initComponents();
        lbl_userType.setText(Session.userType);
        loadItemTable();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_item = new javax.swing.JTable();
        lbl_itemCode = new javax.swing.JLabel();
        lbl_itemName = new javax.swing.JLabel();
        txt_itemCode = new javax.swing.JTextField();
        txt_itemName = new javax.swing.JTextField();
        lbl_stockQuantity = new javax.swing.JLabel();
        txt_stockQuantity = new javax.swing.JTextField();
        lbl_price = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        lbl_supplierCode = new javax.swing.JLabel();
        txt_supplierCode = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        lbl_userType = new javax.swing.JLabel();
        btn_showLowStock = new javax.swing.JButton();
        cb_selectItemCode = new javax.swing.JComboBox<>();
        lbl_checkStock = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setText("Inventory Management");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 390, -1));

        table_item.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Stock Quantity", "Price", "Supplier Code"
            }
        ));
        table_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_itemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_item);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 94, 430, 330));

        lbl_itemCode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_itemCode.setText("Item Code");
        getContentPane().add(lbl_itemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 105, -1));

        lbl_itemName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_itemName.setText("Item Name");
        getContentPane().add(lbl_itemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 71, -1));

        txt_itemCode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txt_itemCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_itemCodeActionPerformed(evt);
            }
        });
        getContentPane().add(txt_itemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 295, -1));

        txt_itemName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txt_itemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 295, 28));

        lbl_stockQuantity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_stockQuantity.setText("Stock Quantity");
        getContentPane().add(lbl_stockQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 111, -1));

        txt_stockQuantity.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txt_stockQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 295, -1));

        lbl_price.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_price.setText("Price");
        getContentPane().add(lbl_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 37, -1));

        txt_price.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 295, -1));

        lbl_supplierCode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_supplierCode.setText("Supplier Code");
        getContentPane().add(lbl_supplierCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 140, -1));

        txt_supplierCode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txt_supplierCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 410, 295, -1));

        btn_save.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, -1, -1));

        btn_update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, -1, -1));

        btn_reset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, -1, -1));

        btn_close.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_close.setText("Close");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, -1, -1));

        lbl_userType.setBackground(new java.awt.Color(255, 255, 255));
        lbl_userType.setIcon(new javax.swing.ImageIcon("C:\\study\\sem3\\prg2201 object-oriented programming\\group asg\\icon\\profile icon.png")); // NOI18N
        lbl_userType.setOpaque(true);
        getContentPane().add(lbl_userType, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 170, 50));

        btn_showLowStock.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_showLowStock.setText("Show Low Stock Items");
        btn_showLowStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showLowStockActionPerformed(evt);
            }
        });
        getContentPane().add(btn_showLowStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 160, 30));

        cb_selectItemCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_selectItemCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_selectItemCodeActionPerformed(evt);
            }
        });
        getContentPane().add(cb_selectItemCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 100, 30));

        lbl_checkStock.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_checkStock.setText("Check Item Stock");
        getContentPane().add(lbl_checkStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\study\\sem3\\prg2201 object-oriented programming\\group asg\\background\\systembackground.png")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-150, -60, 2500, 1530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        try {
            String itemCode = txt_itemCode.getText().trim();
            String itemName = txt_itemName.getText().trim();
            double price = Double.parseDouble(txt_price.getText().trim());
            String supplierCode = txt_supplierCode.getText().trim();

            if (itemCode.isEmpty() || itemName.isEmpty() || supplierCode.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields must be filled!");
                return;
            }

            ItemDAO.addItem(itemCode, itemName, price, supplierCode);
            JOptionPane.showMessageDialog(this, "Item saved successfully! Stock starts at 0.");
            setVisible(false); //reset by reloading the form
            new InventoryMangement().setVisible(true);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid price format!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error saving item: " + ex.getMessage());
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        try {
            String itemCode = txt_itemCode.getText().trim();
            String itemName = txt_itemName.getText().trim();
            double price = Double.parseDouble(txt_price.getText().trim());
            String supplierCode = txt_supplierCode.getText().trim();

            if (itemCode.isEmpty() || itemName.isEmpty() || supplierCode.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields must be filled!");
                return;
            }

            ItemDAO.updateItemDetails(itemCode, itemName, price, supplierCode);
            JOptionPane.showMessageDialog(this, "Item details updated successfully!");
            // Reset by reloading the form
            setVisible(false);
            new InventoryMangement().setVisible(true); // Assuming InventoryMangement is your form class
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid price format!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error updating item: " + ex.getMessage());
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        setVisible(false); //hide page
        new InventoryMangement().setVisible(true); //clear text field items by calling the same page
    }//GEN-LAST:event_btn_resetActionPerformed

    private void txt_itemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_itemCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_itemCodeActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        if("admin".equalsIgnoreCase(Session.userType)){
            new AdminPage().setVisible(true); //go to admin page if user is admin
        }
        else if ("staff".equalsIgnoreCase(Session.userType)){
            new StaffPage().setVisible(true); //go to staff page if user is staff
        }
        else{
            JOptionPane.showMessageDialog(this,"Unknown user role. Cannot go back.");
        }
    }//GEN-LAST:event_btn_closeActionPerformed

    //shows data in text field for the row clicked
    private void table_itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_itemMouseClicked
        // TODO add your handling code here:
         int selectedRow = table_item.getSelectedRow();
    DefaultTableModel model = (DefaultTableModel) table_item.getModel();

    txt_itemCode.setText(model.getValueAt(selectedRow, 0).toString());
    txt_itemName.setText(model.getValueAt(selectedRow, 1).toString());
    txt_stockQuantity.setText(model.getValueAt(selectedRow, 2).toString());
    txt_price.setText(model.getValueAt(selectedRow, 3).toString());
    txt_supplierCode.setText(model.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_table_itemMouseClicked

    private void btn_showLowStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showLowStockActionPerformed
        // TODO add your handling code here:
        List<Item> itemList = ItemDAO.getAllItemsSortedByCode(); // Fetch fresh data
        List<Item> lowStockItems = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getStockQuantity() < 25) {
                lowStockItems.add(item);
            }
        }

        if (lowStockItems.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No items with low stock (< 25) found.");
        } else {
            StringBuilder message = new StringBuilder("Low Stock Items:\n");
            for (Item item : lowStockItems) {
                message.append("Item Code: ").append(item.getItemCode())
                       .append(", Stock Quantity: ").append(item.getStockQuantity())
                       .append("\n");
            }
            JOptionPane.showMessageDialog(this, message.toString());
        }
    
    }//GEN-LAST:event_btn_showLowStockActionPerformed

    private void cb_selectItemCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_selectItemCodeActionPerformed
        // TODO add your handling code here:
        List<Item> itemList = ItemDAO.getAllItemsSortedByCode(); // Fetch fresh data
        String selectedItemCode = (String) cb_selectItemCode.getSelectedItem();
        String[] columnNames;
        DefaultTableModel model;

        if (selectedItemCode != null && !selectedItemCode.isEmpty()) {
            columnNames = new String[]{"Item Code", "Item Name", "Stock Quantity", "Price", "Supplier Code"};
            model = new DefaultTableModel(columnNames, 0);
            for (Item item : itemList) {
                if (item.getItemCode().equals(selectedItemCode)) {
                    Object[] row = {item.getItemCode(), item.getItemName(), item.getStockQuantity(),
                                item.getPrice(), item.getSupplierCode()};
                    model.addRow(row);
                    break;
                }
            }
        } else {
            // Reset to all items if no selection or empty option
            columnNames = new String[]{"Item Code", "Item Name", "Stock Quantity", "Price", "Supplier Code"};
            model = new DefaultTableModel(columnNames, 0);
            for (Item item : itemList) {
                Object[] row = {item.getItemCode(), item.getItemName(), item.getStockQuantity(),
                                item.getPrice(), item.getSupplierCode()};
                model.addRow(row);
            }
        }

        table_item.setModel(model);
    
    }//GEN-LAST:event_cb_selectItemCodeActionPerformed

    //display data in table
    private void loadItemTable() {
    List<Item> itemList = ItemDAO.getAllItemsSortedByCode(); // from ItemDAO
    String[] columnNames = {"Item Code", "Item Name", "Stock Quantity", "Price", "Supplier Code"};

    // Create table model
    DefaultTableModel model = new DefaultTableModel(columnNames, 0);

    for (Item item : itemList) {
        Object[] row = {
            item.getItemCode(),
            item.getItemName(),
            item.getStockQuantity(),
            item.getPrice(),
            item.getSupplierCode()
        };
        model.addRow(row);
    }

    table_item.setModel(model); // Set the model to your JTable
    
    // Populate combo box with item codes
        cb_selectItemCode.removeAllItems();
        cb_selectItemCode.addItem(""); // Empty option to reset
        for (Item item : itemList) {
            cb_selectItemCode.addItem(item.getItemCode());
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
            java.util.logging.Logger.getLogger(InventoryMangement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryMangement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryMangement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryMangement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryMangement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_showLowStock;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cb_selectItemCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_checkStock;
    private javax.swing.JLabel lbl_itemCode;
    private javax.swing.JLabel lbl_itemName;
    private javax.swing.JLabel lbl_price;
    private javax.swing.JLabel lbl_stockQuantity;
    private javax.swing.JLabel lbl_supplierCode;
    private javax.swing.JLabel lbl_userType;
    private javax.swing.JTable table_item;
    private javax.swing.JTextField txt_itemCode;
    private javax.swing.JTextField txt_itemName;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_stockQuantity;
    private javax.swing.JTextField txt_supplierCode;
    // End of variables declaration//GEN-END:variables
}
