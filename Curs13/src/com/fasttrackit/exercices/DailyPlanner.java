package com.fasttrackit.exercices;

import com.fasttrackit.exercices.plannerExceptions.NoActivitiesForDayException;
import com.fasttrackit.exercices.plannerExceptions.NoActivityException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DailyPlanner implements Planner {




    DaySchedule sunday = new DaySchedule(Day.SUNDAY);
    DaySchedule monday = new DaySchedule(Day.MONDAY);
    DaySchedule tuesday = new DaySchedule(Day.TUESDAY);
    DaySchedule wednesday = new DaySchedule(Day.WEDNESDAY);
    DaySchedule thursday = new DaySchedule(Day.THURSDAY);
    DaySchedule friday = new DaySchedule(Day.FRIDAY);
    DaySchedule saturday = new DaySchedule(Day.SATURDAY);

    private List<DaySchedule> daySchedules = List.of(sunday,monday,tuesday,wednesday,thursday,friday,saturday);



    @Override
    public void addActivity(Day day, String activity) {

        for(DaySchedule daySchedule : daySchedules){
            if (daySchedule.getDay().equals(day)){
                if(activity == null || activity.length() < 1){
                    throw new NoActivityException();
                }else {
                    daySchedule.getListOfActivities().add(activity);
                }
            }
        }

    }

    @Override
    public void removeActivity(Day day, String activity) {
        for(DaySchedule daySchedule : daySchedules){
            if (daySchedule.getDay().equals(day)){
                if(activity == null || activity.length() < 1){
                    throw new NoActivityException();
                }else {
                    List<String> listOfActivities = daySchedule.getListOfActivities();
                    if(!listOfActivities.isEmpty()){
                        daySchedule.getListOfActivities().remove(activity);
                    }
                }
            }
        }
    }

    @Override
    public List<String> getActivities(Day day) {
        List<String> activities = null;
        for(DaySchedule daySchedule : daySchedules){
            if(daySchedule.getDay().equals(day)){
                activities = daySchedule.getListOfActivities();
            }
        }
        return activities;
    }

    @Override
    public Map<Day, List<String>> endPlanning() {
        Map<Day, List<String>> activities = new HashMap<>();

        for(DaySchedule daySchedule : daySchedules){
            List<String> loa = daySchedule.getListOfActivities();
            if(loa.isEmpty()){
                throw new NoActivitiesForDayException(daySchedule.getDay().name());
            }else {
                activities.put(daySchedule.getDay(),daySchedule.getListOfActivities());
            }
        }
        return activities;
    }


}
