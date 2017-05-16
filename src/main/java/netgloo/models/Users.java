package netgloo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long user_Id;
    private String user_Login;
    private String user_Forename;
    private String user_Surename;
    private String user_Email;
    private String user_Password;


    public long getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(long user_Id) {
        this.user_Id = user_Id;
    }


    public String getUser_Login() {
        return user_Login;
    }

    public void setUser_Login(String user_Login) {
        this.user_Login = user_Login;
    }


    public String getUser_Forename() {
        return user_Forename;
    }

    public void setUser_Forename(String user_Forename) {
        this.user_Forename = user_Forename;
    }


    public String getUser_Surename() {
        return user_Surename;
    }

    public void setUser_Surename(String user_Surename) {
        this.user_Surename = user_Surename;
    }


    public String getUser_Email() {
        return user_Email;
    }

    public void setUser_Email(String user_Email) {
        this.user_Email = user_Email;
    }


    public String getUser_Password() {
        return user_Password;
    }

    public void setUser_Password(String user_Password) {
        this.user_Password = user_Password;
    }

}
