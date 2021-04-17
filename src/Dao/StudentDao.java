package Dao;

import DButil.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import pojo.Student;

public class StudentDao 
{
    
   public static boolean addStudent(Student e) throws SQLException
   {
   Connection conn =DBconnection.getConnection();
   PreparedStatement ps = conn.prepareStatement("insert into users values(?,?,?)");
   ps.setString(1,e.getStudentId());
   ps.setString(2, e.getPwd());
   ps.setString(3, "Student");
   int result = ps.executeUpdate();
   if(result == 1)
   {
    return true;
   }
   return false ;

}
}