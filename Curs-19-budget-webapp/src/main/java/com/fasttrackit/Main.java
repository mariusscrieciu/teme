package com.fasttrackit;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String input = "cool";
        System.out.println("Input string: "+input);
        System.out.println("Output string version1: "+reverseString1(input));
        System.out.print("Output string version2: ");
        reverseString2(input);

    }

    private static String reverseString1(String input){
        return new StringBuilder(input).reverse().toString();
    }

    private static void reverseString2(String input){
        String[] chars = input.split("");
        for(int i = chars.length-1; i >= 0; i--){
            System.out.print(chars[i]);
        }
    }
}
