package netgloo.models;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Michał on 16.05.2017.
 */
@Transactional
public interface CompetitorsInEventsRepository extends JpaRepository<CompetitorsInEvents, EventCompetitorId> {

    public List<CompetitorsInEvents> findByIdEventId(long eventId);

    public List<CompetitorsInEvents> findByIdCompetitorId(long competitorId);

}

