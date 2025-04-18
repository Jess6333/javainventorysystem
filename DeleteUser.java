package databaseconnection;
import javax.swing.JOptionPane;
public class DeleteUser extends javax.swing.JFrame {

    public DeleteUser() {
        initComponents();
        setLocationRelativeTo(null); // Center the window
        DeleteButton.addActionListener(evt -> deleteUser());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DeleteUserLabel = new javax.swing.JLabel();
        UserIDLabel = new javax.swing.JLabel();
        UserIDField = new javax.swing.JTextField();
        DeleteButton = new javax.swing.JButton();
        UserManagementButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeleteUserLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DeleteUserLabel.setText("Delete User");
        getContentPane().add(DeleteUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 25, -1, -1));

        UserIDLabel.setText("User ID     :");
        UserIDLabel.setPreferredSize(new java.awt.Dimension(82, 28));
        getContentPane().add(UserIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 69, -1, -1));

        UserIDField.setPreferredSize(new java.awt.Dimension(82, 28));
        getContentPane().add(UserIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 69, 100, -1));

        DeleteButton.setText("Delete");
        DeleteButton.setPreferredSize(new java.awt.Dimension(82, 28));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 142, -1, -1));

        UserManagementButton.setText("<User Management");
        UserManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserManagementButtonActionPerformed(evt);
            }
        });
        getContentPane().add(UserManagementButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 25, -1, -1));

        LogoutButton.setText("Logout");
        LogoutButton.setPreferredSize(new java.awt.Dimension(82, 28));
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 23, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/databaseconnection/systembackground.png"))); // NOI18N
        Background.setText("Background");
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        new LoginInterface().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void UserManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserManagementButtonActionPerformed
        // TODO add your handling code here:
        new UserManagement().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UserManagementButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        deleteUser();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void deleteUser() {
        String userID = UserIDField.getText().trim();
        if (userID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a User ID.");
            return;
        }

        try {
            UserDAO.deleteUser(userID);
            JOptionPane.showMessageDialog(this, "User deleted successfully.");
            UserIDField.setText("");
        } catch (RuntimeException ex) {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

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
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JLabel DeleteUserLabel;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JTextField UserIDField;
    private javax.swing.JLabel UserIDLabel;
    private javax.swing.JButton UserManagementButton;
    // End of variables declaration//GEN-END:variables
}
