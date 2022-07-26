package com.fasttrackit;

import com.fasttrackit.person.Person;
import com.fasttrackit.person.PersonService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.List;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PersonTest {


    @Test
    public void testPersonCreation() {
        Person person = new Person();
        person.setId(1);
        person.setName("Marius");
        person.setAge(29);
        Assertions.assertThat(person).isNotNull();
    }

    @Test
    public void testIdValue() {
        Person person = new Person();
        person.setId(10);
        person.setName("Madalin");
        person.setAge(100);
        Assertions.assertThat(person.getId()).isGreaterThan(0);
    }

    @Test
    public void testNameValue() {
        Person person = new Person();
        person.setId(2);
        person.setName("Stefan");
        person.setAge(56);
        Assertions.assertThat(person.getName()).isNotEmpty();
    }

    @Test
    public void testAgeValue() {
        Person person = new Person();
        person.setId(9);
        person.setName("Ionut");
        person.setAge(119);
        Assertions
                .assertThat(person.getAge())
                .isGreaterThan(1)
                .isLessThan(120);
    }


    @Test
    public void testAddPerson() {
        Person person = new Person();
        person.setName("Ivan");
        person.setAge(25);

        PersonService service = new PersonService();
        Person newPerson = service.addPerson(person);
        Assertions.assertThat(newPerson.getId()).isGreaterThan(0);
    }


    @Test
    @Order(1)
    public void testRemovePerson() {
        Person p1 = new Person();
        p1.setName("Cristian");
        p1.setAge(32);

        Person p2 = new Person();
        p2.setName("Bogdan");
        p2.setAge(42);

        PersonService service = new PersonService();
        service.addPerson(p1);
        service.addPerson(p2);

        Person removedPerson = service.removePerson(2);
        System.out.println(removedPerson);
        Assertions.assertThat(removedPerson.getId()).isEqualTo(2);
    }


    @Test
    public void testGetAllPersons() {
        Person p1 = new Person();
        p1.setName("Cristian");
        p1.setAge(32);

        Person p2 = new Person();
        p2.setName("Alin");
        p2.setAge(42);


        PersonService service = new PersonService();
        service.addPerson(p1);
        service.addPerson(p2);

        List<Person> allPerson = service.getAllPersons();
        Assertions
                .assertThat(allPerson)
                .isNotEmpty();


    }


    @Test
    public void testGetAllPersonsOlderThan() {
        Person p1 = new Person();
        p1.setName("Cristian");
        p1.setAge(32);

        Person p2 = new Person();
        p2.setName("Alin");
        p2.setAge(42);

        Person p3 = new Person();
        p2.setName("Alin");
        p2.setAge(120);

        PersonService service = new PersonService();
        service.addPerson(p1);
        service.addPerson(p2);
        service.addPerson(p3);

        List<Person> olderThan = service.getPersonsOlderThan(30);
        Assertions.assertThat(olderThan).isNotEmpty();
        for (Person p : olderThan) {
            Assertions
                    .assertThat(p.getAge())
                    .isNotNegative()
                    .isLessThan(120);

            System.out.println(p);

        }
    }

    @Test
    public void testGetAllPersonNames() {
        Person p1 = new Person();
        p1.setName("Cristian");
        p1.setAge(32);

        Person p2 = new Person();
        p2.setName("Alin");
        p2.setAge(42);

        Person p3 = new Person();
        p2.setName("Mircea");
        p2.setAge(27);

        PersonService service = new PersonService();
        service.addPerson(p1);
        service.addPerson(p2);
        service.addPerson(p3);

        List<String> names = service.getAllPersonNames();
        Assertions.assertThat(names).isNotEmpty();

    }


    @Test
    public void testGetPersonByName(){
        Person p1 = new Person();
        p1.setName("Cristian");
        p1.setAge(32);

        Person p2 = new Person();
        p2.setName("Alin");
        p2.setAge(42);

        Person p3 = new Person();
        p3.setName("Alex");
        p3.setAge(10);

        PersonService service = new PersonService();
        service.addPerson(p1);
        service.addPerson(p2);
        service.addPerson(p3);

        Person person = service.getPerson("Alin");

        Assertions.assertThat(person).isNotNull();
        Assertions.assertThat(person.getName()).isEqualTo("Alin");
    }

    @Test
    public void testGetPersonById(){
        Person p1 = new Person();
        p1.setName("Catalin");
        p1.setAge(22);

        PersonService service = new PersonService();
        service.addPerson(p1);
        service.printAllPersonsFromCurrentList();

        Person person = service.getPersonById(3);

        Assertions.assertThat(person.getId()).isEqualTo(3);




    }

}
