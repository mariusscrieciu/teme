package com.fasttrackit.exercices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StudentsFileReader {


    private String filePath;

    public StudentsFileReader(String filePath) {
        this.filePath = filePath;
    }

    public List<StudentGrade> readFile() throws IOException {
        List<StudentGrade> listOfStudents = new ArrayList<>();
        FileReader fileReader = new FileReader(filePath);
        BufferedReader reader = new BufferedReader(fileReader);

        String line;
        while ((line = reader.readLine()) != null){
            listOfStudents.add(fromLine(line));
        }
        return listOfStudents;
    }



    private StudentGrade fromLine(String line){
        String[] tokens = line.split(Pattern.quote("|"));

        return new StudentGrade(tokens[0],tokens[1], Integer.parseInt(tokens[2]));
    }
}
