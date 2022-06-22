package com.fasttrackit.animals;

public class Dog implements Behavior{


    @Override
    public String walk() {
        return "dog-walk";
    }

    @Override
    public String eat() {
        return "dog-eat";
    }

    @Override
    public String talk() {
        return "dog-talk";
    }
}
