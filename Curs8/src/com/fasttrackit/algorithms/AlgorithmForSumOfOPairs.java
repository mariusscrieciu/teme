package com.fasttrackit.algorithms;

import java.util.Arrays;

public class AlgorithmForSumOfOPairs {
    public static void main(String[] args) {

        int[] nums = {8,7,2,5,3,1};
        int targetSum = 10;
        sumOfPairs(nums, targetSum);
    }


    public static void sumOfPairs(int[] numbers, int target){
        for(int i = 0; i <= numbers.length-1; i++){
            for(int j = i+1; j <= numbers.length-1; j++){
                if(numbers[i] + numbers[j] == target){
                    System.out.println("Group of number with sum equal with "+target+" are the following: ("+numbers[i]+","+numbers[j]+")");
                }
            }
        }
    }
}
