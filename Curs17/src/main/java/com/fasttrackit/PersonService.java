package com.fasttrackit;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PersonService {


    public List<String> listAllFirstNameAndLastName(List<Person> personList) {
        return personList.stream()
                .map(person -> person.getFirstName() + " " + person.getLastName())
                .toList();
    }


    public List<Person> listAllPersonsThatAreMajor(List<Person> personList){
        return personList.stream()
                .filter(person -> person.getAge() > 18)
                .toList();
    }

    public List<Person> listAllPersonsFromOradea(List<Person> personList){
        return personList.stream()
                .filter(person -> person.getCity().equalsIgnoreCase("ORADEA"))
                .toList();
    }

    public List<Person> listAllPersonFromOradeaOrCluj(List<Person> personList){
        return personList.stream()
                .filter(person ->
                    person.getCity().equalsIgnoreCase("ORADEA") || person.getCity().equalsIgnoreCase("CLUJ"))
                .toList();
    }

    public List<String> listAllFirstNamesCapitalized(List<Person> personList){
        return personList.stream()
                .map(person -> person.getFirstName().substring(0,1).toUpperCase()+person.getFirstName().substring(1))
                .toList();
    }

    public List<String> listPersonNamesCustom(List<Person> personList){
        return personList.stream()
                .map(person -> person.getFirstName()+" "+person.getLastName().substring(0,1)+".")
                .toList();
    }

    public List<Person> listAllPersonsBetween18And60(List<Person> personList){
        return personList.stream()
                .filter(person -> person.getAge() > 18 && person.getAge() < 60)
                .toList();
    }

    public List<Person> listAllPersonStartingWithA(List<Person> personList){
        return personList.stream()
                .filter(person -> person.getFirstName().substring(0,1).equals("A"))
                .toList();

    }

    public Set<String> allUniquelyNames(List<Person> personList){
        return personList.stream()
                .map(person -> person.getFirstName().toUpperCase())
                .collect(Collectors.toSet());
    }

    public List<Person> sortPersonsByFirstName(List<Person> personList){
        return personList.stream()
                .sorted(Comparator.comparing(person -> person.getFirstName().toUpperCase()))
                .toList();
    }

    public List<Person> sortPersonsByLasttName(List<Person> personList){
        return personList.stream()
                .sorted(Comparator.comparing(person -> person.getLastName().toUpperCase()))
                .toList();
    }


    public List<Person> sortPersonsByFirstNameLastNameAndAge(List<Person> personList){
        Comparator<Person> comparator = Comparator
                .comparing(Person::getFirstName)
                .thenComparing(Person::getLastName)
                .thenComparingInt(Person::getAge);
        return personList.stream()
                .sorted(comparator)
                .toList();
    }


}
