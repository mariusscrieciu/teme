package com.fasttrackit.exercices3;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person marius = new Person("Marius", 29, "manager");
        Person mircea = new Person("Mircea", 28, "welder");
        Person ionut = new Person("Ionut", 39, "carpenters");
        Person bogdan = new Person("Bogdan", 21, "plummers");
        Person cristi = new Person("Cristi", 32, "welder");

        List<Person> listOfEmployee = Arrays.asList(marius,mircea,ionut,bogdan,cristi);

        Company company = new Company(listOfEmployee);

        System.out.println("Managerul este: "+company.getManager());
        System.out.println("Personale cu profesia de 'welder' sunt: "+company.getPersons("welder").toString());

        System.out.println("Persoanle cu o varsta mai mare de 30 de ani sunt: "+company.getPersonsOlder(30).toString());
        System.out.println("Personale care contin secventa 'ri' sunt: "+company.getPerson("ri"));

        System.out.println("Toate personele din companie inainte de adaugare unui nou angajat sunt: "+company.allEmployee());
        Person oana = new Person("Oana", 29,"carpenters");
        company.employ(oana);
        System.out.println("Toate personale din companie dupa angajarea unei noi persoane: "+company.allEmployee());






    }
}
