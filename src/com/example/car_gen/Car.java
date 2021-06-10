package com.example.car_gen;

public class Car {

    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    public Car(String color, int year, int speed, int maxSpeed) {
       this.color = "color";
       this.year = year;
       this. speed = speed;
       this.maxSpeed = maxSpeed;

    }

    public Car() {

    }

    public String getColor() {
        return color;

    }

    public int getYear() {
        return year;

    }

    public int getSpeed() {
        return speed;

    }
    public int getMaxSpeed() {
        return maxSpeed;

    }

    public boolean getIsElectric() {
        return isElectric;

    }
    public void setColor() {

    }

    public void setYear() {

    }

    public void setSpeed() {

    }

    public void setMaxSpeed() {

    }

    public void setIsElectric() {

    }
    public boolean accelerateSpeed() {
        for (speed = 0; speed <= maxSpeed; speed += 5 ) {
            if (speed > maxSpeed);
            System.out.println("Over Speed!");

        }


        return false;
    }

    public boolean decelerateSpeed() {
        for (speed = 0; speed >= 0; speed -= 5 ) {
            if (speed < 0);
            System.out.println("Lower Speed!");

        }
        return false;
    }

    public boolean convertToElectric() {
        isElectric = false;
        return false;
    }
}
