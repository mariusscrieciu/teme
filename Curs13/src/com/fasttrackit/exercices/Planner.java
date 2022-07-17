package com.fasttrackit.exercices;

import java.util.List;
import java.util.Map;

public interface Planner {

    public void addActivity(Day day, String activity);
    public void removeActivity(Day day, String activity);
    public List<String> getActivities(Day day);
    public Map<Day, List<String>> endPlanning();
}
