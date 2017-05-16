package netgloo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RefGender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long gender_Code;
    private String gender_Description;


    public long getGender_Code() {
        return gender_Code;
    }

    public void setGender_Code(long gender_Code) {
        this.gender_Code = gender_Code;
    }


    public String getGender_Description() {
        return gender_Description;
    }

    public void setGender_Description(String gender_Description) {
        this.gender_Description = gender_Description;
    }

}
