package netgloo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FavouriteCompetitors {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long favourite_Competitor_Id;
    private long competitor_Id;


    public long getFavourite_Competitor_Id() {
        return favourite_Competitor_Id;
    }

    public void setFavourite_Competitor_Id(long favourite_Competitor_Id) {
        this.favourite_Competitor_Id = favourite_Competitor_Id;
    }


    public long getCompetitor_Id() {
        return competitor_Id;
    }

    public void setCompetitor_Id(long competitor_Id) {
        this.competitor_Id = competitor_Id;
    }

}
