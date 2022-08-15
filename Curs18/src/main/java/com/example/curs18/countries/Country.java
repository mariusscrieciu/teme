package com.example.curs18.countries;


import lombok.Getter;

@Getter

public class Country {

    private int id;
    private String name;
    private String capital;
    private Long population;
    private String area;
    private String continent;
    private String neighbours;

    public Country(int id, String name, String capital, Long population, String area, String continent, String neighbours) {
        this.id = id;
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        this.continent = continent;
        this.neighbours = neighbours;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", population='" + population + '\'' +
                ", area='" + area + '\'' +
                ", continent='" + continent + '\'' +
                ", neighbours='" + neighbours + '\'' +
                '}';
    }
}
