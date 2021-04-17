
package Dao;

import DButil.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import pojo.QuestionPojo;
import pojo.QuestionStore;

public class QuestionDao 
{
    public static void addQuestion(QuestionStore qStore) throws SQLException
    {
        String qry = "insert into questions values(?,?,?,?,?,?,?,?,?)";
        Connection conn = DBconnection.getConnection();
        ArrayList <QuestionPojo> questionList=qStore.getAllQuestions();
       PreparedStatement ps = conn.prepareStatement(qry);
        for(QuestionPojo q:questionList)
        {
            ps.setString(1, q.getExamId());
            ps.setInt(2, q.getQno());
            ps.setString(3, q.getQuestion());
            ps.setString(4,q.getAnswer1());
            ps.setString(5,q.getAnswer2());
            ps.setString(6,q.getAnswer3());
            ps.setString(7,q.getAnswer4());
            ps.setString(8, q.getCorrect_ans());
            ps.setString(9,q.getLanguage());
            ps.executeUpdate();
        }    
    }
    
    
    public static ArrayList <QuestionPojo> getQuestionByExamId(String Examid)throws SQLException
    {
        String qry = "select * from questions where examid = ? order by qno";
        ArrayList <QuestionPojo> questionList = new ArrayList<>();
        Connection conn = DBconnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1, Examid);
        ResultSet rs =ps.executeQuery();
        while(rs.next())
        {
               int qno=rs.getInt(2);
               String question=rs.getString(3);
               String option1=rs.getString(4);
               String option2=rs.getString(5);
               String option3=rs.getString(6);
               String option4=rs.getString(7);
               String correctAnswer=rs.getString(8);
               String language=rs.getString(9);
               QuestionPojo obj=new QuestionPojo(Examid,qno,language,question,option1,option2,option3,option4,correctAnswer);
               questionList.add(obj);      
        
        }
    
        return questionList;
    }
        public static void updateQuestion(QuestionStore qstore) throws SQLException
        {
        ArrayList <QuestionPojo> questionList = qstore.getAllQuestions();
        Connection conn = DBconnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("Update questions set question=?,answer1=?,answer2=?,answer3=?,answer4=?,CORRECT_ANSWER=? where examid=? and qno=?");
        for(QuestionPojo obj : questionList)
        {
        ps.setString(1,obj.getQuestion());
        ps.setString(2,obj.getAnswer1());
        ps.setString(3, obj.getAnswer2());
        ps.setString(4, obj.getAnswer3());
        ps.setString(5, obj.getAnswer4());
        ps.setString(6, obj.getCorrect_ans());
        ps.setString(7, obj.getExamId());
        ps.setInt(8, obj.getQno());
        ps.executeUpdate();
        
        
        }
        
        
        }
        
        
    
    
}
