package com.fasttrackit.exercices;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGenerator {


    private List<StudentGrade> students;

    public ReportGenerator(List<StudentGrade> students) {
        this.students = students;
    }

    public void generateReport() throws IOException {
        FileWriter fileWriter = new FileWriter("files/grade-reports.out");
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write("Cea mai mare nota: "+studentWithMaxGrade());
        writer.newLine();
        writer.write("Nota medie: "+averageGrades());
        writer.newLine();
        writer.write("Cea mai mica nota: "+studentWithMinGrade());
        writer.flush();
    }



    private String studentWithMaxGrade(){
        int maxGrade = Integer.MIN_VALUE;
        String studentName = null;

        for (StudentGrade student : students){
            if(maxGrade < student.getGrade()){
                maxGrade = student.getGrade();
                studentName = student.getName();
            }
        }
        return studentName+" "+maxGrade;
    }


    private Integer averageGrades(){
        int sum =0;
        int counter = 0;

        for(StudentGrade student : students){
            sum += student.getGrade();
            counter++;
        }

        return sum / counter;
    }

    private String studentWithMinGrade(){
        int maxGrade = Integer.MAX_VALUE;
        String studentName = null;

        for (StudentGrade student : students){
            if(maxGrade > student.getGrade()){
                maxGrade = student.getGrade();
                studentName = student.getName();
            }
        }
        return studentName+" "+maxGrade;
    }
}

