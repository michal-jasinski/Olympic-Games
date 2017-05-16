package netgloo.models;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * Created by Michał on 15.05.2017.
 */
@Transactional
public interface EventsRepository extends JpaRepository<Events, Long> {
}
