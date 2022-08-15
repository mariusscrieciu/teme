package com.fasttrackit.budgetapp.exception;

public class TransactionAlreadyExists extends RuntimeException{

    public TransactionAlreadyExists(String message) {
        super(message);
    }
}
