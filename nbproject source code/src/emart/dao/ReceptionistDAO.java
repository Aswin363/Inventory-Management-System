package emart.dao;

import emart.dbutil.DBConnection;
import emart.pojo.ReceptionistPojo;
import emart.pojo.UserPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author WELCOME
 */
public class ReceptionistDAO {
public static Map<String,String> getNonRegisteredReceptionists() throws SQLException {
    Connection conn = DBConnection.getConnection();
    Statement st = conn.createStatement();

    // FIXED QUERY → NULL-safe + correct filtering
    String query = 
        "select empid, empname from employees " +
        "where job='Receptionist' " +
        "and empid not in ( " +
        "   select empid from users where usertype='Receptionist' and empid is not null" +
        ")";

    ResultSet rs = st.executeQuery(query);
    HashMap<String,String> receptionistList = new HashMap<>();

    while(rs.next()) {
        String id = rs.getString("empid");
        String name = rs.getString("empname");
        receptionistList.put(id, name);
    }

    return receptionistList;
}

    public static boolean addReceptionist(UserPojo user) throws SQLException 
    {
       Connection conn = DBConnection.getConnection();
       PreparedStatement ps = conn.prepareStatement( "INSERT INTO users (userid, empid, password, usertype, username) VALUES (?, ?, ?, ?, ?)");

       ps.setString(1, user.getUserid());
       ps.setString(2, user.getEmpid());
       ps.setString(3, user.getPassword());
       ps.setString(4, user.getUsertype());
       ps.setString(5, user.getUsername());
  
       int result = ps.executeUpdate();
       return result == 1;
    }
   public static List<ReceptionistPojo>getAllReceptionistDetails()throws SQLException
   {
       Connection conn=DBConnection.getConnection();
       Statement st=conn.createStatement();
       ResultSet rs = st.executeQuery( "select users.empid,empname,userid,job,salary from users,employees where usertype='Receptionist' and users.empid=employees.empid");
       ArrayList<ReceptionistPojo> al=new ArrayList<>();
        while(rs.next())
        {
            ReceptionistPojo recep=new ReceptionistPojo();
            recep.setEmpid(rs.getString(1));
            recep.setEmpname(rs.getString(2));
            recep.setUserid(rs.getString(3));
            recep.setJob(rs.getString(4));
            recep.setSalary(rs.getDouble(5));
            al.add(recep);
            
        }
        return al;
   }
   public static Map<String,String>getAllReceptionistId()throws SQLException
   {
       
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select userid,username from users where usertype='Receptionist' order by userid");
        HashMap<String,String> receptionistList= new HashMap<>();
        while(rs.next())
        {
            String id=rs.getString(1);
            String name=rs.getString(2);
            receptionistList.put(id, name);
        }
        return receptionistList;
   }
   public static boolean updatePassword(String userid,String pwd)throws SQLException
   {
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps = conn.prepareStatement( "update users set password=? where userid=?");
       ps.setString(1, pwd);
       ps.setString(2, userid);
       return ps.executeUpdate()==1;
   }
   public static List<String> getAllReceptionistUserId()throws SQLException
   {
        Connection conn=DBConnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select userid from users where usertype='Receptionist' order by userid");
        List <String> receptionistList= new ArrayList<>();
        while(rs.next())
        {
            String id=rs.getString(1);
            receptionistList.add(id);
        }
        return receptionistList; 
   }
   public static boolean deleteReceptionist(String userid)throws SQLException
   {
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps = conn.prepareStatement( "delete from users where userid=?");
       ps.setString(1, userid);
       return ps.executeUpdate()==1;
   }
}
