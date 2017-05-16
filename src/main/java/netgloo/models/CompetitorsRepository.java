package netgloo.models;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * Created by Michał on 16.05.2017.
 */
@Transactional
public interface CompetitorsRepository extends JpaRepository<Competitors, Long> {
}
