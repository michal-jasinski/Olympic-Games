package netgloo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ref_Countries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iso_Country_Code;
    private String country_Name;


    public long getIso_Country_Code() {
        return iso_Country_Code;
    }

    public void setIso_Country_Code(long iso_Country_Code) {
        this.iso_Country_Code = iso_Country_Code;
    }


    public String getCountry_Name() {
        return country_Name;
    }

    public void setCountry_Name(String country_Name) {
        this.country_Name = country_Name;
    }

}
