package com.fasttrackit.exercices;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Classroom implements ClassroomDefinition {

    private final List<StudentGrade> listOfStudents;

    public Classroom(String filePath) throws IOException {
        this.listOfStudents = new StudentsFileReader(filePath).readFile();
    }


    @Override
    public List<Integer> getGradesForDiscipline(String discipline) {
        List<Integer> listOfGrades = new ArrayList<>();
        for (StudentGrade student : listOfStudents) {
            if (student.getDiscipline().equals(discipline)) {
                listOfGrades.add(student.getGrade());
            }
        }
        return listOfGrades;
    }

    @Override
    public List<Integer> getGradesForStudent(String studentName) {
        List<Integer> listOfGrades = new ArrayList<>();

        for (StudentGrade student : listOfStudents) {
            if (student.getName().equals(studentName)) {
                listOfGrades.add(student.getGrade());
            }
        }
        return listOfGrades;
    }

    @Override
    public StudentGrade getMaxGrade(String discipline) {
        int maxGrade = 0;
        StudentGrade studentGradeWithMaxGrade = null;
        for (StudentGrade student : listOfStudents) {
            if (student.getDiscipline().equals(discipline)) {
                if (maxGrade < student.getGrade()) {
                    maxGrade = student.getGrade();
                    studentGradeWithMaxGrade = student;
                }
            }
        }

        return studentGradeWithMaxGrade;
    }

    @Override
    public StudentGrade getMaxGrade() {
        int maxGrade = Integer.MIN_VALUE;
        StudentGrade maxGradeStudent = null;
        for (StudentGrade student : listOfStudents) {
            if (maxGrade < student.getGrade()) {
                maxGrade = student.getGrade();
                maxGradeStudent = student;
            }
        }
        return maxGradeStudent;
    }

    @Override
    public Integer getAverageGrade(String discipline) {
        int counter = 0;
        int sum = 0;

        for (StudentGrade student : listOfStudents) {
            if (student.getDiscipline().equals(discipline)) {
                sum += student.getGrade();
                counter++;
            }
        }
        return (sum / counter);
    }

    @Override
    public StudentGrade getWorstGrade(String discipline) {
        int minGrade = Integer.MAX_VALUE;
        StudentGrade minStudentGrade = null;

        for (StudentGrade student : listOfStudents) {
            if (student.getDiscipline().equals(discipline)) {
                if (minGrade > student.getGrade()) {
                    minGrade = student.getGrade();
                    minStudentGrade = student;
                }
            }
        }
        return minStudentGrade;
    }


    public List<Integer> getAllGrades(){
        List<Integer> allGrades = new ArrayList<>();
        for (StudentGrade studentGrade : listOfStudents){
            allGrades.add(studentGrade.getGrade());
        }
        return allGrades;
    }

    public List<StudentGrade> getAllStundets(){
        return listOfStudents;
    }


}
