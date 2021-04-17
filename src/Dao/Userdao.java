package Dao;

import DButil.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pojo.User;

public class Userdao 
{
    public static boolean validateuser(User user) throws SQLException 
    {
    Connection conn = DBconnection.getConnection();
    PreparedStatement ps = conn.prepareStatement("select * from users where userid = ? and password = ? and usertype = ?");
    ps.setString(1, user.getUserid());
    ps.setString(2, user.getPassword());
    ps.setString(3, user.getUsertype());
    ResultSet rs = ps.executeQuery();
    System.out.println(user.toString());
    return rs.next();
    }
     public static boolean updateUserByUserId(User user) throws SQLException
     {
         
         Connection conn = DBconnection.getConnection();
         PreparedStatement ps = conn.prepareStatement("update users set password = ? where userid = ?");
         ps.setString(1, user.getPassword());
         ps.setString(2, user.getUserid());
         int result = ps.executeUpdate();
         if(result == 1)
         {
            return true;
         }
         return false ;

         
         
     }
}
    

