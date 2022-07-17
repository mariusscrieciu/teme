package com.fasttrackit.exercices;

import java.util.List;

public interface ClassroomDefinition {


    public List<Integer> getGradesForDiscipline(String discipline);
    public List<Integer> getGradesForStudent(String student);
    public StudentGrade getMaxGrade(String discipline);
    public StudentGrade getMaxGrade();
    public Integer getAverageGrade(String discipline);
    public StudentGrade getWorstGrade(String discipline);
}
