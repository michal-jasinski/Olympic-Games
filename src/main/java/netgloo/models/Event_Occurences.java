package netgloo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event_Occurences {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long event_Id;
    private long sequence_Number;
    private String event_Occurrence_Details;


    public long getEvent_Id() {
        return event_Id;
    }

    public void setEvent_Id(long event_Id) {
        this.event_Id = event_Id;
    }


    public long getSequence_Number() {
        return sequence_Number;
    }

    public void setSequence_Number(long sequence_Number) {
        this.sequence_Number = sequence_Number;
    }


    public String getEvent_Occurrence_Details() {
        return event_Occurrence_Details;
    }

    public void setEvent_Occurrence_Details(String event_Occurrence_Details) {
        this.event_Occurrence_Details = event_Occurrence_Details;
    }

}
