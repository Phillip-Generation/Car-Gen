package com.example.car_gen;

public class Main {
    public static void main(String[] args) {
        Lexus rx350 = new Lexus("Blue",2020,20,100,false, true);
        Honda civic = new Honda("Red",2004,20,110,false,true);
        Toyota supra = new Toyota("Orange",2000,90,145,false,false);

        System.out.println("rx350 color: "+rx350.getColor());
        System.out.println("Civic color: "+civic.getColor());
        System.out.println("Supra color: "+supra.getColor());
    }
}
