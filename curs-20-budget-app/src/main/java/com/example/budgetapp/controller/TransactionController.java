package com.example.budgetapp.controller;


import com.example.budgetapp.model.transaction.Transaction;
import com.example.budgetapp.model.type.Type;
import com.example.budgetapp.service.TransactionRepository;
import com.example.budgetapp.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/transactions")
@RequiredArgsConstructor
public class TransactionController {


    private final TransactionRepository transactionRepository;
    private final TransactionService transactionService;


    @GetMapping(params = "type")
    public List<Transaction> getTransactionByTye(@RequestParam("type") Type type) {
        return transactionRepository.findByType(type);
    }

    @GetMapping(params = "minAmount")
    public List<Transaction> getTransactionsByMinAmount(@RequestParam("minAmount") Double minAmount) {
        return transactionRepository.findMinAmount(minAmount);
    }

    @GetMapping(params = "maxAmount")
    public List<Transaction> getTransactionsByMaxAmount(@RequestParam("maxAmount") Double maxAmount) {
        return transactionRepository.findMaxAmount(maxAmount);
    }

    @GetMapping(params = {"type", "minAmount"})
    public List<Transaction> getTransactionByTypeAndMinAmount(@RequestParam("type") Type type, @RequestParam("minAmount") Double minAmount) {
        return transactionRepository.findTransactionsByTypeAndAmountIsLessThan(type, minAmount);
    }

    @GetMapping(params = {"type", "maxAmount"})
    public List<Transaction> getTransactionByTypeAndMaxAmount(@RequestParam("type") Type type, @RequestParam("maxAmount") Double maxAmount) {
        return transactionRepository.findTransactionsByTypeAndAmountIsGreaterThan(type, maxAmount);
    }

    @GetMapping(params = {"minAmount", "maxAmount"})
    public List<Transaction> getTransactionsByTypeAndMaxAmount(@RequestParam("minAmount") Double minAmount, @RequestParam("maxAmount") Double maxAmount) {
        return transactionRepository.findTransactionsByMinAndMax(minAmount, maxAmount);
    }

    @GetMapping(params = {"type", "minAmount", "maxAmount"})
    public List<Transaction> getTransactionByTypeAndMinAmountAndMaxAmount(
            @RequestParam("type") Type type,
            @RequestParam("minAmount") Double minAmount,
            @RequestParam("maxAmount") Double maxAmount) {
        return transactionRepository.findTransactionsByTypeAndMinAndMax(type, minAmount, maxAmount);
    }


    @GetMapping("{id}")
    public Transaction getTransactionById(@PathVariable int id) {
        return transactionRepository.findById(id);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public Transaction addNewTransaction(@RequestBody Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @PutMapping(value = "{id}", consumes = "application/json", produces = "application/json")
    public Transaction replaceTransactionWithId(@PathVariable Integer id, @RequestBody Transaction transaction) {
        return transactionRepository.save(transactionService.replaceTransaction(id, transaction, transactionRepository.findById(id)));
    }


    @PatchMapping(value = "{id}", consumes = "application/json", produces = "application/json")
    public Transaction changeProductAndAmount(@PathVariable Integer id, @RequestBody Transaction transaction) {
        return transactionRepository.save(transactionService.updateTransaction(id, transaction, transactionRepository.findById(id)));
    }

    @DeleteMapping({"{id}"})
    public Boolean deleteTransactionWithId(@PathVariable Integer id) {
        transactionRepository.deleteById(id);
        return Boolean.TRUE;
    }

    @GetMapping("/reports/type")
    public Map<String, Double> getSumForReportsByType() {
        return transactionService.calculateSum(transactionRepository.findAll());
    }

    @GetMapping("/reports/product")
    public List<Map<String, List<Map<String, String>>>> getReportsByType() {
        return transactionService.generateReportByProduct(transactionRepository.findAll());
    }



}
