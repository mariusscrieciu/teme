package com.fasttrackit.animals;

public class Mouse implements Behavior{
    @Override
    public String walk() {
        return "mouse-walk";
    }

    @Override
    public String eat() {
        return "mouse-eat";
    }

    @Override
    public String talk() {
        return "mouse-talk";
    }
}
