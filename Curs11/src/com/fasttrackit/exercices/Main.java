package com.fasttrackit.exercices;

import java.io.IOException;


public class Main {

    private static final String filePath = "files/grades.txt";

    public static void main(String[] args) throws IOException {

        Classroom classroom = new Classroom(filePath);
        System.out.println("Grades for a discipline are: "+classroom.getGradesForDiscipline("Mathematics"));
        System.out.println("Grades for a student are: "+classroom.getGradesForStudent("Ealhstan Saira"));
        System.out.println("Average grades for a discipline is: "+classroom.getAverageGrade("Mathematics"));
        System.out.println("Max grade for a discipline is: "+classroom.getMaxGrade("Mathematics"));
        System.out.println("Max grade for all disciplines is: "+classroom.getMaxGrade());
        System.out.println("Min grade for a discipline is: "+classroom.getWorstGrade("Mathematics"));

        ReportGenerator reportGenerator = new ReportGenerator(classroom.getAllStundets());
        reportGenerator.generateReport();


    }
}
