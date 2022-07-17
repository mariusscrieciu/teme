package com.fasttrackit.exercices.plannerExceptions;

public class NoActivitiesForDayException extends RuntimeException{

    public NoActivitiesForDayException(String message) {
        super(" You don't have an activity defined for day "+message);
    }
}
