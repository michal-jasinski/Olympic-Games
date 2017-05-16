package netgloo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Competitors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long competitor_Id;
    private long gender_Code;
    private String competitor_First_Name;
    private String competitor_Last_Name;
    private String age;
    private String occupation;
    private String personal_Coach;
    private long iso_Country_Code;
    private String other_Competitor_Details;


    public long getCompetitor_Id() {
        return competitor_Id;
    }

    public void setCompetitor_Id(long competitor_Id) {
        this.competitor_Id = competitor_Id;
    }


    public long getGender_Code() {
        return gender_Code;
    }

    public void setGender_Code(long gender_Code) {
        this.gender_Code = gender_Code;
    }


    public String getCompetitor_First_Name() {
        return competitor_First_Name;
    }

    public void setCompetitor_First_Name(String competitor_First_Name) {
        this.competitor_First_Name = competitor_First_Name;
    }


    public String getCompetitor_Last_Name() {
        return competitor_Last_Name;
    }

    public void setCompetitor_Last_Name(String competitor_Last_Name) {
        this.competitor_Last_Name = competitor_Last_Name;
    }


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }


    public String getPersonal_Coach() {
        return personal_Coach;
    }

    public void setPersonal_Coach(String personal_Coach) {
        this.personal_Coach = personal_Coach;
    }


    public long getIso_Country_Code() {
        return iso_Country_Code;
    }

    public void setIso_Country_Code(long iso_Country_Code) {
        this.iso_Country_Code = iso_Country_Code;
    }


    public String getOther_Competitor_Details() {
        return other_Competitor_Details;
    }

    public void setOther_Competitor_Details(String other_Competitor_Details) {
        this.other_Competitor_Details = other_Competitor_Details;
    }

}
