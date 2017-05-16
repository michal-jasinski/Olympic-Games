package netgloo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Competitors_In_Events {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long event_Id;
    private long competitor_Id;
    private java.sql.Timestamp event_Datetime;
    private String current_Overall_Position;


    public long getEvent_Id() {
        return event_Id;
    }

    public void setEvent_Id(long event_Id) {
        this.event_Id = event_Id;
    }


    public long getCompetitor_Id() {
        return competitor_Id;
    }

    public void setCompetitor_Id(long competitor_Id) {
        this.competitor_Id = competitor_Id;
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
