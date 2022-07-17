package com.fasttrackit.exercices;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule {

    private Day day;

    private List<String> listOfActivities = new ArrayList<>();

    public DaySchedule(Day day) {
        this.day = day;

    }

    public List<String> getListOfActivities() {
        return listOfActivities;
    }

    public Day getDay() {
        return day;
    }

   public void addActivity(String activity){
       listOfActivities.add(activity);
   }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "day=" + day +
                ", listOfActivities=" + listOfActivities +
                '}';
    }
}
