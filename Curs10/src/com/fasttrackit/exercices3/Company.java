package com.fasttrackit.exercices3;

import java.util.ArrayList;
import java.util.List;

public class Company implements CompanyActions {


    private List<Person> listOfEmployee;

    public Company(List<Person> listOfEmployee) {
        this.listOfEmployee=listOfEmployee;
    }

    @Override
    public Person getManager() {
        Person manager = null;
        for(Person p : listOfEmployee){
            if(p.getPosition().equals("manager")){
                manager = p;
            }
        }
        return manager;
    }

    @Override
    public List<Person> getPersons(String position) {
        List<Person> targetPersons = new ArrayList<>();
        for(Person employee : listOfEmployee){
            if(employee.getPosition().equals(position)){
                targetPersons.add(employee);
            }
        }
        return targetPersons;
    }

    @Override
    public List<Person> getPersonsOlder(int age) {
        List<Person> targetPersons = new ArrayList<>();
        for(Person p : listOfEmployee){
            if(p.getAge() > age){
                targetPersons.add(p);
            }
        }
        return targetPersons;
    }

    @Override
    public List<Person> getPerson(String filterName) {
        List<Person> targetPerson = new ArrayList<>();
        for(Person p : listOfEmployee){
            if(p.getName().contains(filterName)){
                targetPerson.add(p);
            }
        }
        return targetPerson;
    }

    @Override
    public void employ(Person employee) {
        List<Person> newListOfEmployess = new ArrayList<>();
        newListOfEmployess.add(employee);
        newListOfEmployess.addAll(listOfEmployee);
        listOfEmployee = newListOfEmployess;

    }

    public String allEmployee(){
        return listOfEmployee.toString();
    }
}
