package netgloo.models;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * Created by Michał on 30.05.2017.
 */

@Transactional
public interface RefCountriesRepository extends JpaRepository<RefCountries, Long> {
    RefCountries findByCountryName(String countryName);
}