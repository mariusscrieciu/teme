package com.fasttrackit.algorithm;

import java.util.Arrays;
import java.util.List;

public class Algorithm {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(9, 8, 7, 3, 6, 5, 2, 4);
        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm(numbers);

        System.out.println("List de numere nesortata este: " + numbers);

        System.out.println("=================================================================");
        System.out.println("Adaugam un nou numar in lista.");
        sortingAlgorithm.add(10);
        System.out.println("List cu numere sortate dupa adaugare numarului este: " + sortingAlgorithm.getSortedList());

        System.out.println("=================================================================");
        System.out.println("Stergem un numar din lista");
        sortingAlgorithm.remove(0);
        System.out.println("List cu numere dupa ce am eliminat primul element este: " + sortingAlgorithm.getSortedList());

        System.out.println("=================================================================");
        System.out.println("Elementul de la index-ul 3 este: " + sortingAlgorithm.get(3));

        System.out.println("Lista sortata dupa toate operatiunile de mai sus este: " + sortingAlgorithm.getSortedList());

    }

}
