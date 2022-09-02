package com.example.budgetapp.model.transaction;


import com.example.budgetapp.model.product.Product;
import com.example.budgetapp.model.type.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, unique = true, updatable = false)
    private int id;

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="product_id",referencedColumnName = "id")
    private Product product;

    @Column
    @Enumerated(EnumType.STRING)
    private Type type;
    @Column
    private double amount;


}
