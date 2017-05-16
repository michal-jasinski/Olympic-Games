package netgloo.models;


import javax.persistence.*;

@Entity
public class Competitors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long competitor_Id;
    @ManyToOne
    @JoinColumn(name = "gender_Code", nullable = true, updatable = true)
    private Ref_Gender gender_Code;
    private String competitor_First_Name;
    private String competitor_Last_Name;
    private String age;
    private String occupation;
    private String personal_Coach;
    @ManyToOne
    @JoinColumn(name = "iso_Country_Code", nullable = true, updatable = true)
    private Ref_Countries iso_Country_Code;
    private String other_Competitor_Details;


    public long getCompetitor_Id() {
        return competitor_Id;
    }

    public void setCompetitor_Id(long competitor_Id) {
        this.competitor_Id = competitor_Id;
    }


    public Ref_Gender getGender_Code() {
        return gender_Code;
    }

    public void setGender_Code(Ref_Gender gender_Code) {
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


    public Ref_Countries getIso_Country_Code() {
        return iso_Country_Code;
    }

    public void setIso_Country_Code(Ref_Countries iso_Country_Code) {
        this.iso_Country_Code = iso_Country_Code;
    }


    public String getOther_Competitor_Details() {
        return other_Competitor_Details;
    }

    public void setOther_Competitor_Details(String other_Competitor_Details) {
        this.other_Competitor_Details = other_Competitor_Details;
    }

}
