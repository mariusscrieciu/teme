package com.fasttrackit.exercices;

public class RegexExercices {

    public static void main(String[] args) {
        String text = "Ana are mere, pere si in plus mai are si mure.";
        String fixedText = text.replaceAll("^m.+e$","*");


        System.out.println("Unfixed text: "+text);
        System.out.println("Fixed text: "+fixedText);
    }
}
