package com.fasttrackit.advertise;

public class FaceBookAdvertise implements Advertise {

    private final String MESSAGE = "FaceBook Advertise";



    @Override
    public void publishAdvertise(String advertiseMessage) {
        System.out.println("This is a '"+MESSAGE+"' with following message: "+advertiseMessage);
    }

}
