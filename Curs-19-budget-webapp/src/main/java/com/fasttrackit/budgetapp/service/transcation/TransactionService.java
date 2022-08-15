package com.fasttrackit.budgetapp.service.transcation;


import com.fasttrackit.budgetapp.exception.TransactionAlreadyExists;
import com.fasttrackit.budgetapp.exception.TransactionNotFound;
import com.fasttrackit.budgetapp.model.transaction.Transaction;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TransactionService {

    private final TransactionHandler transactionHandler;

    public List<Transaction> getAll() {
        return transactionHandler.getTransactions();
    }

    public Transaction getTransaction(int id){
        return transactionHandler.getTransactions()
                .stream()
                .filter(t -> t.getId() == id)
                .findAny()
                .orElseThrow(() -> new TransactionNotFound("No transaction found for id:"+id));
    }

    public Transaction addNewTransaction(Transaction transaction){
        int id = transactionHandler.getTransactions()
                .stream().filter( t -> t.getId() == transaction.getId())
                .map(t -> transaction.getId())
                .findAny().orElse(-1);
      if(id == transaction.getId()){
          throw new TransactionAlreadyExists("Transaction with id: "+transaction.getId()+" already exists");
      }
        return transactionHandler.addTransaction(transaction);
    }

    public void replaceTransaction(int id, Transaction transaction){
        transactionHandler.replaceTransaction(id, transaction);
    }

    public void deleteTransaction(int id){
        transactionHandler.deleteTransaction(id);
    }

    public List<HashMap<String,String>> generateReportByType(){
        return transactionHandler.getReportTypes();
    }

    public HashMap<String, Object> generateReportsByProduct(){
        List<HashMap<String,String>> transactions = transactionHandler.getReportTypes();

        List<HashMap<String, String>> sell = transactions.stream()
                .filter(t -> t.containsKey("type:SELL"))
                .toList();

        List<HashMap<String,String>> buy = transactions.stream()
                .filter( t -> t.containsKey("type:BUY"))
                .toList();


        HashMap<String, Object> finalMap = new HashMap<>();
        finalMap.put("SELL:",sell);
        finalMap.put("BUY:",buy);

        return finalMap;

    }


}
