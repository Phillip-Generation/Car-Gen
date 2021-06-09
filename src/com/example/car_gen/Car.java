package com.example.car_gen;

public class Car {
    //private instance fields
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    Car(String color, int year, int speed, int maxSpeed) {
        this.color = color;
        this.year = year;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        //this.isElectric = isElectric;
    }

    public void setColor(String newValue) {
        this.color = newValue;
    }

    public void setYear(int newValue) {
        this.year = newValue;
    }

    public void setSpeed(int newValue) {
        this.speed = newValue;
    }

    public void setMaxSpeed(int newValue) {
        this.maxSpeed = newValue;
    }

    public void setIsElectric(boolean newValue) {
        this.isElectric = newValue;
    }

    public String getColor(){
        return this.color;
    }

    public int getYear(){
        return this.year;
    }

    public int getSpeed(){
        return this.speed;
    }

    public int getMaxSpeed(){
        return this.maxSpeed;
    }

    public boolean getIsElectric(){
        return this.isElectric;
    }

    public void accelerateSpeed() {
        if (this.speed <= this.maxSpeed - 5) {
            this.speed += 5;
            System.out.println("Accelerating speed by 5mph...");
        } else if ( this.maxSpeed - this.speed < 5) {
            this.speed = this.maxSpeed;
            System.out.println("You are now going max speed at " + this.speed);
        } else {
            System.out.println("Error: you are exceeding maxSpeed of " + this.maxSpeed);
        }
    }

    public void decelerateSpeed() {
        if (this.speed >= 5) {
            this.speed -= 5;
            System.out.println("Decelerating speed by 5mph...");
        } else if (this.speed < 5) {
            this.speed = 0;
            System.out.println("You are now at 0mph");
        }
    }

    public void convertToElectric() {
        if (this.isElectric) {
            System.out.println("Car is already electric");
        } else {
            this.isElectric = true;
            System.out.println("Car is now electric");
        }
    }
}
