package com.fasttrackit.extramile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {

    private Car c1 = new Car("BMW",2014,8900.1,23000);
    private Car c2 = new Car("Volvo",2013,18900.8,19000);
    private Car c3 = new Car("Lexus",2020,900.4,123000);
    private Car c4 = new Car("Volvo",2020,3900.9,42000);
    private Car c5 = new Car("Lexus",2009,22900.6,13000);
    private Car c6 = new Car("BMW",2017,90900.2,18500);
    private Car c7 = new Car("Volvo",2022,9,92000);
    private Car c8 = new Car("Ford",2004,300900.9,2000);



    private List<Car> cars = List.of(c1,c2,c3,c4,c5,c6,c7,c8);


    public void mapCarNameToNumberOfCars(){
        Map<String, Integer> result = new HashMap<>();
        List<String> carNames = new ArrayList<>();

        for(Car car : cars){
            carNames.add(car.getName());
        }

        for(String name : carNames){
            int counter = 0;
            for(Car car : cars){
                if(name.equals(car.getName())){
                    counter++;
                }
            }
            result.put(name,counter);
        }
        System.out.println("Car name mapped to number of cars is: "+result);
    }

    public void mapCarNameToSumOfKm(){
        Map<String,Integer> result = new HashMap<>();
        List<String> carNames = new ArrayList<>();

        for(Car car : cars){
            carNames.add(car.getName());
        }

        for(String carName : carNames){
            int sumOfKms = 0;
            for(Car car : cars){
                if(carName.equals(car.getName())){
                    sumOfKms += car.getKm();
                }
            }
            result.put(carName,sumOfKms);
        }

        System.out.println("Car name mapped to sum of KMs: "+result);
    }


    public void mapKmRangeToListOfCars(){
        Map<Range,List<Car>> result = new HashMap<>();
        List<Range> rangeList = KMRange.getKmRanges();

        for(Range r : rangeList){
            List<Car> temp = new ArrayList<>();
            for(Car c : cars){
              if( c.getKm()> r.getRange().get("min") && c.getKm()< r.getRange().get("max")){
                  temp.add(c);
              }
            }
            if(!temp.isEmpty()){
                result.put(r,temp);
            }
        }
        System.out.println("List of cars mapped to KM rang is: "+result);
    }


    public void mapPriceRangeToListOfCars(){
        Map<Range,List<Car>> result = new HashMap<>();
        List<Range> priceRange = PriceRange.getPriceRange();

        for(Range r : priceRange){
            List<Car> temp = new ArrayList<>();
            for(Car c: cars){
                if((c.getPrice() > r.getRange().get("min")) && (c.getPrice() < r.getRange().get("max"))){
                    temp.add(c);
                }
            }
            if(!temp.isEmpty()){
                result.put(r,temp);
            }
        }
        System.out.println("List of cars mapped to price range is: "+result);
    }



}
