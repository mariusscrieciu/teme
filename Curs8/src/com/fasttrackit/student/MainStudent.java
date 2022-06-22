package com.fasttrackit.student;

public class MainStudent {


    public static void main(String[] args) {
         Student student1 = new Student("Marius", 9.25);
         Student student2 = new Student("Razvan", 8.75);
         Student student3 = new Student("Mircea", 9);

        System.out.println("Nota studentului "+student1.getName()+" este: "+student1.getGrade());
        System.out.println("Nota studentului "+student2.getName()+" este: "+student2.getGrade());
        System.out.println("Nota studentului "+student3.getName()+" este: "+student3.getGrade());

        System.out.println("Media notelor este: "+ Student.averageGrade());


    }

}
