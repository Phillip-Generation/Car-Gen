package com.example.car_gen;

public class Main {
    public static void main(String[] args) {
        Honda civic = new Honda("red", 2020, 80, true );
        Lexus rx350 = new Lexus("blue", 2004, 75, true );
        Toyota supra = new Toyota("white", 2021, 200, true );

//        System.out.println(civic.getColor());
//        System.out.println(rx350.getColor());
//        System.out.println(supra.getColor());
        civic.setSpeed(0);
        System.out.println(civic.getSpeed());
        civic.accelerateSpeed();
        civic.decelerateSpeed();
        System.out.println(civic.getSpeed());
        civic.decelerateSpeed();

        System.out.println(civic.isElectric());
        civic.convertToElectric();
        System.out.println(civic.isElectric());

    }

}
