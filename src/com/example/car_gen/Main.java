package com.example.car_gen;

public class Main {



    public static void main(String[] args) {
        Honda civic = new Honda("blue", 1995, 50, 100, true, false);
        Lexus rx350 = new Lexus("red", 2000, 40, 99, true, false);
        Toyota supra = new Toyota("yellow", 1989, 60, 150, true, true);

        System.out.println(civic.getColor());
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());

        civic.accelerateSpeed();
        System.out.println(civic.getSpeed());

        rx350.decelerateSpeed();
        System.out.println(rx350.getSpeed());

        supra.convertToElectric();
        System.out.println(supra.getElectric());

    }

}

