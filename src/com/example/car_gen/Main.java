package com.example.car_gen;

public class Main {

    public static void main (String args[])
    {
        Honda civic = new Honda("BLUE",  2021,  180,  false);
        Lexus rx350 = new Lexus("BLACK",  2021,  300,  true);
        Toyota supra = new Toyota("SILVER",  2021,  180,  true);

        //civic
        System.out.println(civic.getColor());
        civic.convertToElectric();
        System.out.println(civic.getElectricStatus());
        civic.setMaxSpeed(160);
        System.out.println(civic.getMaxSpeed());
        //turbo
        civic.setTurboCharged(true);
        System.out.println(civic.isTurboCharged());

        //rx350
        System.out.println(rx350.getColor());
        rx350.setYear(2020);
        System.out.println(rx350.getYear());
        rx350.convertToElectric();
        System.out.println(rx350.getElectricStatus());
        //seats
        rx350.setHasLeatherSeats(false);
        System.out.println(rx350.isHasLeatherSeats());

        //supra
        supra.setColor("YELLOW");
        System.out.println(supra.getColor());
        supra.convertToElectric();
        System.out.println(supra.getElectricStatus());

        supra.setSpeed(90);
        supra.accelerateSpeed();
        System.out.println(supra.getSpeed());
        supra.decelerateSpeed();
        System.out.println(supra.getSpeed());
        //mileage
        supra.setGreatGasMileage(false);
        System.out.println(supra.isGreatGasMileage());

    }
}
