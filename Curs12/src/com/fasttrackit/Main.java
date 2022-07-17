package com.fasttrackit;

import com.fasttrackit.exercices1.Student;
import com.fasttrackit.exercices2.PersonOperations;
import com.fasttrackit.exercices3.EmployeeOperations;
import com.fasttrackit.extramile.Shop;

public class Main {

    public static void main(String[] args) {


        //--------------Exercices 1

        Student student = new Student();
        student.printStudentsAndGrades();
        System.out.println("Highest grade is: "+ student.printTheHighestGrade());

        //--------------Exercices 2

        PersonOperations personOperations = new PersonOperations();
        personOperations.extractNames();
        personOperations.mapNameToAge();
        personOperations.personOlderThan(30);
        personOperations.mapNamesToHairColor();
        personOperations.mapAgesToPerson();

        //--------------Exercices 3 & 4

        EmployeeOperations employeeOperations = new EmployeeOperations();
        employeeOperations.salaryMoreThan(10000);
        employeeOperations.mapEmployeesToCompany();
        employeeOperations.sumOfAllSalaries();
        employeeOperations.biggestSalary();


        //--------------Extra Mile
        Shop shop = new Shop();
        shop.mapCarNameToNumberOfCars();
        shop.mapCarNameToSumOfKm();
        shop.mapKmRangeToListOfCars();
        shop.mapPriceRangeToListOfCars();





    }

}
