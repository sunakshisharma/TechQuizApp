package pojo;
public class Student 
{

    public Student() {
    }

    public Student(String StudentId, String pwd) {
        this.StudentId = StudentId;
        this.pwd = pwd;
    }

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String StudentId) {
        this.StudentId = StudentId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
String StudentId;
String pwd;
}
