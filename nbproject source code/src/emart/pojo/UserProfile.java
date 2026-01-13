/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emart.pojo;


public class UserProfile {

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        UserProfile.username = username;
    }

    public static String getUsertype() {
        return usetype;
    }

    public static void setUsertype(String usetype) {
        UserProfile.usetype = usetype;
    }

    public static String getUserid() {
        return userid;
    }

    public static void setUserid(String userid) {
        UserProfile.userid = userid;
    }
    private static String username;
    private static String usetype;
    private static String userid;
    
    
}