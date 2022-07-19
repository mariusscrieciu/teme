package com.fasttrackit;

import com.fasttrackit.quotes.QuoteService;

public class Main {
    public static void main(String[] args) {
        QuoteService service = new QuoteService();

        System.out.println(service.getQuotesForAuthor("Henri Amiel"));
        service.setFavourites(3665);
        System.out.println(service.getFavourites());

        System.out.println(service.getRandomQuote());


    }
}
