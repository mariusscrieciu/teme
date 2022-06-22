package com.fasttrackit.banking;

public class Bt implements Account{

    private int sold;

    public Bt(int sold) {
        this.sold = sold;
        System.out.println("Amount of money in BT account is: "+sold);
    }

    @Override
    public void depositMoney(int amount) {
        sold += amount;
    }

    @Override
    public void withdraw(int amount) {
        sold -= amount;
    }

    @Override
    public int getAmount() {
        return 0;
    }
}
