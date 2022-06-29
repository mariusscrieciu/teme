package com.fasttrackit.exercices3;

import java.util.List;

public interface CompanyActions {


    public Person getManager();
    public List<Person> getPersons(String position);
    public List<Person> getPersonsOlder(int age);
    public List<Person> getPerson(String filterName);
    public void employ(Person employee);
}
