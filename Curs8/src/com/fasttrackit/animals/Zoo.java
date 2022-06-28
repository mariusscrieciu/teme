package com.fasttrackit.animals;

public class Zoo {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();
        Chicken chicken = new Chicken();

        System.out.println(cat.eat());
        System.out.println(cat.talk());
        System.out.println(cat.walk());
    }
}
