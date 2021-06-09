package com.example.car_gen;

public class Car {
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    public Car(String color, int year, int speed, int maxSpeed, boolean isElectric) {
        this.color = color;
        this.year = year;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.isElectric = isElectric;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean IsElectric() {
        return this.isElectric;
    }

    public void setElectric(boolean electric) {
        this.isElectric = electric;
    }

    public void accelerateSpeed() {
        if(speed < this.maxSpeed) {
            this.speed += 5;
        }
    }

    public void decelerateSpeed() {
        if (speed > 0) {
            this.speed -= 5;
        }
    }

    public void convertToElectric() {
        if(!isElectric) {
            this.isElectric = true;
        } else {
            System.out.println("This car is already electric.");
        }
    }
}
