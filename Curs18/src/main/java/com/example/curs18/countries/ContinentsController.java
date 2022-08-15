package com.example.curs18.countries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/continents")
public class ContinentsController {

    private final CountryService countryService;

    @Autowired
    public ContinentsController(CountryService countryService) {
        this.countryService = countryService;
    }


    @GetMapping("{continentName}/countries")
    public List<Country> getAllCountriesFromAContinent(@PathVariable String continentName){
        return countryService
                .fileContent()
                .stream()
                .filter(country -> country.getContinent().equals(continentName))
                .toList();
    }


    @GetMapping("{continent}/countries")
    public List<Country> getAllCountriesWithPopulationGreaterThan(
            @PathVariable String continent,
            @RequestParam Long minPopulation){

        return  countryService
                .fileContent()
                .stream()
                .filter(country -> country.getPopulation() > minPopulation)
                .toList();
    }




}
