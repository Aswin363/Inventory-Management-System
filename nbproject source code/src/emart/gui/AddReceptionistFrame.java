/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package emart.gui;

import emart.dao.ReceptionistDAO;
import emart.pojo.UserPojo;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import java.sql.SQLException;




public class AddReceptionistFrame extends javax.swing.JFrame {
    
   

    Map<String,String>receptionist;
    public AddReceptionistFrame(){
        initComponents();
        loadReceptionistDetails();
        this.setLocationRelativeTo(null); 
    }
   private int validateInputs()

    {
         if(txtPassword.getPassword().length < 4 || txtRePassword.getPassword().length < 4)
             return 0;
         else if(txtUserId.getText().trim().isEmpty())
             return -1;
         return 1;
          
    }
   private boolean isPasswordMatching(String a,String b)
   {
      return a.equals(b);
   }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblEmpId = new javax.swing.JLabel();
        lblUsenName = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();
        txtEmpName = new javax.swing.JTextField();
        lblRePassword = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtRePassword = new javax.swing.JPasswordField();
        jcEmpId = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(255, 0, 0)));
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
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 104, 40));

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
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 104, 40));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Add Receptionist panel");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, 410, 49));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 940, 100));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd.setForeground(java.awt.Color.white);
        btnAdd.setText("Add");
        btnAdd.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.setContentAreaFilled(false);
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, 104, 40));

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmpId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEmpId.setForeground(java.awt.Color.white);
        lblEmpId.setText("Employee Id");
        jPanel3.add(lblEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 135, 28));

        lblUsenName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsenName.setForeground(java.awt.Color.white);
        lblUsenName.setText("Employee Name");
        jPanel3.add(lblUsenName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 144, 27));

        lblUserId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUserId.setForeground(java.awt.Color.white);
        lblUserId.setText("User Id");
        jPanel3.add(lblUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 144, 25));

        txtEmpName.setEditable(false);
        txtEmpName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtEmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 220, 40));

        lblRePassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblRePassword.setForeground(java.awt.Color.white);
        lblRePassword.setText("Re Password");
        jPanel3.add(lblRePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 144, 26));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPassword.setForeground(java.awt.Color.white);
        lblPassword.setText("Password");
        jPanel3.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 144, 25));

        txtUserId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 220, 40));

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 220, 40));

        txtRePassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtRePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRePasswordActionPerformed(evt);
            }
        });
        jPanel3.add(txtRePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 220, 40));

        jcEmpId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcEmpId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEmpIdActionPerformed(evt);
            }
        });
        jPanel3.add(jcEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 220, 40));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 530, 330));

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Employee Details");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 230, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 570, 410));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emart/images/employ.png"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(320, 270));
        jLabel8.setMinimumSize(new java.awt.Dimension(320, 270));
        jLabel8.setPreferredSize(new java.awt.Dimension(320, 270));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 330, 330));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 971, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        ManageReceptionistsFrame mrf = new ManageReceptionistsFrame();
        mrf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginFrame login=new LoginFrame();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void txtEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       int result=validateInputs();
       if(result==0)
       {
           JOptionPane.showMessageDialog(null,"Password must be atleast 4 characters long");
           return;
       }
         if(result==-1)
       {
           JOptionPane.showMessageDialog(null,"UserId cannot be left blank");
           return;
       }
        char []pwd=txtPassword.getPassword();
        char []repwd=txtRePassword.getPassword();
        String spwd=String.valueOf(pwd);
        String srepwd=String.valueOf(repwd);
        if(isPasswordMatching(spwd,srepwd)==false)
        {
            JOptionPane.showMessageDialog(null,"Password do not match");
            return;
        }
        try
        {
            String empid=jcEmpId.getSelectedItem().toString();
            String userid=txtUserId.getText().trim();
            String username=txtEmpName.getText();
            UserPojo u=new UserPojo();
            u.setEmpid(empid);
            u.setUserid(userid);
            u.setUsername(username);
            u.setPassword(spwd);
            u.setUsertype("Receptionist");
            boolean status=ReceptionistDAO.addReceptionist(u);
            if(status)
            {
                JOptionPane.showMessageDialog(null,"Receptionist added successfully!");
                clearText();
                loadReceptionistDetails();
                return;
            }
            JOptionPane.showMessageDialog(null,"Receptionist not added!");                    
        }
        catch(SQLException ex)
        {
             JOptionPane.showMessageDialog(null,"DB Error");
             ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void jcEmpIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEmpIdActionPerformed
        if(jcEmpId.getItemCount()==0)
            return;
        txtEmpName.setText(receptionist.get(jcEmpId.getSelectedItem().toString()));
    }//GEN-LAST:event_jcEmpIdActionPerformed

    private void txtRePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRePasswordActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();

        }
        //</editor-fold>

        /* Create and display the form */
             java.awt.EventQueue.invokeLater(new Runnable() {
             public void run(){
                new AddReceptionistFrame().setVisible(true); 
             }
         });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox<String> jcEmpId;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRePassword;
    private javax.swing.JLabel lblUsenName;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables

    private void loadReceptionistDetails() {
        try
        {
            receptionist=ReceptionistDAO.getNonRegisteredReceptionists();
            if(receptionist.isEmpty())
            {
                JOptionPane.showMessageDialog(null,"No un-regestered receptionist present");
                btnAdd.setEnabled(false);
                return;
            }
            btnAdd.setEnabled(true);
            Set <String> keys=receptionist.keySet();
            Iterator <String> it=keys.iterator();
            jcEmpId.removeAllItems();
            while(it.hasNext())
            {
                jcEmpId.addItem(it.next());
            }
        }
        catch(SQLException ex)
        {
             JOptionPane.showMessageDialog(null,"DB Error");
             ex.printStackTrace();
        }
        
    }

    private void clearText() {
       txtPassword.setText("");
       txtRePassword.setText("");
       txtUserId.setText("");
    }
}
