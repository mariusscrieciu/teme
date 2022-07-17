package com.fasttrackit.extramile;

public class Car {


    private String name;
    private int age;
    private double km;
    private double price;

    public Car(String name, int age, double km, double price) {
        this.name = name;
        this.age = age;
        this.km = km;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getKm() {
        return km;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", km=" + km +
                ", price=" + price +
                '}';
    }
}
