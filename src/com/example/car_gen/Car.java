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

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int newSpeed){
        this.speed = newSpeed;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(int newMaxSpeed){
        this.maxSpeed = newMaxSpeed;
    }

    public boolean getIsElectric(){
        return isElectric;
    }

    public void setIsElectric(boolean isElect){
        this.isElectric = isElect;
    }

    public void accelerateSpeed(){
        if (speed + 5 <= maxSpeed){
            speed += 5;
        } else {
            System.out.println("Failed to accelerate past maxSpeed");
        }
    }

    public void decelerateSpeed(){
        if (speed - 5 >= 0){
            speed -= 5;
        } else {
            System.out.println("Failed to decrease speed below 0");
        }
    }

    public void convertToElectric(){
        if (isElectric){
            System.out.println("The car is already electric");
        } else {
            this.setIsElectric(true);
        }
    }

}
