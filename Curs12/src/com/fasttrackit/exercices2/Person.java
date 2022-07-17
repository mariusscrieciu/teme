package com.fasttrackit.exercices2;

public class Person {

    private String name;
    private int age;
    private String haircolor;


    public Person(String name, int age, String haircolor) {
        this.name = name;
        this.age = age;
        this.haircolor = haircolor;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHaircolor() {
        return haircolor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", haircolor='" + haircolor + '\'' +
                '}';
    }
}
