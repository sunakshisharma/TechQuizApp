package pojo;
public class User 
{

    public User(String userid, String password, String usertype) {
        this.userid = userid;
        this.password = password;
        this.usertype = usertype;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" + "userid=" + userid + ", password=" + password + ", usertype=" + usertype + '}';
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

private String userid;
private String password;
private String usertype;

}
   