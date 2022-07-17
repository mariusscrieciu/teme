package com.fasttrackit.exercices;

public class StudentGrade {

    private String name;
    private String discipline;
    private int grade;

    public StudentGrade(String name, String discipline, int grade) {
        this.grade = grade;
        this.discipline = discipline;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public String getDiscipline() {
        return discipline;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", discipline='" + discipline + '\'' +
                ", grade=" + grade +
                '}';
    }
}
