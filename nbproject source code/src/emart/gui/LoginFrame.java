/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package emart.gui;

import emart.dao.UserDAO;
import emart.pojo.UserPojo;
import emart.pojo.UserProfile;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class LoginFrame extends javax.swing.JFrame
{
   
    String userid,password;
    public LoginFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
       
      
    }//
    private boolean validateInputs()
    {
        userid=txtUserId.getText().trim();
        char[] pwd=txtPassword.getPassword();
        password=String.valueOf(pwd).trim();
        if(userid.isEmpty()|| password.isEmpty())
            return false;
        return true;
        
        
    }
    private String getUserType()
    {
        if (rbManager.isSelected())
        return rbManager.getText();
    else if (rbReceptionist.isSelected())
        return rbReceptionist.getText();
        else
            return null;
             
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jlbluserid = new javax.swing.JLabel();
        jlblpassword = new javax.swing.JLabel();
        btnQuit = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtUserId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        pnlUserType = new javax.swing.JPanel();
        rbManager = new javax.swing.JRadioButton();
        rbReceptionist = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login Panel");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 270, 60));

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel2FocusLost(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 9, -1, -1));

        jlbluserid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbluserid.setForeground(java.awt.Color.white);
        jlbluserid.setText("User ID");
        jPanel4.add(jlbluserid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 110, 30));

        jlblpassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblpassword.setForeground(java.awt.Color.white);
        jlblpassword.setText("Password");
        jPanel4.add(jlblpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 150, 30));

        btnQuit.setBackground(new java.awt.Color(204, 0, 0));
        btnQuit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(255, 255, 255));
        btnQuit.setText("Quit");
        btnQuit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnQuit.setContentAreaFilled(false);
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });
        jPanel4.add(btnQuit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 110, 40));

        btnLogin.setBackground(new java.awt.Color(204, 0, 0));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.setContentAreaFilled(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel4.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 110, 40));

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 240, 40));

        txtUserId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(txtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 240, 40));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 480, 200));

        jLabel3.setBackground(new java.awt.Color(196, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Login Details");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 520, 270));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emart/images/loginImage.png"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(320, 270));
        jLabel8.setMinimumSize(new java.awt.Dimension(320, 270));
        jLabel8.setPreferredSize(new java.awt.Dimension(320, 270));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 320, 270));

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlUserType.setBackground(new java.awt.Color(204, 0, 0));
        pnlUserType.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnlUserType.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rbManager.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(rbManager);
        rbManager.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbManager.setForeground(java.awt.Color.white);
        rbManager.setText("Manager");
        rbManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbManagerActionPerformed(evt);
            }
        });
        pnlUserType.add(rbManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        rbReceptionist.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(rbReceptionist);
        rbReceptionist.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        rbReceptionist.setForeground(java.awt.Color.white);
        rbReceptionist.setText("Receptionist");
        rbReceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbReceptionistActionPerformed(evt);
            }
        });
        pnlUserType.add(rbReceptionist, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        jPanel3.add(pnlUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 850, 100));

        jLabel9.setBackground(new java.awt.Color(204, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("User Type");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 3, 177, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 870, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
                                               
    if(!validateInputs())
    {
        JOptionPane.showMessageDialog(null, "Please fill all the fields!", "Incomplete Data", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String userType = getUserType();
    if (userType == null) 
    {
        JOptionPane.showMessageDialog(null, "Please select usertype!", "Incomplete Data", JOptionPane.ERROR_MESSAGE);
        return;
    }

    UserPojo u = new UserPojo();
    u.setUserid(userid);
    u.setPassword(password);
    u.setUsertype(userType);

    try 
    {
        boolean result = UserDAO.validateUser(u);
        if (result == false) 
        {
            JOptionPane.showMessageDialog(null, "Invalid userid/password/usertype!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        UserProfile.setUserid(userid);              //global profile set karta hai (jise pure project main access karsake)
        UserProfile.setUsertype(userType);

        // Auto Inactivate Expired Products
        try {
            emart.dao.ProductsDAO.inactiveExpiredProducts();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed to update expired products!", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Login Redirect
        if (userType.equalsIgnoreCase("Manager"))
        {
            ManagerOptionsFrame mframe = new ManagerOptionsFrame();
            mframe.setVisible(true);
            this.dispose();
        }
        else
        {
            ReceptionistOptionFrame rframe = new ReceptionistOptionFrame();
            rframe.setVisible(true);
            this.dispose();
        }

    }
    catch(SQLException ex)
    {
        JOptionPane.showMessageDialog(null, "DB Error: " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        ex.printStackTrace();
    }


    
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
                                            
    int ans = JOptionPane.showConfirmDialog(null, 
        "Are you sure you want to quit?", "Confirm", 
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

    if(ans == JOptionPane.YES_OPTION){
        System.exit(0);
    
    }
        
    }//GEN-LAST:event_btnQuitActionPerformed

    private void rbManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbManagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbManagerActionPerformed

    private void rbReceptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbReceptionistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbReceptionistActionPerformed

    private void jPanel2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel2FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2FocusLost

    /**
     * @param args the command line 
     */
    public static void main(String args[])
    {
       java.awt.EventQueue.invokeLater(() -> {
        new LoginFrame().setVisible(true);
    });
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnQuit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel jlblpassword;
    private javax.swing.JLabel jlbluserid;
    private javax.swing.JPanel pnlUserType;
    private javax.swing.JRadioButton rbManager;
    private javax.swing.JRadioButton rbReceptionist;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables

 

 }
    
    
    
    
