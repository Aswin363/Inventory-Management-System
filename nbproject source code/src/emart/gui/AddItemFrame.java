/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package emart.gui;

import emart.dao.ProductsDAO;
import emart.pojo.ProductsPojo;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.text.SimpleDateFormat;



/**
 *
 * @author WELCOME
 */
public class AddItemFrame extends javax.swing.JFrame {
    
  
    public AddItemFrame() {
        initComponents();
        this.setLocationRelativeTo(this);
        getNewProductId();
        txtMFGDate.setLocale(java.util.Locale.US);
        txtExpireDate.setLocale(java.util.Locale.US);

    // Fix date format
    txtMFGDate.setDateFormatString("yyyy-MM-dd");
    txtExpireDate.setDateFormatString("yyyy-MM-dd");
        
    }
    private boolean validateInputs()
    {
        return !(txtProductName.getText().isEmpty()||txtProductCompany.getText().isEmpty()|| txtProductPrice.getText().isEmpty()||txtOurPrice.getText().isEmpty()|| txtQuantity.getText().isEmpty()|| txtExpireDate.getDate() == null ||
             txtMFGDate.getDate() == null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtProductCompany = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        jcTax = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        lblPassword1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtExpireDate = new com.toedter.calendar.JDateChooser();
        txtMFGDate = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        txtProductId = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        txtProductPrice = new javax.swing.JTextField();
        txtOurPrice = new javax.swing.JTextField();
        lblEmpId = new javax.swing.JLabel();
        lblUsenName = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(197, 0, 0));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setForeground(java.awt.Color.white);
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 104, 40));

        btnLogout.setBackground(new java.awt.Color(197, 0, 0));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogout.setForeground(java.awt.Color.white);
        btnLogout.setText("Logout");
        btnLogout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogout.setContentAreaFilled(false);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, 104, 40));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Add Item panel");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 27, 320, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 990, 110));

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Add Item");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 30));

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtProductCompany.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel4.add(txtProductCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 210, 40));
        jPanel4.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 210, 40));

        jcTax.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0%", "5%", "18%", "28%", " " }));
        jcTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTaxActionPerformed(evt);
            }
        });
        jPanel4.add(jcTax, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 210, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tax");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 160, 40));

        lblPassword1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPassword1.setForeground(java.awt.Color.white);
        lblPassword1.setText("Expiredate");
        jPanel4.add(lblPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 150, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("MFGDate");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 160, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product Company");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 160, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantity");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 160, 40));
        jPanel4.add(txtExpireDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 210, 40));
        jPanel4.add(txtMFGDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 210, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 470, 370));

        jPanel5.setBackground(new java.awt.Color(204, 0, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtProductId.setEditable(false);
        txtProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIdActionPerformed(evt);
            }
        });
        jPanel5.add(txtProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 210, 40));

        txtProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNameActionPerformed(evt);
            }
        });
        jPanel5.add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 210, 40));
        jPanel5.add(txtProductPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 210, 40));

        txtOurPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOurPriceActionPerformed(evt);
            }
        });
        jPanel5.add(txtOurPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, 40));

        lblEmpId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEmpId.setForeground(java.awt.Color.white);
        lblEmpId.setText("Product Id");
        jPanel5.add(lblEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 40));

        lblUsenName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsenName.setForeground(java.awt.Color.white);
        lblUsenName.setText("Product Name");
        jPanel5.add(lblUsenName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 144, 40));

        lblUserId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUserId.setForeground(java.awt.Color.white);
        lblUserId.setText("Product Price");
        jPanel5.add(lblUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 144, 40));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPassword.setForeground(java.awt.Color.white);
        lblPassword.setText("OurPrice");
        jPanel5.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, 50));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 430, 330));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 990, 410));

        btnAdd.setBackground(new java.awt.Color(204, 0, 0));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd.setForeground(java.awt.Color.white);
        btnAdd.setText("Add");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.setContentAreaFilled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 104, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        ManageStocksFrame msf = new ManageStocksFrame();
        msf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        LoginFrame login=new LoginFrame();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void txtProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       if(!validateInputs())
       {
            JOptionPane.showMessageDialog(null,"Please fill all the columns","Incomplete data!",JOptionPane.ERROR_MESSAGE);
             return;
       }
       try
       {
           int n = jcTax.getSelectedItem().toString().length();
           int tax = Integer.parseInt(jcTax.getSelectedItem().toString().substring(0, n - 1));

           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           String mfgDate = sdf.format(txtMFGDate.getDate());
           String expDate = sdf.format(txtExpireDate.getDate());

           ProductsPojo p = new ProductsPojo();
           p.setProductId(txtProductId.getText().trim());
           p.setProductName(txtProductName.getText().trim());
           p.setProductCompany(txtProductCompany.getText().trim());
           p.setProductPrice(Double.parseDouble(txtProductPrice.getText().trim()));
           p.setOurPrice(Double.parseDouble(txtOurPrice.getText().trim()));
           p.setQuantity(Integer.parseInt(txtQuantity.getText().trim()));
           p.setTax(tax);
           p.setMfg_date(mfgDate);
           p.setExp_date(expDate);
           System.setProperty("file.encoding", "UTF-8");
           java.util.Locale.setDefault(java.util.Locale.ENGLISH);
           boolean result=ProductsDAO.addProduct(p);
           if(result)
           {
               JOptionPane.showMessageDialog(null,"Product added succfully","Error!",JOptionPane.INFORMATION_MESSAGE);
             //  BarCode_IMG_Generator.createImage(txtProductId.getText()+".png",txtProductId.getText());
               cleartext();
               getNewProductId();
               return;
               
           }
            JOptionPane.showMessageDialog(null,"Product not saved!","Not saved!",JOptionPane.ERROR_MESSAGE);
       }
       catch(NumberFormatException ex)
       {
            JOptionPane.showMessageDialog(null,"Plese input numeric values","Conversion Error",JOptionPane.ERROR_MESSAGE);
       }
       catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"DB Error","Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtOurPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOurPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOurPriceActionPerformed

    private void txtProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductIdActionPerformed

    private void jcTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcTaxActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new AddItemFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox jcTax;
    private javax.swing.JLabel lblEmpId;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblUsenName;
    private javax.swing.JLabel lblUserId;
    private com.toedter.calendar.JDateChooser txtExpireDate;
    private com.toedter.calendar.JDateChooser txtMFGDate;
    private javax.swing.JTextField txtOurPrice;
    private javax.swing.JTextField txtProductCompany;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtProductPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

    private void getNewProductId() {
       try
       {
           String pid=ProductsDAO.getNextProductId();
           txtProductId.setText(pid);
                    
       }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"DB Error");
            ex.printStackTrace();
        }
    }

    private void cleartext() {
         txtProductName.setText("");
         txtProductCompany.setText("");
         txtProductPrice.setText("");
         txtOurPrice.setText("");
         txtQuantity.setText("");
         jcTax.setSelectedIndex(0);
         txtMFGDate.setDate(null);
         txtExpireDate.setDate(null);

    }
}
