/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package emart.gui;


import emart.dao.ReceptionistDAO;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author WELCOME
 */
public class UpdateReceptionistFrame extends javax.swing.JFrame {
    
   
    Map<String,String> receptionist;
    String password;
    
    public UpdateReceptionistFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        loadReceptionistDetails();
    }

    private void loadReceptionistDetails() {
        try
        {
            receptionist=ReceptionistDAO.getAllReceptionistId();
            jcReceptionistId.removeAllItems(); 
            if(receptionist.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "NO receptionist present!!");
                return;
            
         }
         Set<String> keys=receptionist.keySet();
         for(String id:keys)
         {
             jcReceptionistId.addItem(id);
         }
         
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DB Error: " , "Error!", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        
    
    }
    private boolean validateInputs()
    {
        char []pwd=txtPassword.getPassword();
        char []rpwd=txtRePassword.getPassword();
        if(pwd.length<4 || rpwd.length<4)
        {
            JOptionPane.showMessageDialog(null,"Password must be atleast 4 characters long");
            return false;
        }
        password=String.valueOf(pwd);
        String repassword=String.valueOf(rpwd);
        if(!password.equals(repassword))
        {
            JOptionPane.showMessageDialog(null,"Password  not match");
            return false;
        }
        return true; 
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtReceptionistName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcReceptionistId = new javax.swing.JComboBox();
        txtPassword = new javax.swing.JPasswordField();
        txtRePassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(197, 0, 0));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setForeground(java.awt.Color.white);
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 40, 104, 40));

        btnLogout.setBackground(new java.awt.Color(197, 0, 0));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogout.setForeground(java.awt.Color.white);
        btnLogout.setText("Logout");
        btnLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogout.setContentAreaFilled(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 104, 40));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Update Receptionist Panel");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 23, 380, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 970, 140));

        btnUpdate.setBackground(new java.awt.Color(204, 0, 0));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUpdate.setForeground(java.awt.Color.white);
        btnUpdate.setText("Update");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 104, 40));

        jPanel5.setBackground(new java.awt.Color(204, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Receptionist Id");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 135, 28));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Receptionist Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 170, 27));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Password");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 144, 25));

        txtReceptionistName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtReceptionistName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReceptionistNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtReceptionistName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 220, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Re Password");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 144, 26));

        jcReceptionistId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcReceptionistId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcReceptionistIdActionPerformed(evt);
            }
        });
        jPanel3.add(jcReceptionistId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 220, 40));

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel3.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 220, 40));

        txtRePassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txtRePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 220, 40));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 560, 280));

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Employee Details");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 610, 360));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emart/images/employ.png"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(320, 270));
        jLabel8.setMinimumSize(new java.awt.Dimension(320, 270));
        jLabel8.setPreferredSize(new java.awt.Dimension(320, 270));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 330, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 596));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        ManageReceptionistsFrame mrf = new ManageReceptionistsFrame();
        mrf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        
        LoginFrame login = new LoginFrame();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jcReceptionistIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcReceptionistIdActionPerformed
        String userid=jcReceptionistId.getSelectedItem().toString();
        String recepname=receptionist.get(userid);
        txtReceptionistName.setText(recepname);
    }//GEN-LAST:event_jcReceptionistIdActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(!validateInputs())
            return;
                  
                
        try
        {
            String userid=jcReceptionistId.getSelectedItem().toString();
            boolean result=ReceptionistDAO.updatePassword(userid, password);
            if (result)
            {
                JOptionPane.showMessageDialog(null, "Password changed successfully");
                clearText();
                jcReceptionistId.setSelectedIndex(0); 
                return;
            }
                JOptionPane.showMessageDialog(null, "Password not changed!");
                clearText();

        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "DB Error: " + ex, "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtReceptionistNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReceptionistNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReceptionistNameActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
           ex.printStackTrace();
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new UpdateReceptionistFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox jcReceptionistId;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtReceptionistName;
    // End of variables declaration//GEN-END:variables

    private void clearText() {
       txtPassword.setText("");
       txtRePassword.setText("");
           
    }

    
}
