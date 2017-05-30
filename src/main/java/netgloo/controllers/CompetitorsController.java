package netgloo.controllers;

import netgloo.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Michał on 16.05.2017.
 */
@Controller
@RequestMapping("/competitors")
public class CompetitorsController {
    @Autowired
    private CompetitorsRepository competitorsRepository;
    @Autowired
    private RefCountriesRepository refCountriesRepository;
    @Autowired
    private RefGenderRepository refGenderRepository;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<Competitors> getAll() {
        return competitorsRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<?> add(@RequestBody CompetitorDTO competitorDTO) {
        Competitors competitors = new Competitors();
        competitors.setCompetitor_First_Name(competitorDTO.getName());
        competitors.setAge(String.valueOf(competitorDTO.getAge()));
        RefGender gender = refGenderRepository.findByGenderDescription(competitorDTO.getGender());
        competitors.setGender_Code(gender);
        RefCountries countries = refCountriesRepository.findByCountryName(competitorDTO.getCountry());
        competitors.setIso_Country_Code(countries);
        competitorsRepository.save(competitors);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{competitorId}", method = RequestMethod.DELETE)
    ResponseEntity<?> delete(@PathVariable long competitorId) {
        competitorsRepository.delete(competitorId);
        return ResponseEntity.noContent().build();
    }
}

