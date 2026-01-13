/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emart.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConnection {
    private static Connection conn;

    static {
        try {
            // Load Oracle Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emart","root","aswin@123");
           // JOptionPane.showMessageDialog(null, "Connection opned successfully!","Success", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (ClassNotFoundException ex) 
        {
            
            JOptionPane.showMessageDialog(null,"Error in loading the  driver","Driver Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(1);
            
        } 
        catch (SQLException ex)
        {
            
            JOptionPane.showMessageDialog(null,"Error in opening Connection ","Db Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            System.exit(1);
            
        }
    }

    public static Connection getConnection() 
    {
        return conn;
    }

    public static void closeConnection() 
    {
        try 
        {
           conn.close();
           JOptionPane.showMessageDialog(null,"Connection closed successfully!","Success",JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error in closing Connection ","Db Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    public static void main(String args[])
    {
        DBConnection.getConnection();
        System.out.println("Program ended.");
    }
}
  