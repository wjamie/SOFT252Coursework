/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;
import Models.*;
/**
 *
 * @author Walker
 */
public class AdminGUI extends javax.swing.JFrame {

    /**
     * Creates new form PatientGUI
     */
    public AdminGUI() {
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

        btnCreateOwnAccount = new javax.swing.JButton();
        btnAddRemoveStaff = new javax.swing.JButton();
        btnViewRatings = new javax.swing.JButton();
        btnProvideDoctorFeedback = new javax.swing.JButton();
        lblSecretary = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaPatient = new javax.swing.JTextArea();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCreateOwnAccount.setText("Create Own Account");
        btnCreateOwnAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOwnAccountActionPerformed(evt);
            }
        });

        btnAddRemoveStaff.setText("Add/Remove Staff");
        btnAddRemoveStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRemoveStaffActionPerformed(evt);
            }
        });

        btnViewRatings.setText("View Ratings");
        btnViewRatings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewRatingsActionPerformed(evt);
            }
        });

        btnProvideDoctorFeedback.setText("Provide Doctor Feedback");
        btnProvideDoctorFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProvideDoctorFeedbackActionPerformed(evt);
            }
        });

        lblSecretary.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblSecretary.setText("Admin");

        txtAreaPatient.setColumns(20);
        txtAreaPatient.setRows(5);
        jScrollPane1.setViewportView(txtAreaPatient);

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogout)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSecretary, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreateOwnAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddRemoveStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewRatings, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProvideDoctorFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddRemoveStaff, btnCreateOwnAccount, btnProvideDoctorFeedback, btnViewRatings});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSecretary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCreateOwnAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAddRemoveStaff)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnViewRatings)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProvideDoctorFeedback)
                        .addGap(32, 32, 32)))
                .addGap(38, 38, 38)
                .addComponent(btnLogout)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewRatingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewRatingsActionPerformed
        AdminViewRatingsGUI aGo = new AdminViewRatingsGUI();
        AdminGUI aLeave = new AdminGUI();
        aGo.setVisible(true);
        aLeave.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnViewRatingsActionPerformed

    private void btnCreateOwnAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOwnAccountActionPerformed
        AdminCreateOwnAccountGUI aGo = new AdminCreateOwnAccountGUI();
        AdminGUI aLeave = new AdminGUI();
        aGo.setVisible(true);
        aLeave.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnCreateOwnAccountActionPerformed

    private void btnProvideDoctorFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProvideDoctorFeedbackActionPerformed
        AdminProvideFeedbackGUI aGo = new AdminProvideFeedbackGUI();
        AdminGUI aLeave = new AdminGUI();
        aGo.setVisible(true);
        aLeave.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnProvideDoctorFeedbackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginGUI loginGUIInstance = new LoginGUI();
        AdminGUI adminGUIInstance = new AdminGUI();
        loginGUIInstance.setVisible(true);
        adminGUIInstance.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAddRemoveStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRemoveStaffActionPerformed
        AdminAddRemoveStaffGUI aGo = new AdminAddRemoveStaffGUI();
        AdminGUI aLeave = new AdminGUI();
        aGo.setVisible(true);
        aLeave.setVisible(false);
        dispose();
    }//GEN-LAST:event_btnAddRemoveStaffActionPerformed

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
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRemoveStaff;
    private javax.swing.JButton btnCreateOwnAccount;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProvideDoctorFeedback;
    private javax.swing.JButton btnViewRatings;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSecretary;
    private javax.swing.JTextArea txtAreaPatient;
    // End of variables declaration//GEN-END:variables
}
