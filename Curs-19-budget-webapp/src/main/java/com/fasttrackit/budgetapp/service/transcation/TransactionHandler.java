package com.fasttrackit.budgetapp.service.transcation;

import com.fasttrackit.budgetapp.model.product.Product;
import com.fasttrackit.budgetapp.model.transaction.Transaction;
import com.fasttrackit.budgetapp.model.transaction.Type;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Component
public class TransactionHandler implements TransactionProvider {

    @Value("${transaction.file.path}")
    private String pathToFile;

    @Override
    public List<Transaction> getTransactions() {
        try {
            return Files.lines(Path.of(pathToFile))
                    .map(this::mapTransaction)
                    .toList();
        } catch (IOException e) {
            System.out.println("Could not find transaction files");
            return List.of();
        }

    }

    @Override
    public Transaction addTransaction(Transaction transaction) {
       return writeLineToFile(transaction);
    }

    @Override
    public void replaceTransaction(int id, Transaction transaction) {
        try {
            List<String> lines = Files.lines(Path.of(pathToFile))
                    .map(line -> replaceLine(id, line,transaction))
                    .toList();
            Files.write(Path.of(pathToFile), lines);

        } catch (IOException e) {
            System.out.println("Unable to replace provide transaction");
        }
    }



    @Override
    public void deleteTransaction(int id) {
        try {
            List<String> lines = Files.lines(Path.of(pathToFile))
                    .filter( line -> !getIdFromLine(line).equals(String.valueOf(id)))
                    .toList();
            Files.write(Path.of(pathToFile),lines, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<HashMap<String,String>> getReportTypes(){
        try {
             return Files.lines(Path.of(pathToFile))
                    .map(line->mapReport(line))
                    .toList();
        } catch (IOException e) {
            System.out.println("Unable to generate report by types");
            return List.of();
        }

    }



    private Transaction mapTransaction(String line) {
        String[] transactionParts = line.split("\\|");
        String[] productParts = transactionParts[1].split("-");
        Product product = new Product(productParts[0], Double.parseDouble(productParts[1]));

        String type = transactionParts[2];
        Type transactionType = type.equals(Type.SELL.name()) ? Type.SELL : Type.BUY;

        return new Transaction(Integer.parseInt(transactionParts[0]), product, transactionType, Double.parseDouble(transactionParts[3]));

    }


   private Transaction writeLineToFile(Transaction transaction){
       try {
           Files.write(Path.of(pathToFile),("\n"+createFileLine(transaction)).getBytes(), StandardOpenOption.APPEND);
           return transaction;
       } catch (IOException e) {
           System.out.println("Unable to create new transaction");
           return null;
       }
   }


   private String createFileLine(Transaction transaction){
       StringBuilder line = new StringBuilder();
       line
               .append(transaction.getId())
               .append("|")
               .append(transaction.getProduct().getName())
               .append("-")
               .append(transaction.getProduct().getPrice())
               .append("|")
               .append(transaction.getType().name())
               .append("|")
               .append(transaction.getAmount());
       return line.toString();
   }

   private String replaceLine(int id, String line, Transaction transaction){
        return getIdFromLine(line).equals(String.valueOf(id)) ? createFileLine(transaction) : line;
   }

   private String getIdFromLine(String line){
        return line.split("\\|")[0];
   }


   private HashMap<String, String> mapReport(String line){
        Transaction transaction = mapTransaction(line);
        HashMap<String,String> map = new HashMap<>();
        map.put("type:"+transaction.getType(),"amount:"+transaction.getAmount());
        return map;
   }


}
