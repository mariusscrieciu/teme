package com.fasttrackit.animals;

public class Cat implements Behavior {
    @Override
    public String walk() {
        return "cat-walk";
    }

    @Override
    public String eat() {
        return "cat-eat";
    }

    @Override
    public String talk() {
        return "cat-talk";
    }
}
