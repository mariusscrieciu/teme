package com.fasttrackit.exercices2;

import java.util.Collection;
import java.util.HashSet;

public class Buquet extends BuquetActions {

    private HashSet<String> flowers;

    public Buquet() {
        flowers= new HashSet<>();
    }

    @Override
    public Collection<String> getAll() {
        return flowers;
    }

    @Override
    public void add(String flower) {
        flowers.add(flower);
    }

    @Override
    public void remove(String flower) {
        flowers.remove(flower);
    }
}
