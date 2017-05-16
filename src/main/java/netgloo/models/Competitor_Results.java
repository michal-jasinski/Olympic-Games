package netgloo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Competitor_Results {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long event_Id;
    private long sequence_Number;
    private long competitor_Id;
    private String position;
    private String result;


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


    public long getCompetitor_Id() {
        return competitor_Id;
    }

    public void setCompetitor_Id(long competitor_Id) {
        this.competitor_Id = competitor_Id;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
