package com.example.car_gen;

public class Car {
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    public Car(String color, int year, int speed, int maxSpeed){
        this.color = color;
        this.year = year;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int newYear){
        this.year = newYear;
    }


}
