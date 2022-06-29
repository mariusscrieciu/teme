package com.fasttrackit;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {8,7,2,5,3,1};
        sumOfTriplets(numbers, 10);

    }


    public static void quickSort(int[] arr, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) {
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = arr[pivotIndex];
        swap(arr, pivotIndex, highIndex);

        int leftPointer = partition(arr, lowIndex, highIndex, pivot);

        quickSort(arr, lowIndex, leftPointer - 1);
        quickSort(arr, leftPointer + 1, highIndex);

    }


    private static int partition(int[] arr, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {

            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        swap(arr, leftPointer, highIndex);

        return leftPointer;
    }

    private static void swap(int[] arrToSwap, int index1, int index2) {
        int temp = arrToSwap[index1];
        arrToSwap[index1] = arrToSwap[index2];
        arrToSwap[index2] = temp;
    }


    public static void sumOfTriplets(int[] arrForSum, int targetSum) {
        quickSort(arrForSum, 0, arrForSum.length - 1);
        System.out.println("Sorted arr: "+Arrays.toString(arrForSum));
        for (int i = 0; i < arrForSum.length - 2; i++) {
            int left = i + 1;
            int right = arrForSum.length - 1;

            while (left < right) {
                if (arrForSum[i] + arrForSum[left] + arrForSum[right] == targetSum) {
                    System.out.println("Numerele cum suma " + targetSum + " sunt urmatoarele (" + arrForSum[i] + "," + arrForSum[left] + "," + arrForSum[right]+")");
                    left++;
                    right--;
                } else if (arrForSum[i] + arrForSum[left] + arrForSum[right] < targetSum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }
}
