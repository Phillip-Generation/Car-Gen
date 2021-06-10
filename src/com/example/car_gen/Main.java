package com.example.car_gen;

public class Main {

    public static void main(String[] args) {

        Honda civic = new Honda();
        Lexus rx350 = new Lexus();
        Toyota supra = new Toyota();

        System.out.println(civic.getYear());
        System.out.println(rx350.getYear());
        System.out.println(supra.getYear());
        System.out.println(Toyota.Car.accelerateSpeed());
        System.out.println(Toyota.Car.decelerateSpeed());
        System.out.println(Toyota.Car.convertToElectric());

    }
}
