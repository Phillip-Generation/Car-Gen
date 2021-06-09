package com.example.car_gen;

public class Car {

    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    public String getColor() {
        return this.color;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int newYear){
        this.year = newYear;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int newSpeed){
        this.speed = newSpeed;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed){
        this.maxSpeed = newMaxSpeed;
    }

    public boolean getElectric() {
        return this.isElectric;
    }

    public void setElectric(boolean newElectric){
        this.isElectric = newElectric;
    }

    Car(String color, int year, int speed, int maxSpeed, boolean isElectric) {
        this.color = color;
        this.year = year;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.isElectric = isElectric;
    }

    public void accelerateSpeed(){
        if (speed+5 <= maxSpeed){
            speed += 5;
        } else{
            System.out.println("Max speed reached!");
        }
    }
    public void decelerateSpeed(){
        if (speed - 5 >= 0){
            speed -= 5;
        } else{
            System.out.println("Car is not moving!");
        }
    }
    public void convertToElectric(){
        if (!isElectric){
            isElectric = true;
            System.out.println("Car has been converted to electric!");
        } else{
            System.out.println("Car is already electric!");
        }
    }
}
