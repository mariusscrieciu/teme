package com.fasttrackit.exercices2;

public class Main {
    public static void main(String[] args) {

        Buquet buquet = new Buquet();
        buquet.add("trandafir");
        buquet.equals("lalea");
        buquet.add("zambila");
        buquet.add("crin");
        buquet.add("orhidee");
        buquet.add("lalea");

        System.out.println("Florile din buchet sunt: "+buquet.getAll().toString());

        System.out.println("Adaugam o nou floare in buchet");
        buquet.add("bujor");
        System.out.println("Florile din buchet dupa adaugarea: "+buquet.getAll().toString());


        System.out.println("Eliminam o floare din buchet");
        buquet.remove("crin");
        System.out.println("Florile din buchet dupa eliminare: "+buquet.getAll().toString());
    }
}
