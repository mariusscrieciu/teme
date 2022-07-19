package com.fasttrackit.quotes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class QuoteFile {


    private static final String filePath = "files/quotes.txt";


    public QuoteFile() {
    }


    public static List<Quote> read(){
        List<Quote> quoteFile = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader( new FileReader(filePath));
            String line;
            int idCounter = 1;
            while ((line = reader.readLine()) != null){
                String [] lineElements = line.split("~");
                quoteFile.add( new Quote( idCounter,lineElements[0], lineElements[1]));
                idCounter++;
            }

        } catch (Exception e) {
            System.out.println("Unable to read file.");
        }
        return quoteFile;
    }
}
