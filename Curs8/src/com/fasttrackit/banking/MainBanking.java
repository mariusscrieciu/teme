package com.fasttrackit.banking;

public class MainBanking {

    public static void main(String[] args) {
        Ing ing = new Ing(10000);
        Brd brd = new Brd(35000);
        Bt bt = new Bt(43244);

        Person person = new Person(brd);
        person.setAge(29);
        person.setName("Marius");
        person.setCnp("1930222340019");

        System.out.println("Total amount of money: "+person.getAccount().getAmount());
        person.getAccount().depositMoney(2000);
        System.out.println("Total amount of money: "+person.getAccount().getAmount());
        person.getAccount().withdraw(10000);
        System.out.println("Total amount of money: "+person.getAccount().getAmount());

        System.out.println(person);

    }
}
