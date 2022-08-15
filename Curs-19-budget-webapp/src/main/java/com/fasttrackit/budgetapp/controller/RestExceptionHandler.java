package com.fasttrackit.budgetapp.controller;


import com.fasttrackit.budgetapp.exception.TransactionAlreadyExists;
import com.fasttrackit.budgetapp.exception.TransactionNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class RestExceptionHandler {

    @ExceptionHandler(TransactionNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleTransactionNotFound(TransactionNotFound transactionNotFoundException){
        return new ErrorResponse(transactionNotFoundException.getMessage());

    }

    @ExceptionHandler(TransactionAlreadyExists.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleTransactionAlreadyExists(TransactionAlreadyExists transactionAlreadyExistsException){
        return new ErrorResponse(transactionAlreadyExistsException.getMessage());
    }


}

record ErrorResponse (String message){

}