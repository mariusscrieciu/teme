package com.fasttrackit.exercices1;

public class Main {

    public static void main(String[] args) {
        Basket fruitBasket = new Basket();

        fruitBasket.add("mere");
        fruitBasket.add("pere");
        fruitBasket.add("portocale");
        fruitBasket.add("banane");
        fruitBasket.add("nectarine");
        fruitBasket.add("pere");
        fruitBasket.add("zmeura");
        fruitBasket.add("prune");
        fruitBasket.add("afinse");
        fruitBasket.add("mure");
        fruitBasket.add("zmeura");


        System.out.println("Avem banane in cos: "+fruitBasket.find("banane"));
        System.out.println("Inainte sa eliminam portocalele aveam urmatoarele fructe in cos: "+fruitBasket.printAllFruitsFromBasket());
        System.out.println("Am eliminat portocalele din cos: "+fruitBasket.remove("portocale"));
        System.out.println("Dupa eliminarea portocalelor in cos au ramas urmatoarele fructe: "+fruitBasket.printAllFruitsFromBasket());
        System.out.println("Fructul nectarine are urmatoarea pozitia: "+fruitBasket.position("nectarine"));
        System.out.println("Fructele unice din cos sunt: "+fruitBasket.distinct().toString());
        System.out.println("Numarul fructelor din cos sunt: "+fruitBasket.count());
        System.out.println("Numarul frunctelor in cos folosind metoda de numarare custom sunt: "+fruitBasket.customCount());



    }
}
