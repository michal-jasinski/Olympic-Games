package netgloo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Events {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long event_id;
    private Long event_type_code;

    private Long venue_id;
    private String event_name;
    private java.sql.Timestamp event_start_date;
    private java.sql.Timestamp event_end_date;

    public Long getEvent_id() {
        return event_id;
    }

    public void setEvent_id(Long event_id) {
        this.event_id = event_id;
    }

    public Long getEvent_type_code() {
        return event_type_code;
    }

    public void setEvent_type_code(Long event_type_code) {
        this.event_type_code = event_type_code;
    }

    public Long getVenue_id() {
        return venue_id;
    }

    public void setVenue_id(Long venue_id) {
        this.venue_id = venue_id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public java.sql.Timestamp getEvent_start_date() {
        return event_start_date;
    }

    public void setEvent_start_date(java.sql.Timestamp event_start_date) {
        this.event_start_date = event_start_date;
    }

    public java.sql.Timestamp getEvent_end_date() {
        return event_end_date;
    }

    public void setEvent_end_date(java.sql.Timestamp event_end_date) {
        this.event_end_date = event_end_date;
    }
}
