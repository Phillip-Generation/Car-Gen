package com.example.car_gen;

public class Car {
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    /* In your Car class, create a constructor which takes
    in the following parameters(, String color, int year, int maxSpeed)
     */
    public Car(String color, int year, int maxSpeed){

    }
    public void accelerateSpeed(int MPH){
        MPH = speed + 5;
        if(MPH > maxSpeed){
            System.out.println("Enter valid speed");
        }
    }
    public void decelerateSpeed(int MPH){
        if(MPH <= 0){
            System.out.println("Accelerate!");
        }
        MPH = speed - 5;
    }
    public void convertToElectric(boolean isElectric ){
        if(isElectric == false){
            isElectric = true;
        }else{
            System.out.println("Car is already electric.\n");
        }
    }
    /* In your Car class, create getters and setters for each instance field.
    Do the same within your Toyota, Lexus, and Honda classes.
     */

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
}
