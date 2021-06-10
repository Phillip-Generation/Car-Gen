package com.example.car_gen;

public class Main {
    public static void main(String[] args) {
        Honda civic = new Honda("red", 2000, 80, true);
        Lexus rx350 = new Lexus("blue", 2004, 75, true);
        Toyota supra = new Toyota("orange", 2000, 145, false);

//        System.out.println(civic.getColor());
//        System.out.println(rx350.getColor());
//        System.out.println(supra.getColor());

        System.out.println(civic.isElectric());
        civic.convertToElectric();
        System.out.println(civic.isElectric());


    }
}
