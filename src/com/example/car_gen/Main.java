package com.example.car_gen;

public class Main {


    public static void main(String[] args) {

    }
    Honda civic = new Honda("Green",2015,55,80, false);
    Lexus rx350 = new Lexus("Red",2012,80,140,true);
    Toyota supra = new Toyota("Silver",2020,75,120, true );


}

//   Testing the color getter
        System.out.println(supra.getColor());
        System.out.println(rx350.getColor());
        System.out.println(civic.getColor());

//   Testing the accelerateSpeed getter
        supra.accelerateSpeed();
        System.out.println(supra.getSpeed());
        supra.accelerateSpeed();
        System.out.println(supra.getSpeed());

//   Testing the decelerateSpeed getter
        civic.decelerateSpeed();
        System.out.println(civic.getSpeed());
        civic.decelerateSpeed();

//   Testing the convertToElectric getter
        civic.convertToElectric();
        System.out.println(civic.getIsElectric());