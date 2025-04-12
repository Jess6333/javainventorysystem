package databaseconnection;

public class StaffPage extends javax.swing.JFrame {

    public StaffPage() {
        initComponents();
        setLocationRelativeTo(null); // Center the window
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StaffPageLabel = new javax.swing.JLabel();
        InventoryManagementButton = new javax.swing.JButton();
        TransactionManagementButton = new javax.swing.JButton();
        ViewSuppliersBUtton = new javax.swing.JButton();
        ViewHospitalsButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        BackgroundLAbel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        StaffPageLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StaffPageLabel.setText("Staff Page");
        getContentPane().add(StaffPageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        InventoryManagementButton.setText("Inventory Management");
        InventoryManagementButton.setPreferredSize(new java.awt.Dimension(180, 28));
        InventoryManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InventoryManagementButtonActionPerformed(evt);
            }
        });
        getContentPane().add(InventoryManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        TransactionManagementButton.setText("Transaction Management");
        TransactionManagementButton.setPreferredSize(new java.awt.Dimension(182, 28));
        TransactionManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransactionManagementButtonActionPerformed(evt);
            }
        });
        getContentPane().add(TransactionManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        ViewSuppliersBUtton.setText("View Suppliers");
        ViewSuppliersBUtton.setPreferredSize(new java.awt.Dimension(182, 28));
        ViewSuppliersBUtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewSuppliersBUttonActionPerformed(evt);
            }
        });
        getContentPane().add(ViewSuppliersBUtton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        ViewHospitalsButton.setText("View Hospitals");
        ViewHospitalsButton.setPreferredSize(new java.awt.Dimension(182, 28));
        ViewHospitalsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewHospitalsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ViewHospitalsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        LogoutButton.setText("Logout");
        LogoutButton.setPreferredSize(new java.awt.Dimension(82, 28));
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        BackgroundLAbel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/databaseconnection/systembackground.png"))); // NOI18N
        BackgroundLAbel.setText("Background");
        getContentPane().add(BackgroundLAbel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InventoryManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InventoryManagementButtonActionPerformed
        // TODO add your handling code here:
        new InventoryMangement().setVisible(true);
        dispose();
    }//GEN-LAST:event_InventoryManagementButtonActionPerformed

    private void TransactionManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransactionManagementButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TransactionManagementButtonActionPerformed

    private void ViewSuppliersBUttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewSuppliersBUttonActionPerformed
        // TODO add your handling code here:
        new ViewSuppliers().setVisible(true);
        dispose();
    }//GEN-LAST:event_ViewSuppliersBUttonActionPerformed

    private void ViewHospitalsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewHospitalsButtonActionPerformed
        // TODO add your handling code here:
        new ViewHospitals().setVisible(true);
        dispose();
    }//GEN-LAST:event_ViewHospitalsButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        new LoginInterface().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(StaffPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLAbel;
    private javax.swing.JButton InventoryManagementButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel StaffPageLabel;
    private javax.swing.JButton TransactionManagementButton;
    private javax.swing.JButton ViewHospitalsButton;
    private javax.swing.JButton ViewSuppliersBUtton;
    // End of variables declaration//GEN-END:variables
}
