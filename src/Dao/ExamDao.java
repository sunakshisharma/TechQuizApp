package Dao;

import DButil.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import pojo.Exampojo;

public class ExamDao 
{
        public static String getExamId()throws SQLException{
        int rowCount;
        Connection conn=DBconnection.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select count(*) as totalrows from exam");
        rs.next();
        rowCount=rs.getInt(1);
        String newId="EX-"+(rowCount+1);
        return newId;
    }
        public static boolean addExam(Exampojo newExam) throws SQLException
        {
        
        String qry = "insert into exam values(?,?,?)";
        Connection conn = DBconnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1, newExam.getExamId());
        ps.setString(2, newExam.getLanguage());
        ps.setInt(3,newExam.getTotalQuestions());
        int ans = ps.executeUpdate();
        return ans == 1;

        }
        public static ArrayList<String> getExamIdbySubject(String subject) throws SQLException
        {
            Connection conn = DBconnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("select examid from exam where language = ?");
            ps.setString(1, subject);
            ResultSet rs = ps.executeQuery();
            ArrayList <String> examlist = new ArrayList<>();
            while(rs.next())
            {
            examlist.add(rs.getString(1));
            }
            return examlist;
        
        }
        public static int getQuestionCountByExam(String ExamId) throws SQLException
        {
        Connection conn = DBconnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(" select  TOTAL_QUESTION from exam where examid = ? ");
        ps.setString(1, ExamId);
        ResultSet rs =ps.executeQuery();
        rs.next();
        int rowcount = rs.getInt(1);
        return rowcount;
        }
        public static boolean isPaperSet(String subject)throws SQLException
        {
       String qry="Select examid from Exam where language=? ";       
           Connection conn=DBconnection.getConnection();
           PreparedStatement ps=conn.prepareStatement(qry);
           ps.setString(1,subject);
           ResultSet rs=ps.executeQuery();
           return rs.next();
        
        }
       public static ArrayList<String> getExamIdBySubject(String userid,String subject)throws SQLException{
       String qry="Select examid from Exam where language=? minus Select examid from performance where userid=?";
       ArrayList<String> examList=new ArrayList<>();
       Connection conn=DBconnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,subject);
        ps.setString(2,userid);
        ResultSet rs=ps.executeQuery();
       while(rs.next()){
               examList.add(rs.getString(1));
           }
         return examList;        
    }


        
}
