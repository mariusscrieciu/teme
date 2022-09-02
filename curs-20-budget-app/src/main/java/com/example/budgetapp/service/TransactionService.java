package com.example.budgetapp.service;


import com.example.budgetapp.model.product.Product;
import com.example.budgetapp.model.transaction.Transaction;
import com.example.budgetapp.model.type.Type;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class TransactionService {


    public Transaction replaceTransaction(Integer id, Transaction transactionFromBody, Optional<Transaction> transactionFromDB) {
        Transaction transactionToReplace = transactionFromDB.get();
        transactionToReplace.setId(id);

        Product product = new Product();
        product.setId(id);
        product.setName(transactionFromBody.getProduct().getName());
        product.setPrice(transactionFromBody.getProduct().getPrice());
        transactionToReplace.setProduct(product);

        transactionToReplace.setType(transactionFromBody.getType());
        transactionToReplace.setAmount(transactionFromBody.getAmount());

        return transactionToReplace;
    }


    public Transaction updateTransaction(Integer id, Transaction transactionFromBody, Optional<Transaction> transactionFromDB) {

        Transaction transactionToBeUpdated = transactionFromDB.get();
        transactionToBeUpdated.setId(id);
        transactionToBeUpdated.setAmount(transactionFromBody.getAmount());

        Product product = transactionFromBody.getProduct();
        product.setId(id);
        transactionToBeUpdated.setProduct(product);

        return transactionToBeUpdated;
    }


    public List<Map<String, List<Map<String, String>>>> generateReportByProduct(List<Transaction> transactions) {
        List<Map<String, String>> sell = transactions
                .stream()
                .filter(transaction -> transaction.getType().equals(Type.SELL))
                .map(this::mapTransaction)
                .toList();

        List<Map<String, String>> buy = transactions
                .stream()
                .filter(transaction -> transaction.getType().equals(Type.BUY))
                .map(this::mapTransaction)
                .toList();

        Map<String, List<Map<String, String>>> mapResults = new HashMap<>();
        mapResults.put("SELL:", sell);
        mapResults.put("BUY:", buy);

        List<Map<String, List<Map<String, String>>>> results = new ArrayList<>();
        results.add(mapResults);
        return results;
    }

    public Map<String, Double> calculateSum(List<Transaction> transactions) {
        double sumSell = transactions
                .stream()
                .filter(transaction -> transaction.getType().equals(Type.SELL))
                .mapToDouble(transaction -> transaction.getAmount())
                .sum();

        double sumBuy = transactions
                .stream()
                .filter(transaction -> transaction.getType().equals(Type.BUY))
                .mapToDouble(transaction -> transaction.getAmount())
                .sum();

        Map<String, Double> resultMap = new HashMap<>();
        resultMap.put("Sum of SELL:", sumSell);
        resultMap.put("Sum of BUY:", sumBuy);
        return resultMap;
    }


    private Map<String, String> mapTransaction(Transaction transaction) {
        Map<String, String> map = new HashMap<>();
        map.put("type:" + transaction.getType(), "amount:" + transaction.getAmount());
        return map;
    }





}

