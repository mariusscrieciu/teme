package com.fasttrackit.banking;


public class Person {

    private String name;
    private int age;
    private String cnp;
    private Account account;

    public Person(Account account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cnp='" + cnp + '\'' +
                ", account=" + account +
                '}';
    }
}
