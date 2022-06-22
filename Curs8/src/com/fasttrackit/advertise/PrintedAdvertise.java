package com.fasttrackit.advertise;

public class PrintedAdvertise implements Advertise{

    private final String  MESSAGE= "Printed advertise";
    @Override
    public void publishAdvertise(String advertiseMessage) {
        System.out.println("This is a '"+MESSAGE+"' with following message: "+advertiseMessage);
    }



}
