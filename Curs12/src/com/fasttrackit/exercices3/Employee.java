package com.fasttrackit.exercices3;

import com.fasttrackit.exercices2.Person;

public class Employee  extends Person {

    private String company;

    private double salary;

    public Employee(String name, int age, String haircolor) {
        super(name, age, haircolor);
    }

    public Employee(String name, int age, String haircolor, String company, double salary) {
        super(name, age, haircolor);
        this.company = company;
        this.salary = salary;
    }


    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }
}
