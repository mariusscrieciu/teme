package com.fasttrackit.budgetapp.controller.transaction;


import com.fasttrackit.budgetapp.model.transaction.Transaction;
import com.fasttrackit.budgetapp.service.transcation.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/transactions")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;


    @GetMapping
    public List<Transaction> getAll() {
        return transactionService.getAll();
    }


    @GetMapping("/{id}")
    public Transaction getTransaction(@PathVariable int id) {
        return transactionService.getTransaction(id);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public Transaction addTransaction(@RequestBody Transaction transaction) {
        return transactionService.addNewTransaction(transaction);
    }

    @PutMapping(value = "/{id}", consumes = "application/json", produces = "application/json")
    public List<Transaction> replaceTransaction(@RequestBody Transaction transaction, @PathVariable int id) {
        transactionService.replaceTransaction(id, transaction);
        return transactionService.getAll();
    }


    @DeleteMapping("/{id}")
    public List<Transaction> deleteTransaction(@PathVariable int id){
        transactionService.deleteTransaction(id);
        return transactionService.getAll();
    }


    @GetMapping("/reports/type")
    public List<HashMap<String,String>> getReportTypes(){
        return transactionService.generateReportByType();
    }

    @GetMapping("/reports/product")
    public HashMap<String, Object> getReportByProduct(){
        return transactionService.generateReportsByProduct();
    }

}
