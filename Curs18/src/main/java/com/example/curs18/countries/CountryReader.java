package com.example.curs18.countries;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Component
public class CountryReader {

    private final static String countriesFilePath = "files/countries.txt";


    public List<Country> readFile(){
        List<Country> countries = new ArrayList<>();
        int id = 1;
        try {
            BufferedReader bufferedReader = new BufferedReader( new FileReader(countriesFilePath));
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] elements = line.split("\\|");
                if(elements.length == 6){
                    countries.add(new Country(id,elements[0],elements[1],Long.parseLong(elements[2]),elements[3],elements[4],elements[5]));
                }else {
                    countries.add(new Country(id,elements[0],elements[1],Long.parseLong(elements[2]),elements[3],elements[4],"no neighbour".toUpperCase()));
                }

                ++id;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return countries;
    }

}
