package com.fasttrackit.budgetapp.exception;

public class TransactionNotFound extends RuntimeException{

    public TransactionNotFound(String message) {
        super(message);
    }
}
