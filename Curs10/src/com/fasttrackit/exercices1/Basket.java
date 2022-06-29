package com.fasttrackit.exercices1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Basket implements BasketActions{

    private List<String> fruits;

    public Basket(){
        fruits= new ArrayList<>();
    }


    @Override
    public boolean find(String fruit) {
        return fruits.contains(fruit);
    }

    @Override
    public boolean remove(String fruit) {
        return fruits.remove(fruit);
    }

    @Override
    public int position(String fruit) {
        return fruits.indexOf(fruit);
    }

    @Override
    public Collection<String> distinct() {
        return new HashSet<>(fruits);
    }

    @Override
    public void add(String fruit) {
        fruits.add(fruit);
    }

    @Override
    public int count() {
        return fruits.size();
    }

    @Override
    public int customCount() {
        int numberOfFruits = 0;
        for(String fruit : fruits){
            numberOfFruits++;
        }
        return numberOfFruits;
    }

    public String printAllFruitsFromBasket(){
        return fruits.toString();
    }
}
