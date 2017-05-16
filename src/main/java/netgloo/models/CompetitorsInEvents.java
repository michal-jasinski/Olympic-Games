package netgloo.models;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CompetitorsInEvents {

    @EmbeddedId
    private EventCompetitorId id;

    private java.sql.Timestamp event_Datetime;
    private String current_Overall_Position;

    @ManyToOne
    @JoinColumn(name = "event_id", insertable = false, updatable = false)
    private Events events;

    @ManyToOne
    @JoinColumn(name = "competitor_id", insertable = false, updatable = false)
    private Competitors competitors;

    public EventCompetitorId getId() {
        return id;
    }

    public void setId(EventCompetitorId id) {
        this.id = id;
    }

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events events) {
        this.events = events;
    }

    public Competitors getCompetitors() {
        return competitors;
    }

    public void setCompetitors(Competitors competitors) {
        this.competitors = competitors;
    }

    public java.sql.Timestamp getEvent_Datetime() {
        return event_Datetime;
    }

    public void setEvent_Datetime(java.sql.Timestamp event_Datetime) {
        this.event_Datetime = event_Datetime;
    }


    public String getCurrent_Overall_Position() {
        return current_Overall_Position;
    }

    public void setCurrent_Overall_Position(String current_Overall_Position) {
        this.current_Overall_Position = current_Overall_Position;
    }

}
