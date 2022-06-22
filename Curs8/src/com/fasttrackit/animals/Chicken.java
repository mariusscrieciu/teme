package com.fasttrackit.animals;


public class Chicken implements Behavior {


    @Override
    public String walk() {
        return "chicken-walk";
    }

    @Override
    public String eat() {
        return "chicken-eat";
    }

    @Override
    public String talk() {
        return "chicken-talk";
    }
}
