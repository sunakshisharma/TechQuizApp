package pojo;

import java.util.ArrayList;

public class QuestionStore 
{  

    @Override
    public String toString() {
        return "QuestionStore{" + "questionList=" + questionList + '}';
    }
     
        
  ArrayList <QuestionPojo>  questionList ;
    public QuestionStore() 
    {
      questionList = new ArrayList<>();
    }
        public void addQuestion(QuestionPojo q)
        {
        questionList.add(q);
        }
        public QuestionPojo getQuestion(int pos)
        {
        return questionList.get(pos);
        }
        public void removeQuestion(int pos)
        {
        questionList.remove(pos);
        }
        public void setQuestionAt(int pos,QuestionPojo q)
        {
        questionList.add(pos, q);
        }
        public ArrayList<QuestionPojo> getAllQuestions()
        {
        return questionList;
        }
        public int getCount()
        {
        return questionList.size();
        }
        public QuestionPojo getQuestionByQno(int qno)
    {
        for(QuestionPojo quest: questionList){
            if(quest.getQno()==qno)
                return quest;
        }
        return null;
    }
}





  

