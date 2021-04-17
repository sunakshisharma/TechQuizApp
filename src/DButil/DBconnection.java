package DButil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBconnection 
{
    private static Connection conn;
    static
    {
    try
        {   Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Driver loaded ");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:11521/xe", "onlineexam", "student");
            
        }
       catch (Exception Ex) 
        {
            JOptionPane.showMessageDialog(null,"not able to connect database");
            System.out.println("ERROR = "+Ex);
            System.exit(0);
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
    JOptionPane.showMessageDialog(null,"disconnect");
    }   
    catch (SQLException ex)
    {
            JOptionPane.showMessageDialog(null,"Cant connect to database");
            ex.printStackTrace();
    }
    }
}
