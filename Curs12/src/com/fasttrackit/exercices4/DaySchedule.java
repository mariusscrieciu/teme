package com.fasttrackit.exercices4;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule {


    private DaysOfWeek day;

    private List<String> listOfActivities = new ArrayList<>();


    public DaysOfWeek getDay() {
        return day;
    }

    public List<String> getListOfActivities() {
        return listOfActivities;
    }
}
