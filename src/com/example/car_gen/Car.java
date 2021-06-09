package com.example.car_gen;

public class Car {

    protected String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    Car(String color, int year, int speed, int maxSpeed, boolean isElectric) {
        this.color = color;
        this.year = year;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.isElectric = isElectric;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public void accelerateSpeed() {

        speed += 5;

        if (speed > maxSpeed) {
            System.out.println("The car cannot exceed the Max Speed");
        } else {

            System.out.println("The car speed is now: " + speed + " MPH");
        }

    }

    public void decelerateSpeed() {

        speed-= 5;

        if (speed < 0) {
            System.out.println("The car cannot below 0 mph");
        } else {

            System.out.println("The car speed has now reduced to: " + speed + " MPH");
        }
    }

    public void convertToElectric() {

        if (isElectric == true) {
            System.out.println("The car is already electric");
        } else {
            isElectric = true;
            System.out.println("The car has now converted to electric");
        }
    }


}
