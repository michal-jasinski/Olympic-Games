package netgloo.models;


import javax.persistence.*;

@Entity
public class RefGender {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long gender_Code;
    @Column(name = "gender_Description")
    private String genderDescription;


    public long getGender_Code() {
        return gender_Code;
    }

    public void setGender_Code(long gender_Code) {
        this.gender_Code = gender_Code;
    }


    public String getGenderDescription() {
        return genderDescription;
    }

    public void setGenderDescription(String genderDescription) {
        this.genderDescription = genderDescription;
    }

}
