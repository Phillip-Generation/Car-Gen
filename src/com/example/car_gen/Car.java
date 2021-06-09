package com.example.car_gen;

public class Car {
    private String color; //Step 14
    private int year;//Step 14
    private int speed = 0;//Step 14
    private int maxSpeed;//Step 14
    private boolean isElectric;//Step 14


    public Car(String color, int year, int speed, int maxSpeed, boolean isElectric){ //Step 18
        this.color = color;//Step 18
        this.year = year;//Step 18
        this.speed = speed;//Step 18
        this.maxSpeed = maxSpeed;//Step 18
        this.isElectric = isElectric;//Step 18
    }


    //Getter & Setter
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


    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }


    public int getMaxSpeed(){
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }


    public boolean getIsElectric(){
        return  isElectric;
    }
    public void setIsElectric(boolean isElectric){
        this.isElectric = isElectric;
    }


    //Method
    public void accelerateSpeed(){
        if( speed+5 <= maxSpeed){
            speed += 5;
        }else {
            System.out.println("Car Max Speed reached");
        }
    }
    public void decelerateSpeed(){
        if(speed-5 >= 0){
            speed -= 5;
        }else{
            System.out.println("Car is not in motion");
        }
    }
    public void convertToElectric(){
        if(isElectric != true){
            isElectric = true;
        }else {
            System.out.println("Car is already electric");
        }
    }
