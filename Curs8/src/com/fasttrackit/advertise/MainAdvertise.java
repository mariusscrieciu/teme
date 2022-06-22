package com.fasttrackit.advertise;

public class MainAdvertise {

    public static void main(String[] args) {
        FaceBookAdvertise faceBookAdvertise = new FaceBookAdvertise();
        EmailAdvertise emailAdvertise = new EmailAdvertise();
        PrintedAdvertise printedAdvertise = new PrintedAdvertise();

        Company company_facebook = new Company(faceBookAdvertise);
        company_facebook.getAdvertise().publishAdvertise("Drink a Coca-Cola");


        Company company_email = new Company(emailAdvertise);
        company_email.getAdvertise().publishAdvertise("This is a Pepsi! Drink it!!!!");


        Company company_printed = new Company(printedAdvertise);
        company_printed.getAdvertise().publishAdvertise("Buy a burger a this McDonald and you can win a drink");




    }
}
