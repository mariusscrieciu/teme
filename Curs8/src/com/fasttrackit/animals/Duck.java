package com.fasttrackit.animals;

public class Duck implements Behavior{

    @Override
    public String walk() {
        return "duck-walk";
    }

    @Override
    public String eat() {
        return "duck-eat";
    }

    @Override
    public String talk() {
        return "duck-talk";
    }
}
