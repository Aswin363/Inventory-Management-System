package emart.dao;

import emart.dbutil.DBConnection;
import emart.pojo.OrderPojo;
import emart.pojo.ProductsPojo;
import emart.pojo.UserProfile;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {

    public static String getNextOrderId() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT MAX(order_id) FROM orders");
        rs.next();

        String ordId = rs.getString(1);

        if (ordId == null)
            return "O-101";

        int no = Integer.parseInt(ordId.substring(2));
        no++;

        return "O-" + no;
    }

    public static boolean addOrder(ArrayList<ProductsPojo> list, String ordId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(
            "INSERT INTO orders(order_id, p_id, quantity, userid) VALUES(?,?,?,?)"
        );

        int count = 0;

        for (ProductsPojo p : list) {
            ps.setString(1, ordId);
            ps.setString(2, p.getProductId());
            ps.setInt(3, p.getQuantity());
            ps.setString(4, UserProfile.getUserid());
            count += ps.executeUpdate();
        }

        return count == list.size();
    }

    public static List<String> getOrderIdList() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery("SELECT DISTINCT order_id FROM orders ORDER BY order_id DESC");

        List<String> list = new ArrayList<>();

        while (rs.next()) {
            list.add(rs.getString(1));
        }
        return list;
    }

    public static List<ProductsPojo> getOrderDetailsById(String ordId) throws SQLException {
        Connection conn = DBConnection.getConnection();

        PreparedStatement ps = conn.prepareStatement(
            "SELECT o.p_id, p.p_name, p.p_companyname, p.p_price, p.our_price, " +
            "o.quantity, p.p_tax FROM orders o INNER JOIN products p ON o.p_id = p.p_id " +
            "WHERE o.order_id=?"
        );

        ps.setString(1, ordId);
        ResultSet rs = ps.executeQuery();

        List<ProductsPojo> list = new ArrayList<>();

        while (rs.next()) {
            ProductsPojo p = new ProductsPojo();
            p.setProductId(rs.getString("p_id"));
            p.setProductName(rs.getString("p_name"));
            p.setProductCompany(rs.getString("p_companyname"));
            p.setProductPrice(rs.getDouble("p_price"));
            p.setOurPrice(rs.getDouble("our_price"));
            p.setQuantity(rs.getInt("quantity"));
            p.setTax(rs.getInt("p_tax"));
            list.add(p);
        }
        return list;
    }
}
