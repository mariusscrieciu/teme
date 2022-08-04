package com.fasttrackit;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("marius","Scrieciu",30, "Bucharest"),
                new Person("Mircea","Popescu",28, "Oradea"),
                new Person("Alina","Stanciu",34, "Pitesti"),
                new Person("Ionut","Ilie",29, "Cluj"),
                new Person("Mihai","Ionescu",52, "Tr. Magurele"),
                new Person("Oana","Marinescu",16, "Constanta"),
                new Person("Mihaela","Marinescu",16, "Oradea"),
                new Person("marius","Dumitrache",72, "Cluj"),
                new Person("Florian","Mateescu",61, "Deva")

        );


        PersonService personService = new PersonService();

        System.out.println(personService.listAllFirstNameAndLastName(personList));
        System.out.println(personService.listAllPersonsThatAreMajor(personList));
        System.out.println(personService.listAllPersonsFromOradea(personList));
        System.out.println(personService.listAllPersonFromOradeaOrCluj(personList));
        System.out.println(personService.listAllFirstNamesCapitalized(personList));
        System.out.println(personService.listPersonNamesCustom(personList));
        System.out.println(personService.listAllPersonsBetween18And60(personList));
        System.out.println(personService.listAllPersonStartingWithA(personList));
        System.out.println(personService.allUniquelyNames(personList));
        System.out.println(personService.sortPersonsByFirstName(personList));
        System.out.println(personService.sortPersonsByLasttName(personList));
        System.out.println(personService.sortPersonsByFirstNameLastNameAndAge(personList));




    }
}
