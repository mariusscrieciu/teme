package com.fasttrackit.exercices1;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private final static Map<String,Integer> students = new HashMap<>();


    public Student(){
        students.put("Popescu Mircea", 3);
        students.put("Maracine Adelina", 8);
        students.put("Marius Scrieciu", 5);
        students.put("Stanciu Cristian", 10);
    }



    public void printStudentsAndGrades(){
        for (String key: students.keySet()){
            System.out.println("Studentul cu numele: "+key+" are nota: "+students.get(key));
        }
    }


    public int printTheHighestGrade(){
        int maxGrade = Integer.MIN_VALUE;

        for(Integer grade : students.values()){
            if(grade > maxGrade){
                maxGrade = grade;
            }
        }
        return maxGrade;
    }


}
