package emart.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DatabaseSetup {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String DB_NAME = "emart";
    private static final String DB_USER = "root"; 
    private static final String DB_PASS = "aswin@123"; 

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            st = conn.createStatement();

            st.executeUpdate("CREATE DATABASE IF NOT EXISTS " + DB_NAME);
            st.executeUpdate("USE " + DB_NAME);

            st.executeUpdate(
                "CREATE TABLE IF NOT EXISTS employees ("
              + "empid VARCHAR(20) NOT NULL,"
              + "empname VARCHAR(50) NOT NULL,"
              + "job VARCHAR(30),"
              + "salary DECIMAL(10,2),"
              + "CONSTRAINT EMP_PK PRIMARY KEY(empid)"
              + ");"
            );

            st.executeUpdate(
                "CREATE TABLE IF NOT EXISTS users ("
              + "userid VARCHAR(20) NOT NULL,"
              + "empid VARCHAR(20),"
              + "password VARCHAR(50) NOT NULL,"
              + "usertype VARCHAR(30),"
              + "username VARCHAR(50),"
              + "CONSTRAINT USERS_PK PRIMARY KEY(userid),"
              + "CONSTRAINT USERS_EMP_FK FOREIGN KEY(empid) "
              + "REFERENCES employees(empid) "
              + "ON DELETE SET NULL ON UPDATE CASCADE"
              + ");"
            );

            st.executeUpdate(
                "CREATE TABLE IF NOT EXISTS products ("
              + "p_id VARCHAR(20) NOT NULL,"
              + "p_name VARCHAR(100) NOT NULL,"
              + "p_companyname VARCHAR(100),"
              + "p_price DECIMAL(10,2),"
              + "our_price DECIMAL(10,2),"
              + "p_tax INT,"
              + "quantity INT,"
              + "mfg_date DATE,"          
              + "exp_date DATE," 
              + "status CHAR(1),"
              + "CONSTRAINT PROD_PK PRIMARY KEY(p_id)"
              + ");"
            );

            st.executeUpdate(
                "CREATE TABLE IF NOT EXISTS orders ("
              + "order_id VARCHAR(20) NOT NULL,"
              + "p_id VARCHAR(20) NOT NULL,"
              + "quantity INT,"
              + "userid VARCHAR(20),"
              + "CONSTRAINT ORD_PK PRIMARY KEY(order_id, p_id),"
              + "CONSTRAINT ORD_PROD_FK FOREIGN KEY(p_id) "
              + "REFERENCES products(p_id) "
              + "ON DELETE CASCADE ON UPDATE CASCADE,"
              + "CONSTRAINT ORD_USER_FK FOREIGN KEY(userid) "
              + "REFERENCES users(userid) "
              + "ON DELETE SET NULL ON UPDATE CASCADE"
              + ");"
            );

            JOptionPane.showMessageDialog(null, "Database and tables created successfully!");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + e.getMessage());
        } finally {
            try {
                if (st != null) st.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {}
        }
    }
}
