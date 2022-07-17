package com.fasttrackit.exercices.plannerExceptions;

import com.fasttrackit.exercices.DailyPlanner;
import com.fasttrackit.exercices.Day;

import java.util.Scanner;

public class ConsoleApplication {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        DailyPlanner dailyPlanner = new DailyPlanner();

        while (true) {
            System.out.println("Please choose an option: ");
            System.out.println("1) Add an activity.");
            System.out.println("2) Remove an activity.");
            System.out.println("3) List all activities.");
            System.out.println("4) End planning.");
            System.out.println("5) Exit application.");

            System.out.println("  ");
            System.out.println("   ");
            System.out.print("Wait for user input: ");
            String option = console.nextLine();
            Scanner userInput = new Scanner(System.in);

            switch (option) {
                case "1": {
                    System.out.println("You will add now a new activity.");
                    System.out.print("day: ");
                    String day = userInput.next();
                    System.out.print("activity: ");
                    String activity = userInput.next();

                    dailyPlanner.addActivity(Day.valueOf(day.toUpperCase()), activity);
                    System.out.println("You have added a new activity: " + activity + " for day: " + day.toUpperCase());
                    System.out.println("   ");
                    System.out.println("   ");
                    break;
                }

                case "2": {
                    System.out.println("You will remove now an activity.");
                    System.out.print("day: ");
                    String day = userInput.next();
                    System.out.print("activity: ");
                    String activity = userInput.next();

                    dailyPlanner.removeActivity(Day.valueOf(day.toUpperCase()),activity);
                    System.out.println("You have removed activity: "+activity+" from day: "+day.toUpperCase());
                    System.out.println("   ");
                    System.out.println("   ");
                    break;
                }

                case "3":{
                    System.out.println("You will list all activities.");
                    System.out.print("day: ");
                    String day = userInput.next();

                    System.out.println("Activities for day: "+day.toUpperCase()+" are the following: "+dailyPlanner.getActivities(Day.valueOf(day.toUpperCase())));
                    System.out.println("   ");
                    System.out.println("   ");
                    break;
                }

                case "4":{
                    System.out.println("You will end planning.");
                    System.out.println("All planned activities by days are: "+dailyPlanner.endPlanning());
                    System.out.println("   ");
                    System.out.println("   ");
                    break;
                }
                case "5":
                    System.out.println("Closing the application...");
                    System.exit(0);

                default:
                    System.out.println("No option available. Please insert a value mentioned below.");
                    System.out.println("   ");

            }
        }

    }
}
