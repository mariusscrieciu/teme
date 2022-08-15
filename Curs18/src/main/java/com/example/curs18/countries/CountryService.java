package com.example.curs18.countries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final CountryReader reader;

    @Autowired
    public CountryService(CountryReader reader) {
        this.reader = reader;
    }

    public List<Country> fileContent(){
        return reader.readFile();
    }

}
