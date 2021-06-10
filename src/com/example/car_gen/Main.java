package com.example.car_gen;

public class Main {
    public static void main(String[] args) {
Honda civic = new Honda("red", 2012, 5, 145, true);
Lexus rx350 = new Lexus("blue", 2015, 5, 120, false);
Toyota supra = new Toyota("green", 2020, 6, 110, true);

//    System.out.println(civic.getColor());
//    System.out.println(rx350.getColor());
//    System.out.println(supra.getColor());
    System.out.println(civic.getSpeed());
    civic.accelerateSpeed();
    System.out.println(civic.getSpeed());
    }
}


