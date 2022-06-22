package com.fasttrackit.banking;

public class Brd implements Account{

    private int sold;

    public Brd(int sold) {
        this.sold = sold;
        System.out.println("Amount of money in BRD account is: "+sold);
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
        return sold;
    }
}
