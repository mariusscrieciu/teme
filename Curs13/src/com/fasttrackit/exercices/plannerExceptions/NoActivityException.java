package com.fasttrackit.exercices.plannerExceptions;

public class NoActivityException  extends RuntimeException{

    public NoActivityException() {
        super(" Activity is empty. PLease check your activity and add a valid one.");
    }
}
