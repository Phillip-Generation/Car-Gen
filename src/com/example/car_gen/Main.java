package com.example.car_gen;

public class Main {

    public static void main(String[] args) {
       Honda civic = new Honda("blue", 1987, 120, 150, true, true);
       Lexus rx350 = new Lexus("red",2005, 120, 185, true, false);
       Toyota supra = new Toyota("black", 2020, 120, 180, true, true);
       System.out.println(civic.getColor());
       System.out.println(rx350.getColor());
       System.out.println(supra.getColor());
       System.out.println(rx350);
       System.out.println(supra);
       System.out.println(civic);
    }

}

