package databaseconnection;
import javax.swing.JOptionPane;
public class ViewHospitals extends javax.swing.JFrame {

    public ViewHospitals() {
        initComponents();
        setLocationRelativeTo(null); // Center the window
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ViewHospitalLabel = new javax.swing.JLabel();
        LogoutButton = new javax.swing.JButton();
        HospitalIDLabel = new javax.swing.JLabel();
        HospitalIDField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        HospitalNameLabel = new javax.swing.JLabel();
        ContactPersonLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        AddressLabel = new javax.swing.JLabel();
        PhoneNoLabel = new javax.swing.JLabel();
        BackgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ViewHospitalLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ViewHospitalLabel.setText("View Hospital");
        getContentPane().add(ViewHospitalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(573, 22, -1, -1));

        HospitalIDLabel.setText("Hospital ID      :");
        HospitalIDLabel.setPreferredSize(new java.awt.Dimension(82, 28));
        getContentPane().add(HospitalIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 57, -1, -1));

        HospitalIDField.setPreferredSize(new java.awt.Dimension(82, 28));
        getContentPane().add(HospitalIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 57, 150, -1));

        SearchButton.setText("Search");
        SearchButton.setPreferredSize(new java.awt.Dimension(82, 28));
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 58, -1, -1));

        HospitalNameLabel.setText("Hospital Name:");
        HospitalNameLabel.setPreferredSize(new java.awt.Dimension(180, 28));
        getContentPane().add(HospitalNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 92, 300, -1));

        ContactPersonLabel.setText("Contact Person :");
        ContactPersonLabel.setPreferredSize(new java.awt.Dimension(300, 28));
        getContentPane().add(ContactPersonLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 200, -1, -1));

        EmailLabel.setText("Email                :");
        EmailLabel.setPreferredSize(new java.awt.Dimension(300, 28));
        getContentPane().add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 132, -1, -1));

        AddressLabel.setText("Address           :");
        AddressLabel.setPreferredSize(new java.awt.Dimension(300, 28));
        getContentPane().add(AddressLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 166, 422, -1));

        PhoneNoLabel.setText("Phone Num      :");
        PhoneNoLabel.setPreferredSize(new java.awt.Dimension(300, 28));
        getContentPane().add(PhoneNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 234, -1, -1));

        BackgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/databaseconnection/systembackground.png"))); // NOI18N
        BackgroundLabel.setText("Background");
        getContentPane().add(BackgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        new LoginInterface().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
        String hospitalID = HospitalIDField.getText().trim();
        if (hospitalID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a hospital ID.");
            return;
        }

        java.util.List<Hospital> hospitals = HospitalDAO.getAllHospitals();
        boolean found = false;
        for (Hospital h : hospitals) {
            if (h.gethospitalCode().equalsIgnoreCase(hospitalID)) {
                HospitalNameLabel.setText("Hospital Name: " + h.gethospitalName());
                EmailLabel.setText("Email                : " + h.getEmail());
                AddressLabel.setText("Address           : " + h.getAddress());
                ContactPersonLabel.setText("Contact Person : " + h.getContactPerson());
                PhoneNoLabel.setText("Phone Num      : " + h.getPhoneNum());
                found = true;
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(this, "Hospital not found.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_SearchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewHospitals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewHospitals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewHospitals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewHospitals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewHospitals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JLabel BackgroundLabel;
    private javax.swing.JLabel ContactPersonLabel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField HospitalIDField;
    private javax.swing.JLabel HospitalIDLabel;
    private javax.swing.JLabel HospitalNameLabel;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel PhoneNoLabel;
    private javax.swing.JButton SearchButton;
    private javax.swing.JLabel ViewHospitalLabel;
    // End of variables declaration//GEN-END:variables
}
