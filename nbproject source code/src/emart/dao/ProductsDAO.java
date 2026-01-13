/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emart.dao;

import emart.dbutil.DBConnection;
import emart.pojo.ProductsPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WELCOME
 */
public class ProductsDAO {
     public static String getNextProductId()throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("Select max(p_id) from products");
        rs.next();
        String productId=rs.getString(1);
        if(productId==null)
            return "P101";
        int productno=Integer.parseInt(productId.substring(1));
        productno=productno+1;
        return "P"+productno;
    }   
    public static boolean addProduct(ProductsPojo p) throws SQLException
    {
       Connection conn = DBConnection.getConnection();
       PreparedStatement ps = conn.prepareStatement(
           "INSERT INTO products VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
       );
    
       ps.setString(1, p.getProductId());
       ps.setString(2, p.getProductName());
       ps.setString(3, p.getProductCompany());
       ps.setDouble(4, p.getProductPrice());
       ps.setDouble(5, p.getOurPrice());
       ps.setInt(6, p.getTax());
       ps.setInt(7, p.getQuantity());
       ps.setString(8, p.getMfg_date());
       ps.setString(9, p.getExp_date());
       ps.setString(10, "y"); // Default status is 'y'
    
    return ps.executeUpdate() == 1;


    }
    public static List<ProductsPojo> getProductDetails() throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("Select * from products where status='y' order by p_id");
        ArrayList <ProductsPojo> productsList=new ArrayList <>();
        while(rs.next())
        {
            ProductsPojo p=new ProductsPojo();
            p.setProductId(rs.getString(1));
            p.setProductName(rs.getString(2));
            p.setProductCompany(rs.getString(3));
            p.setProductPrice(rs.getDouble(4));
            p.setOurPrice(rs.getDouble(5));
            p.setTax(rs.getInt(6));
            p.setQuantity(rs.getInt(7));
            p.setMfg_date(rs.getString(8));  
            p.setExp_date(rs.getString(9)); 
            productsList.add(p);
        }
        return productsList;
    }
    public static boolean deleteProduct(String productId)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement( "update products set status='N' where p_id=?");
        ps.setString(1, productId);
        return ps.executeUpdate()==1;
    }
    public static boolean updateProduct(ProductsPojo p)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement( "update products set p_name=?,p_companyname=?,p_price=?,our_price=?,p_tax=?,quantity=? where p_id=?");
        
        ps.setString(1, p.getProductName());
        ps.setString(2, p.getProductCompany());
        ps.setDouble(3, p.getProductPrice());
        ps.setDouble(4, p.getOurPrice());
        ps.setInt(5, p.getTax());
        ps.setInt(6, p.getQuantity());
        ps.setString(7, p.getProductId());
        return ps.executeUpdate()==1;
    }
    
   public static ProductsPojo getProductDetails(String id) throws SQLException {
    Connection conn = DBConnection.getConnection();
    PreparedStatement ps = conn.prepareStatement("SELECT * FROM products WHERE p_id=? AND status='y'");
    ps.setString(1, id);
    ResultSet rs = ps.executeQuery();
    ProductsPojo p = new ProductsPojo();
    if(rs.next())
    {
            p.setProductId(rs.getString(1));
            p.setProductName(rs.getString(2));
            p.setProductCompany(rs.getString(3));
            p.setProductPrice(rs.getDouble(4));
            p.setOurPrice(rs.getDouble(5));
            p.setTax(rs.getInt(6));
            p.setQuantity(rs.getInt(7));
            p.setMfg_date(rs.getString(8));  
            p.setExp_date(rs.getString(9)); 
            
            
    }
    return p;
}
   public static boolean updateStocks(List<ProductsPojo>productsList)throws SQLException
   {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Update products set quantity=quantity-? where p_id=?"); 
        int x=0;
        for(ProductsPojo p:productsList)
        {
            ps.setInt(1, p.getQuantity());
            ps.setString(2, p.getProductId());
            int rows=ps.executeUpdate();
            if(rows!=0)
                x++;
        }
        return x==productsList.size();
   }
    //   AVAILABLE STOCK (quantity >= 10)
public static List<ProductsPojo> getAvailableStock() throws SQLException {
    Connection conn = DBConnection.getConnection();
    PreparedStatement ps = conn.prepareStatement(
        "SELECT * FROM products WHERE status='y' AND quantity >= 10 ORDER BY p_id"
    );
    ResultSet rs = ps.executeQuery();
    
    ArrayList<ProductsPojo> list = new ArrayList<>();
    while(rs.next()) {
        ProductsPojo p = new ProductsPojo();
        p.setProductId(rs.getString(1));
        p.setProductName(rs.getString(2));
        p.setProductCompany(rs.getString(3));
        p.setProductPrice(rs.getDouble(4));
        p.setOurPrice(rs.getDouble(5));
        p.setTax(rs.getInt(6));
        p.setQuantity(rs.getInt(7));
        p.setMfg_date(rs.getString(8));
        p.setExp_date(rs.getString(9));
        list.add(p);
    }
    return list;
}


//  LOW STOCK (quantity < 10)
public static List<ProductsPojo> getLowStock() throws SQLException {
    Connection conn = DBConnection.getConnection();
    PreparedStatement ps = conn.prepareStatement(
        "SELECT * FROM products WHERE status='y' AND quantity < 10 ORDER BY p_id"
    );
    ResultSet rs = ps.executeQuery();
    
    ArrayList<ProductsPojo> list = new ArrayList<>();
    while(rs.next()) {
        ProductsPojo p = new ProductsPojo();
        p.setProductId(rs.getString(1));
        p.setProductName(rs.getString(2));
        p.setProductCompany(rs.getString(3));
        p.setProductPrice(rs.getDouble(4));
        p.setOurPrice(rs.getDouble(5));
        p.setTax(rs.getInt(6));
        p.setQuantity(rs.getInt(7));
        p.setMfg_date(rs.getString(8));
        p.setExp_date(rs.getString(9));
        list.add(p);
    }
    return list;
}


//  EXPIRED STOCK (exp_date < today)
public static List<ProductsPojo> getExpiredStock() throws SQLException {
    Connection conn = DBConnection.getConnection();
    PreparedStatement ps = conn.prepareStatement(
        "SELECT * FROM products WHERE status='y' AND exp_date < CURDATE() ORDER BY p_id"
    );
    ResultSet rs = ps.executeQuery();
    
    ArrayList<ProductsPojo> list = new ArrayList<>();
    while(rs.next()) {
        ProductsPojo p = new ProductsPojo();
        p.setProductId(rs.getString(1));
        p.setProductName(rs.getString(2));
        p.setProductCompany(rs.getString(3));
        p.setProductPrice(rs.getDouble(4));
        p.setOurPrice(rs.getDouble(5));
        p.setTax(rs.getInt(6));
        p.setQuantity(rs.getInt(7));
        p.setMfg_date(rs.getString(8));
        p.setExp_date(rs.getString(9));
        list.add(p);
    }
    return list;
}

   
   public static void inactiveExpiredProducts() throws SQLException {
    Connection conn = DBConnection.getConnection();
    PreparedStatement ps = conn.prepareStatement(
        "UPDATE products SET status='N' WHERE exp_date < CURDATE()" 
    );
    ps.executeUpdate();
}
   

}
