package com.fasttrackit.budgetapp.model.transaction;

import com.fasttrackit.budgetapp.model.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
public class Transaction {

    private int id;
    private Product product;
    private Type type;
    private double amount;

}
