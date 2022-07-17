package com.fasttrackit.exercices3;

import com.fasttrackit.exercices3.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeOperations {

    private Employee e1 = new Employee("Marius",29,"black","BT",2400);
    private Employee e2 = new Employee("Madalin",39,"red","ING",7000);
    private Employee e3 = new Employee("David",24,"green","Deutsche Bank",9100);
    private Employee e4 = new Employee("Razvan",29,"pink","BT",9870);
    private Employee e5 = new Employee("Mihai",24,"black","ING",14500);
    private Employee e6 = new Employee("Bogdan",39,"pink","OVB",6070);

    private List<Employee> employees = List.of(e1,e2,e3,e4,e5,e6);


    public EmployeeOperations() {
    }


    public void salaryMoreThan(int value) {
        List<String> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSalary() > value) {
                result.add(employee.getName());
            }
        }
        System.out.println(" Employees with salary grater than "+value+" are: "+result);
    }


    public void mapEmployeesToCompany(){
        Map<String, List<String>> result = new HashMap<>();
        List<String> companies = new ArrayList<>();

        for(Employee employee : employees){
            companies.add(employee.getCompany());
        }

        for(String company : companies){
            List<String> temp = new ArrayList<>();
            for(Employee employee : employees){
                if(employee.getCompany().equals(company)){
                    temp.add(employee.getName());
                }
            }
            result.put(company, temp);
        }
        System.out.println(" Employees mapped to company: "+result);
    }

    public void sumOfAllSalaries(){
        int sum = 0;
        for(Employee employee : employees){
            sum += employee.getSalary();
        }
        System.out.println(" Sum of all salaries: "+sum);
    }

    public void biggestSalary(){
        int maxSalary = Integer.MIN_VALUE;
        String companyName = null;
        for(Employee employee: employees){
            if(employee.getSalary() > maxSalary){
                maxSalary =(int)employee.getSalary();
                companyName = employee.getCompany();
            }
        }

        System.out.println(" Biggest salary is offerd by: <"+companyName+":"+maxSalary+">");
    }
}
