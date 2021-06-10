package com.example.car_gen;

import java.util.*;

class Main {
    public static void main(String[] args) {
        // Create a Honda civic
        Honda civic = new Honda("blue", 2000, 80, 100, true);

        // Create a Lexus rx350
        Lexus rx350 = new Lexus("red", 2005, 20, 150, true);

        // Create a Toyata supra
        Toyota supra = new Toyota("black", 2010, 25, 120, true);

        // Print the colors
        System.out.println("Creating cars...");
        System.out.println("Created a " + civic.getColor() + " Honda civic.");
        System.out.println("Created a " + rx350.getColor() + " Lexus rx250");
        System.out.println("Created a " + supra.getColor() + " Toyota supra");



        // Test acceleration
        System.out.println("The Honda is accelerating from " + civic.getSpeed() + " MPH...");

        // Accelerate the car
        for (int i = 0; i < 5; i++) {
            civic.accelerateSpeed();

            System.out.println("Accelerated to " + civic.getSpeed() + " MPH.");
        }

        // Test decelerating
        System.out.println("The Lexus is decelerating from " + rx350.getSpeed() + " MPH...");

        // Decelerate the car
        for (int i = 0; i < 5; i++) {
            rx350.decelerateSpeed();

            System.out.println("Decelerated to " + rx350.getSpeed() + " MPH.");
        }

        // Test making the car electric
        System.out.println("Making the Toyota electric...");
        supra.convertToElectric();

        // Calling it again should throw an error message
        supra.convertToElectric();
    }
}
