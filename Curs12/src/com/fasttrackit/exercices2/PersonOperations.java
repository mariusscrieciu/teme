package com.fasttrackit.exercices2;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class PersonOperations {


    private static Person p1 = new Person("Marius", 29, "black");
    private static Person p2 = new Person("Madalin", 34, "red");
    private static Person p3 = new Person("Valentin", 38, "green");
    private static Person p4 = new Person("Oana", 29, "red");
    private static Person p5 = new Person("Cristi", 32, "black");
    private static Person p6 = new Person("Maria", 32, "violet");
    private static final List<Person> persons = List.of(p1, p2, p3, p4, p5, p6);

    public PersonOperations() {
    }


    public void extractNames() {
        List<String> names = new ArrayList<>();
        for (Person p : persons) {
            names.add(p.getName());
        }

        System.out.println("Extracted list of names is: " + names);
    }


    public void mapNameToAge() {
        Map<String, Integer> nameAndAge = new HashMap<>();
        for (Person p : persons) {
            nameAndAge.put(p.getName(), p.getAge());

        }

        System.out.println("List of person mapped by name and age is: " + nameAndAge);
    }

    public void personOlderThan(int age) {
        List<String> olderThan = new ArrayList<>();
        for (Person p : persons) {
            if (p.getAge() > age) {
                olderThan.add(p.getName());
            }
        }
        System.out.println("Person older than '" + age + "' are:" + olderThan);
    }


    public void mapNamesToHairColor() {
        Map<String, List<String>> result = new HashMap<>();
        Set<String> hairColors = new HashSet<>();
        List<String> temporaryList = null;
        for (Person p : persons) {
            hairColors.add(p.getHaircolor());
        }

        for (String hairColor : hairColors) {
            temporaryList = new ArrayList<>();
            for (Person p : persons) {
                if (p.getHaircolor().equals(hairColor)) {
                    temporaryList.add(p.getName());
                }
            }
            result.put(hairColor, temporaryList);
        }

        System.out.println("Names mapped to hair colors are: " + result);

    }

    public void mapAgesToPerson(){
        Map<Integer, List<Person>> result = new HashMap<>();
        Set<Integer> ages = new HashSet<>();
        List<Person> temporaryList = null;

        for(Person p : persons){
            ages.add(p.getAge());
        }

        for(Integer age : ages){
            temporaryList = new ArrayList<>();
            for(Person p : persons){
                if(p.getAge() == age){
                    temporaryList.add(p);
                }
            }
            result.put(age,temporaryList);
        }
        System.out.println("Ages mapped to Person class are: "+result);
    }


}
