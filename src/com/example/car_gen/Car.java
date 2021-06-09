package com.example.car_gen;

public class Car {
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;
    final private String make;
    static private int numCars = 0;

    public Car(String color, int year, int speed, int maxSpeed, String make){
        this.color = color.toLowerCase();
        this.year = year;
        this.make = make.substring(0, 1).toUpperCase() + make.substring(1).toLowerCase();

        if (speed > maxSpeed){
            System.out.println("Current speed can't be greater than max speed");
        } else {
            this.speed = speed;
            this.maxSpeed = maxSpeed;
        }
        numCars++;
    }

//    shortcut getters/setters: Code tab, Generate, Getter and Setter, choose instance fields
    public String getColor(){
        return this.color;
    }

    public void setColor(String newColor){
        this.color = newColor.toLowerCase();
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int newYear){
        this.year = newYear;
    }

    public int getSpeed(){
        return this.speed;
    }

    public void setSpeed(int newSpeed){
        if (newSpeed <= this.maxSpeed){
            this.speed = newSpeed;
        } else {
            System.out.println("Current speed can't be greater than max speed " + this.maxSpeed);
        }

    }

    public int getMaxSpeed(){
        return this.maxSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed){
        if (newMaxSpeed >= this.speed){
            this.maxSpeed = newMaxSpeed;
        } else {
            System.out.println("Max speed can't be less than current speed " + this.speed);
        }
    }

    public boolean getIsElectric(){
        return this.isElectric;
    }

    public void setIsElectric(boolean isElect){
        this.isElectric = isElect;
    }

    public String getMake(){
        return this.make;
    }

    public static int getNumCars(){
        return numCars;
    }

    public void accelerateSpeed(){
        if (this.speed + 5 <= this.maxSpeed){
            this.speed += 5;
        } else {
            System.out.println("Failed to accelerate past maxSpeed");
        }
    }

    public void decelerateSpeed(){
        if (this.speed - 5 >= 0){
            this.speed -= 5;
        } else {
            System.out.println("Failed to decrease speed below 0");
        }
    }

    public void convertToElectric(){
        if (this.isElectric){
            System.out.println("The car is already electric");
        } else {
            this.setIsElectric(true);
        }
    }

}
