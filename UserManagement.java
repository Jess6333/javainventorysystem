package databaseconnection;
public class UserManagement extends javax.swing.JFrame {

    public UserManagement() {
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

        UserManagementLabel = new javax.swing.JLabel();
        DisplayUserButton = new javax.swing.JButton();
        CreateUserButton = new javax.swing.JButton();
        DeleteUserButton = new javax.swing.JButton();
        ModifyUserButton = new javax.swing.JButton();
        AdminPageButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        BackgrondLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserManagementLabel.setText("User Management");
        getContentPane().add(UserManagementLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 27, -1, -1));

        DisplayUserButton.setText("Search User");
        DisplayUserButton.setPreferredSize(new java.awt.Dimension(128, 28));
        DisplayUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DisplayUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 65, -1, -1));

        CreateUserButton.setText("Create User");
        CreateUserButton.setPreferredSize(new java.awt.Dimension(128, 28));
        CreateUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CreateUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 99, -1, -1));

        DeleteUserButton.setText("Delete User");
        DeleteUserButton.setPreferredSize(new java.awt.Dimension(128, 28));
        DeleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 133, -1, -1));

        ModifyUserButton.setText("Modify User");
        ModifyUserButton.setPreferredSize(new java.awt.Dimension(128, 28));
        ModifyUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyUserButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ModifyUserButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 167, -1, -1));

        AdminPageButton.setText("< Admin Page");
        AdminPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminPageButtonActionPerformed(evt);
            }
        });
        getContentPane().add(AdminPageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 24, -1, -1));

        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 24, -1, -1));

        BackgrondLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/databaseconnection/systembackground.png"))); // NOI18N
        BackgrondLabel.setText("Background");
        getContentPane().add(BackgrondLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminPageButtonActionPerformed
        // TODO add your handling code here:
        new AdminPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_AdminPageButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        // TODO add your handling code here:
        new LoginInterface().setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void DisplayUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayUserButtonActionPerformed
        // TODO add your handling code here:
        // Open DisplayUserTable window and pass the user object
        new DisplayUserTable().setVisible(true);
        dispose();
    }//GEN-LAST:event_DisplayUserButtonActionPerformed

    private void CreateUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateUserButtonActionPerformed
        // TODO add your handling code here:
        new CreateUser().setVisible(true);
        dispose();
    }//GEN-LAST:event_CreateUserButtonActionPerformed

    private void DeleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUserButtonActionPerformed
        // TODO add your handling code here:
        new DeleteUser().setVisible(true);
        dispose();
    }//GEN-LAST:event_DeleteUserButtonActionPerformed

    private void ModifyUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyUserButtonActionPerformed
        // TODO add your handling code here:
        new ModifyUser().setVisible(true);
        dispose();
    }//GEN-LAST:event_ModifyUserButtonActionPerformed

    

       
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
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminPageButton;
    private javax.swing.JLabel BackgrondLabel;
    private javax.swing.JButton CreateUserButton;
    private javax.swing.JButton DeleteUserButton;
    private javax.swing.JButton DisplayUserButton;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JButton ModifyUserButton;
    private javax.swing.JLabel UserManagementLabel;
    // End of variables declaration//GEN-END:variables
}
