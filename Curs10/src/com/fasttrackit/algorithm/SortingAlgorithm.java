package com.fasttrackit.algorithm;

import java.util.ArrayList;
import java.util.List;

public class SortingAlgorithm implements Sort {


    List<Integer> numbers;

    public SortingAlgorithm(List<Integer> numbers){
        this.numbers= new ArrayList<>(numbers);
    }

    @Override
    public void add(int number) {
        if(!numbers.contains(number)){
            numbers.add(number);
            sortList(numbers);
        }
    }

    @Override
    public int get(int index) {
        return numbers.get(index);
    }

    @Override
    public void remove(int index){
        numbers.remove(index);
        sortList(numbers);
    }


    //Bubble Sort Algorithm
    private List<Integer> sortList(List<Integer> list) {
        boolean swapIsNeeded = true;

        while (swapIsNeeded) {
            swapIsNeeded = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    swapIsNeeded = true;
                    int temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);
                }
            }
        }
        return list;
    }

    public List<Integer> getSortedList() {
        return numbers;
    }

}
