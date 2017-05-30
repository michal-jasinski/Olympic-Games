package netgloo.models;

/**
 * Created by Michał on 30.05.2017.
 */
public class EventDTO {
    private String name;
    private String venueId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVenueId() {
        return venueId;
    }

    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }
}
