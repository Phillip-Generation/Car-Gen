package com.example.car_gen;

public class Main {
    public static void main(String[] args) {

        Honda civic = new Honda( "White",2020,75,true );
        Lexus rx350 = new Lexus("Black",2021,70, true);
        Toyota supra = new Toyota("Brown",2005, 130, false);

//        System.out.println(civic.getColor());
//        System.out.println(rx350.getColor());
//        System.out.println(supra.getColor());

        //civic.setSpeed(10);
        System.out.println(civic.isElectric());
        civic.convertToElectric();
        System.out.println(civic.isElectric());

        //System.out.println(civic.getSpeed());
        //civic.accelerateSpeed();

//        civic.decelerateSpeed();
//        System.out.println(civic.getSpeed());

    }
}
