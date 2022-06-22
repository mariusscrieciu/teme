package com.fasttrackit.advertise;

public class EmailAdvertise implements Advertise {


    private final String MESSAGE = "Email Advertise";

    @Override
    public void publishAdvertise(String advertiseMessage) {
        System.out.println("This is a '"+MESSAGE+"' with following message: "+advertiseMessage);
    }



}
