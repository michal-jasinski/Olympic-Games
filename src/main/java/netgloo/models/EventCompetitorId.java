package netgloo.models;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Michał on 16.05.2017.
 */

@Embeddable
public class EventCompetitorId implements Serializable {
    @Column(name = "event_id")
    private long eventId;

    @Column(name = "competitor_id")
    private long competitorId;

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public long getCompetitorId() {
        return competitorId;
    }

    public void setCompetitorId(long competitorId) {
        this.competitorId = competitorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventCompetitorId that = (EventCompetitorId) o;

        if (eventId != that.eventId) return false;
        return competitorId == that.competitorId;
    }

    @Override
    public int hashCode() {
        int result = (int) (eventId ^ (eventId >>> 32));
        result = 31 * result + (int) (competitorId ^ (competitorId >>> 32));
        return result;
    }
}
