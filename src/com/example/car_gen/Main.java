package com.example.car_gen;

public class Main {

    public static void main(String[] args) {

        Honda civic = new Honda("Red", 2015, 70, 140, false, false);
        Lexus rx350 = new Lexus("White", 2020, 146, 150, true, true);
        Toyota supra = new Toyota("Blue", 2019, 4, 130, true, false);

        civic.decelerateSpeed();
        rx350.decelerateSpeed();
        supra.decelerateSpeed();


        rx350.convertToElectric();
        civic.convertToElectric();
        supra.convertToElectric();

        civic.accelerateSpeed();


    }


}
