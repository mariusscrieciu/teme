package com.fasttrackit.exercices;

import java.util.Arrays;
import java.util.Random;

public class MainExercices {


    public static void main(String[] args) {
        System.out.println("|------Exercices 1 --------|");
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Suma numerelor este: "+function1(numbers));

        System.out.println("|------Exercices 2 --------|");
        System.out.println("Numarul de elemente pare este: "+function2(numbers));

        System.out.println("|------Exercices 3 --------|");
        System.out.println(" Numerele sunt: "+ Arrays.toString(function3(numbers,3)));

        System.out.println("|------Exercices 4 --------|");
        function4(1000);

        System.out.println("|------Exercices 5 --------|");
        function5(1000, 20 );

        System.out.println("|------Exercices 6 --------|");
        String phrase = "Ana are multe mere.Mere sunt mari.Merele sunt galbene";
        function6(phrase);

    }



    public static int function1(int[] numbers){
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }


    public static int function2(int[] numbers){
        int counter = 0;
        for(int number : numbers){
            if(number % 2 ==0){
                counter++;
            }
        }
        return counter;
    }


    public static int[] function3(int[] numbers, int checkNumber){
        int[] numberGreaterThan = new int[numbers.length];
        int indexSecondArr = 0;

        for(int i=0 ;  i<= numbers.length-1; i++){
            if(numbers[i] > checkNumber){
                numberGreaterThan[indexSecondArr] = numbers[i];
                indexSecondArr++;
            }
        }
        
        return numberGreaterThan;
    }

    public static void function4(int targetValue){
        Random random = new Random();
        int value = 0;

        while(value < targetValue){
            value += random.nextInt(50)+1;
        }
        System.out.println("Felicitari, donatiile au atins suma dorita "+targetValue);
    }

    public static void function5(int targetValue, int maxNumberOfDonations){
        Random random = new Random();
        int value = 0;
        int numberOfDonations = 0;

        while(value < targetValue){
            numberOfDonations++;
            value += random.nextInt(50)+1;
            if(numberOfDonations == maxNumberOfDonations){
                System.out.println(" Numarul maxim de donatii a fost atins. Va multumim!!!");
            }
        }
    }

    public static void function6(String phrase){
        String[] elements = phrase.split("\\.");
        for(String s: elements){
            System.out.println(s);
        }
    }


}
