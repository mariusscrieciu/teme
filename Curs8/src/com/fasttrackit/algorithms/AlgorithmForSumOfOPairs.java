package com.fasttrackit.algorithms;

import java.util.Arrays;

public class AlgorithmForSumOfOPairs {
    public static void main(String[] args) {

        int[] nums = {8,7,2,5,3,1};
        sumOfPairs(nums, 10);
        //sumOfPairsV2(nums, 10);

    }





    public static void sumOfPairs(int[] numbers, int target){
        int[] duplicateArray = Arrays.copyOf(numbers, numbers.length);
        for(int i = 0; i <= numbers.length-1; i++){
            for(int j = 0; j <= duplicateArray.length-1; j++){
                int n = numbers[i];
                int d = duplicateArray[j];
                int sum = d +n;
                if( sum == target){
                    System.out.println("Group of number with sum equal with "+target+" are the following: ("+n+","+d+")");
                }
            }
        }
    }

    public static void sumOfPairsV2(int[] numbers, int target){

        int pointer = 0;
        int arraySize = numbers.length-1;

        for(int i = 0 ; i <= arraySize; i++){
            int sum = numbers[i] + numbers[pointer];
            if(sum == target){
                System.out.println("Group of number with sum equal with "+target+" are the following: ("+numbers[pointer]+","+numbers[i]+")");
            }
            if(i == arraySize){
                pointer++;
                i = -1;
                if(pointer > arraySize){
                    break;
                }
            }
        }
    }

}
