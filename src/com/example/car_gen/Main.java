
package com.example.car_gen;

public class Main {

    public static void main(String[] args) {
        Car civic = new Honda("Civic","red", 2015,5,120,false,false);
        Car rx350 = new Lexus("rx350","white",2019,0,210,false,true);
        Car supra = new Toyota("Supra","blue",2020,199,200,true, true);
        System.out.println(civic.getColor());
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());
        System.out.println("rx350's current speed is: " + rx350.getSpeed());
        rx350.accelerateSpeed();
        System.out.println("rx350's current speed is: " + rx350.getSpeed());
        System.out.println("supra's current speed is: " + supra.getSpeed());
        supra.accelerateSpeed();
        System.out.println("supra's current speed is: " + supra.getSpeed());
        System.out.println("civic's current speed is: " + civic.getSpeed());
        civic.decelerateSpeed();
        System.out.println("civic's current speed is: " + civic.getSpeed());
        System.out.println("supra's current speed is: " + supra.getSpeed());
        supra.decelerateSpeed();
        System.out.println("rx350's current speed is: " + supra.getSpeed());
        System.out.println(civic.IsElectric());
        civic.convertToElectric();
        System.out.println(civic.IsElectric());
        System.out.println(supra.IsElectric());
        supra.convertToElectric();
    }










}
