package com.example.car_gen;

public class Main {
    public static void main(String[] args){
        // Create cars
        Honda civic = new Honda("red", 1998, 20, 55, false);
        Lexus rx350 = new Lexus("blue", 2004, 25, 60, true);
        Toyota supra = new Toyota("white", 2005, 30, 65, true);
        System.out.println(Car.getNumCars());
        // print an instance field
        System.out.println(civic.getMake());
        System.out.println(rx350.getMake());
        System.out.println(supra.getMake());

        // test methods
        civic.accelerateSpeed();
        System.out.println(civic.getSpeed());

        rx350.decelerateSpeed();
        System.out.println(rx350.getSpeed());

        supra.convertToElectric();
        System.out.println(supra.getIsElectric());
        supra.convertToElectric();
        System.out.println(supra.getIsElectric());
    }
}
