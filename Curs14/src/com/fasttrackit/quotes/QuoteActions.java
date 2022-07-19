package com.fasttrackit.quotes;

import java.util.List;

public interface QuoteActions {


    public List<String> getAllQuotes();
    public List<Quote> getQuotesForAuthor(String author);
    public List<String> getAuthors();
    public void setFavourites(int id);
    public List<Quote> getFavourites();
    public String getRandomQuote();
}
