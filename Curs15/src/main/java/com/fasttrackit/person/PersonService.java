package com.fasttrackit.person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {

    private static int id = 0;
    private List<Person> persons = new ArrayList<>();


    public Person addPerson(Person person) {
        ++id;
        person.setId(id);
        persons.add(person);
        return person;
    }

    public Person removePerson(int id) {
        Person removedPerson = null;
        for (int i = 0; i <= persons.size() - 1; i++) {
            if (persons.get(i).getId() == id) {
                removedPerson = persons.get(i);
                persons.remove(i);
            }
        }

        if (removedPerson == null) {
            throw new RuntimeException(" Provide id is not valid or is not present");
        }

        return removedPerson;
    }


    public List<Person> getAllPersons() {
        return persons;
    }


    public List<Person> getPersonsOlderThan(int age) {
        List<Person> olderThan = new ArrayList<>();

        for (Person p : persons) {
            if (p.getAge() > 0 && p.getAge() < 120) {
                olderThan.add(p);
            }
        }
        return olderThan;
    }


    public List<String> getAllPersonNames(){
        List<String> names = new ArrayList<>();
        for(Person p : persons){
            names.add(p.getName());
        }
        return names;
    }

    public Person getPerson(String name){
        Person personR = null;
        for(Person p : persons) {
            System.out.println(p);
            if (p.getName().equals(name) && p.getAge() > 0) {
                personR = p;
            }
        }
        return personR;
    }

    public Person getPersonById(int id){
        Person person = null;
        for(Person p : persons){
            if(p.getId() == id){
                person = p;
            }
        }
        if( person == null){
            throw new RuntimeException("Wanted object is null");
        }
        return person;
    }

    public void printAllPersonsFromCurrentList(){
        for(Person p : persons){
            System.out.println("Person: "+p);
        }
    }

}
