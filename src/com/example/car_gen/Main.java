package com.example.car_gen;

public class Main {
    public static void main(String[] args) {
        Honda civic = new Honda("red", 2000, 176, 180, true);
//        System.out.println( civic.getColor());
//        civic.setSpeed(100);
//        civic.accelerateSpeed();
//        System.out.println(civic.getSpeed());

        Lexus rx350 = new Lexus("black", 2012, 75, 360, true);
//        System.out.println( rx350.getColor());
//        rx350.setSpeed(65);
//        rx350.decelerateSpeed();
//        System.out.println(rx350.getSpeed());

        Toyota supra = new Toyota("grey", 2008, 50, 160, false);
//        System.out.println( supra.getColor());
        System.out.println(supra.isElectric());
        supra.convertToElectric();
       System.out.println(supra.isElectric());
    }
}
