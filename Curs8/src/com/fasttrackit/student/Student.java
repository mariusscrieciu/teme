package com.fasttrackit.student;

public class Student {


    private static double sumOfGrades = 0;
    private static int numberOfStudents = 0;

    private String name;
    private double grade;

    public Student(String name, double grade){
        this.name= name;
        this.grade = grade;
        sumOfGrades+=grade;
        numberOfStudents++;

    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public static double averageGrade(){
        return (sumOfGrades/numberOfStudents);
    }
}
