package com.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class PersonServiceTest {

    List<Person> personList = List.of(
            new Person("marius","Scrieciu",30, "Bucharest"),
            new Person("Mircea","Popescu",28, "Oradea"),
            new Person("Alina","Stanciu",34, "Pitesti"),
            new Person("Ionut","Ilie",29, "Cluj"),
            new Person("Mihai","Ionescu",52, "Tr. Magurele"),
            new Person("Oana","Marinescu",16, "Constanta"),
            new Person("Mihaela","Marinescu",16, "Oradea"),
            new Person("marius","Dumitrache",72, "Cluj"),
            new Person("Florian","Mateescu",61, "Deva")

    );

    PersonService personService = new PersonService();

    @Test
    public void testListAllPersonsFirstNameAndLastName(){
           List<String> persons = personService.listAllFirstNameAndLastName(personList);
           for(Person person : personList){
               String firstAndLastName = person.getFirstName()+" "+person.getLastName();
               System.out.println("First and Last name: "+firstAndLastName);
               Assertions.assertThat(persons).contains(firstAndLastName);
           }
    }


    @Test
    public void testAllPersonsThatAreMajor(){
        List<Person> persons = personService.listAllPersonsThatAreMajor(personList);
        for (Person person : persons){
            System.out.println("Age for "+person.getLastName()+" is: "+person.getAge());
            Assertions.assertThat(person.getAge()).isGreaterThan(18);
        }
    }


    @Test
    public void testAllPersonsFromOradea(){
        List<Person> persons = personService.listAllPersonsFromOradea(personList);
        for(Person person : persons){
            Assertions.assertThat(person.getCity()).isEqualToIgnoringCase("ORADEA");
            System.out.println(person.getLastName()+ " is from "+person.getCity());
        }

    }


    @Test
    public void testAllPersonsFromOradeaAnCluj(){
        List<Person> persons = personService.listAllPersonFromOradeaOrCluj(personList);
        for(Person person : persons){
            Assertions.assertThat(person.getCity()).satisfiesAnyOf(
                    p -> assertThat(p).isEqualToIgnoringCase("ORADEA"),
                    p -> assertThat(p).isEqualToIgnoringCase("CLUJ")
            );
            System.out.println(person.getLastName()+ " is from "+person.getCity());
        }


    }

    @Test
    public void testFirstLetterCapitalized(){
        List<String> persons = personService.listAllFirstNamesCapitalized(personList);
        for(String person : persons){
            System.out.println(person);
            Assertions.assertThat(person.toUpperCase().substring(0,1)).isUpperCase();
        }
    }


    @Test
    public void testIfNameHaveCustomFormat(){
        List<String> persons = personService.listPersonNamesCustom(personList);
        for(Person person : personList){
            String customName = person.getFirstName()+" "+person.getLastName().substring(0,1)+".";
            System.out.println("Custom name: "+customName.toUpperCase());
            Assertions.assertThat(persons).contains(customName);
        }
    }


    @Test
    public void testIfAgeIsBetween18And60(){
        List<Person> persons = personService.listAllPersonsBetween18And60(personList);
        for(Person person : persons){
            Assertions.assertThat(person.getAge()).satisfies(
                    p -> assertThat(p).isGreaterThan(18),
                    p -> assertThat(p).isLessThan(60)
            );
        }
    }

    @Test
    public void testIfFistNameStatWithA(){
        List<Person> persons = personService.listAllPersonStartingWithA(personList);
        for(Person person : persons){
            Assertions.assertThat(person.getFirstName()).startsWith("A");
        }
    }


    @Test
    public void testIfFirstNamesAreUnique(){
        Set<String> persons = personService.allUniquelyNames(personList);
        Assertions.assertThat(persons).doesNotHaveDuplicates();
    }
}
