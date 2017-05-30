package netgloo.models;

import javax.persistence.*;

@Entity
public class RefCountries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iso_Country_Code;
    @Column(name = "country_Name")
    private String countryName;



    public long getIso_Country_Code() {
        return iso_Country_Code;
    }

    public void setIso_Country_Code(long iso_Country_Code) {
        this.iso_Country_Code = iso_Country_Code;
    }


    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

}
