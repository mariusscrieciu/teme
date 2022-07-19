package com.fasttrackit.quotes;

import java.util.*;

public class QuoteService implements QuoteActions{

   List<Quote> quoteFile = QuoteFile.read();


    public QuoteService() {
    }

    @Override
    public List<String> getAllQuotes() {
        List<String> quotes = new ArrayList<>();
        for(Quote quote : quoteFile){
            quotes.add(quote.getQuote());
        }
        return quotes;
    }

    @Override
    public List<Quote> getQuotesForAuthor(String author) {
       List<Quote> quotesByAuthor = new ArrayList<>();

       for(Quote quote : quoteFile){
           if(quote.getAuthor().equals(author)){
               quotesByAuthor.add(quote);
           }
       }


        return quotesByAuthor;
    }

    @Override
    public List<String> getAuthors() {
       Set<String> authors = new HashSet<>();
       for(Quote quote : quoteFile){
           authors.add(quote.getAuthor());
       }
       return new ArrayList<>(authors);
    }

    @Override
    public void setFavourites(int id) {
        Quote favouriteQuote = null;
        int minNumberOfQuotes = 0;
        int maxNumberOfQuotes = 0;
        if(!quoteFile.isEmpty()){
             minNumberOfQuotes = 1;
             maxNumberOfQuotes = quoteFile.size();

             for(Quote quote :quoteFile) {
                 if (id > minNumberOfQuotes && id < maxNumberOfQuotes) {
                     if(quote.getId() == id){
                         quote.setFavourite(true);
                         favouriteQuote = quote;
                     }
                 }
             }
        }
        System.out.println(" Quote "+favouriteQuote +" is set as favourite");
    }

    @Override
    public List<Quote> getFavourites() {
        List<Quote> favouritesQuotes = new ArrayList<>();
        for(Quote quote : quoteFile){
            if(quote.isFavourite()){
                favouritesQuotes.add(quote);
            }
        }

        return favouritesQuotes;
    }

    @Override
    public String getRandomQuote() {
        String result = null;
        int maxRange = quoteFile.size();
        Random r = new Random();
        int randomId= r.nextInt(maxRange)  + 1;
        for(Quote quote :quoteFile){
            if(quote.getId() == randomId){
                result = quote.getQuote();
            }
        }
        return result;
    }
}
