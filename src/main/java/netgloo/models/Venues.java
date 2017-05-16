package netgloo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Venues {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long venue_Id;
    private String venue_Name;
    private String venue_Address;
    private String venue_Seat_Capacity;


    public long getVenue_Id() {
        return venue_Id;
    }

    public void setVenue_Id(long venue_Id) {
        this.venue_Id = venue_Id;
    }


    public String getVenue_Name() {
        return venue_Name;
    }

    public void setVenue_Name(String venue_Name) {
        this.venue_Name = venue_Name;
    }


    public String getVenue_Address() {
        return venue_Address;
    }

    public void setVenue_Address(String venue_Address) {
        this.venue_Address = venue_Address;
    }


    public String getVenue_Seat_Capacity() {
        return venue_Seat_Capacity;
    }

    public void setVenue_Seat_Capacity(String venue_Seat_Capacity) {
        this.venue_Seat_Capacity = venue_Seat_Capacity;
    }

}
