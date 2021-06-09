
package com.example.car_gen;

public class Main {

    public static void main(String[] args) {
        Car civic = new Honda("Civic","red", 2015,120,false);
        Car rx350 = new Lexus("rx350","white",2019,210,true);
        Car supra = new Toyota("Supra","blue",2020,200,true);
        System.out.println(civic.getColor());
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());
        rx350.reportSpeed();
        rx350.accelerateSpeed();
        supra.setSpeed(199);
        supra.reportSpeed();
        supra.accelerateSpeed();
        civic.setSpeed(50);
        civic.reportSpeed();
        civic.decelerateSpeed();
        supra.reportSpeed();
        supra.decelerateSpeed();

        System.out.println(civic.IsElectric());
        civic.convertToElectric();
        civic.convertToElectric();
        System.out.println(civic.IsElectric());
        System.out.println(supra.IsElectric());
        supra.convertToElectric();
    }










}
