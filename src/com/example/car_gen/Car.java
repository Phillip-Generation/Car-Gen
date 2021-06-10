package com.example.car_gen;

public class Car {

    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    public Car (String color, int year, int maxSpeed)
    {
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerateSpeed()
    {
        if(speed+5 <= maxSpeed)
            speed += 5;
    }

    public void decelerateSpeed()
    {
        if(speed-5 >= 0)
            speed -= 5;
    }

    public void convertToElectric(){
        isElectric = true;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public boolean getElectricStatus() {
        return isElectric;
    }

    /*
    public void convertToElectric() {
        if(isElectric)
            System.out.println("Car is already electric.");
        else
            isElectric = true;
    }*/
}
