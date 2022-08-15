package com.fasttrackit.budgetapp.service.transcation;

import com.fasttrackit.budgetapp.model.transaction.Transaction;

import java.util.List;

public interface TransactionProvider {

    public List<Transaction> getTransactions();

    public Transaction addTransaction(Transaction transaction);

    public void replaceTransaction(int id, Transaction transaction);

    public void deleteTransaction(int id);
}
