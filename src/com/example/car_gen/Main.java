package com.example.car_gen;

public class Main {
    public static void main(String[] args) {

        Honda civic = new Honda("blue", 2021, 200, 300, true, true);
        Lexus rx350 = new Lexus("orange", 2021, 0, 300, true, true);
        Toyota supra = new Toyota("black", 2021, 500, 500, true, true);

        System.out.println(civic.getColor());
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());

        supra.accelerateSpeed();
        System.out.println(supra.getSpeed());

        rx350.decelerateSpeed();
        System.out.println(rx350.getSpeed());

        civic.convertToElectric();


    }
}
