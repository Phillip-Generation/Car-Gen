package com.example.car_gen;

public class Main {
    public static void main(String[] args) {
     Honda civic = new Honda("blue", 1990, 80, 200, true);
     Lexus rx350 = new Lexus("red",2005,50,180,false);
     Toyota supra = new Toyota("purple", 2004, 40,130, true);


        System.out.println(civic.getColor());
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());
        civic.setSpeed(200);
        civic.accelerateSpeed();
        System.out.println(civic.getSpeed());
        supra.convertToElectric();
        System.out.println(supra.isElectric());
    }
}
