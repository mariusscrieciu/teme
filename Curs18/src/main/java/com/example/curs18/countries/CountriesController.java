package com.example.curs18.countries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;


@RestController
@RequestMapping("/countries")
public class CountriesController {


    private final CountryService countryService;

    @Autowired
    public CountriesController(CountryService countryService) {
        this.countryService = countryService;
    }


    @GetMapping("/")
    public List<Country> getAllCountries() {
        return countryService.fileContent();
    }

    @GetMapping("/names")
    public List<String> getAllCountriesNames() {
        return countryService
                .fileContent()
                .stream()
                .map(Country::getName)
                .toList();
    }

    @GetMapping("{countryId}/capital")
    public String getCapitalOfACountryById(@PathVariable int countryId) {
        return countryService
                .fileContent()
                .stream()
                .filter(country -> country.getId() == countryId)
                .map(Country::getCapital)
                .collect(Collectors.joining());
    }

    @GetMapping("{countryId}/population")
    public LongStream getCountryPopulationById(@PathVariable int countryId) {
        return countryService
                .fileContent()
                .stream()
                .filter(country -> country.getId() == countryId)
                .mapToLong(Country::getPopulation);

    }

    @GetMapping("{countryId}/neighbours")
    public List<String> getCountryNeighbours(@PathVariable int countryId) {
        return countryService
                .fileContent()
                .stream()
                .filter(country -> country.getId() == countryId)
                .map(Country::getNeighbours)
                .toList();
    }

    @GetMapping
    public List<Country> getCountryWithNeighbourXAndNotNeighbourY(
            @RequestParam String includeNeighbour,
            @RequestParam String excludeNeighbour) {

        return countryService
                .fileContent()
                .stream()
                .filter(country -> country.getNeighbours().contains(includeNeighbour) && !country.getNeighbours().contains(excludeNeighbour))
                .toList();

    }
}
