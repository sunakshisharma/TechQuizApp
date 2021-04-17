package Dao;

import DButil.DBconnection;
import gui.StudentOptionFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import pojo.PerformancePojo;
import pojo.StudentScorePojo;

public class PerformanceDao
{
    public static <String> ArrayList GetAllStudentId()throws SQLException
    {
    ArrayList <String> studentIdList = new ArrayList<>();
    Connection conn = DBconnection.getConnection();
    Statement st = conn.createStatement();
    ResultSet rs = st.executeQuery("select distinct userid from performance ");
    while(rs.next())
    {
    String id = (String) rs.getString(1);
    studentIdList.add(id);
    
    
    }
    return studentIdList;
    
    }
    public static ArrayList <String> getAllExamId(String StudentId)throws SQLException
    {
    ArrayList<String> examIdList = new ArrayList<>();
    Connection conn = DBconnection.getConnection();
    PreparedStatement ps = conn.prepareCall("select examid from performance where userid=?");
    ps.setString(1, StudentId);
    ResultSet rs = ps.executeQuery();
    while(rs.next())
    {
    String id = rs.getString(1);
    examIdList.add(id);
    }
    return examIdList;
    }
    public static StudentScorePojo getScore(String StudentId,String examId)throws SQLException
    {
    Connection conn = DBconnection.getConnection();
    PreparedStatement ps = conn.prepareStatement("Select language,per from Performance where userid=? and examid=?");
    ps.setString(1, StudentId);
    ps.setString(2, examId);
    ResultSet rs = ps.executeQuery();
    rs.next();
    StudentScorePojo scoreObj=new StudentScorePojo();
    scoreObj.setLanguage(rs.getString(1));
    scoreObj.setPer(rs.getDouble(2));
    return scoreObj;

    }
    public static ArrayList<PerformancePojo> getAllData()throws SQLException
    {
       String qry="Select * from Performance";
       ArrayList<PerformancePojo> performanceList=new ArrayList<PerformancePojo>();
       Connection conn = DBconnection.getConnection();
       Statement st = conn.createStatement();
       ResultSet rs=st.executeQuery(qry);
       while(rs.next())
       {
               String userId=rs.getString("userid");
               String examId=rs.getString("examid");
               String language=rs.getString("language");
               int right=rs.getInt("right");
               int wrong=rs.getInt("wrong");
               int unattempted=rs.getInt("unattempted");
               double per=rs.getDouble("per");
               PerformancePojo p=new PerformancePojo(examId,language,userId,right,wrong,unattempted,per);
               performanceList.add(p);
       }
       return performanceList;

    }
    
    public static ArrayList<String>GetAllExamId(String studentId) throws SQLException
    {
    ArrayList<String> examIdList = new ArrayList<>();
    Connection conn = DBconnection.getConnection();
    PreparedStatement ps = conn.prepareStatement("select examid from performance where userid = ?");
    ps.setString(1, studentId);
    ResultSet rs = ps.executeQuery();
    while (rs.next())
    {
    String id = rs.getString(1);
    examIdList.add(id);
    
    }
    return examIdList;
    }
    public static void addPerformance(PerformancePojo performance)throws SQLException
    {
    String qry="Insert into performance values(?,?,?,?,?,?,?)";
    Connection conn=DBconnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
           ps.setString(1, performance.getUserId());
           ps.setString(2, performance.getExamId());
           ps.setInt(3,performance.getRight());
           ps.setInt(4,performance.getWrong());
           ps.setInt(5,performance.getUnattempted());
           ps.setDouble(6,performance.getPer());
           ps.setString(7,performance.getLanguage());
           ps.executeUpdate();
    }

    
}
