package com.fasttrackit.main;

import com.fasttrackit.exercices.DailyPlanner;
import com.fasttrackit.exercices.Day;

public class Main {
    public static void main(String[] args) {

        DailyPlanner planner = new DailyPlanner();


        //public void addActivity(Day day, String activity)
        System.out.println("---Add an activity---");
        planner.addActivity(Day.SUNDAY,"Hiking");
        planner.addActivity(Day.MONDAY,"Driving");
        planner.addActivity(Day.MONDAY,"Volunteer");
        planner.addActivity(Day.TUESDAY,"Explore somewhere new");
        planner.addActivity(Day.WEDNESDAY,"Jogging");
        planner.addActivity(Day.THURSDAY,"Running");
        planner.addActivity(Day.FRIDAY,"Cooking");
        planner.addActivity(Day.SATURDAY,"Sudoku");
        System.out.println(planner.getActivities(Day.MONDAY));

        //public void removeActivity(Day day, String activity);
        System.out.println("---Remove an activity---");
        planner.removeActivity(Day.MONDAY,"Driving");
        System.out.println(planner.getActivities(Day.MONDAY));

        //public List<String> getActivities(Day day);
        System.out.println("---Get all activities for a day---");
        System.out.println(planner.getActivities(Day.SUNDAY));

        //public Map<Day, List<String>> endPlanning();
        System.out.println("---End planning---");
        System.out.println(planner.endPlanning());





    }
}
