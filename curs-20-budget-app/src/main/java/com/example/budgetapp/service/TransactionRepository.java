package com.example.budgetapp.service;

import com.example.budgetapp.model.transaction.Transaction;
import com.example.budgetapp.model.type.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

    Transaction findById(int id);

    List<Transaction> findAll();

    List<Transaction> findByType(Type type);

    @Query("SELECT t FROM Transaction t where t.amount < ?1")
    List<Transaction> findMinAmount(double amount);

    @Query("SELECT t FROM Transaction t where t.amount > ?1")
    List<Transaction> findMaxAmount(double amount);

    List<Transaction> findTransactionsByTypeAndAmountIsLessThan(Type type, double amount);

    List<Transaction> findTransactionsByTypeAndAmountIsGreaterThan(Type type, double amount);

    @Query("SELECT t FROM Transaction t where t.amount > ?1 and t.amount < ?2")
    List<Transaction> findTransactionsByMinAndMax(double minAmount, double maxAmount);

    @Query("select t from Transaction t where t.type = ?1 and t.amount > ?2 and t.amount < ?3")
    List<Transaction> findTransactionsByTypeAndMinAndMax(Type type, double minAmount, double maxAmount);

}
