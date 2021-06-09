
package com.example.car_gen;

public class Car {
    private String color;
    private int year;
    private int speed;
    private int maxSpeed;
    private boolean isElectric;

    Car(String color, int year, int speed, int maxSpeed, boolean isElectric){
        this.color = color;
        this.year = year;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.isElectric = isElectric;

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

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public boolean IsElectric() {
        return this.isElectric;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
    public void accelerateSpeed(){
        this.setSpeed(this.getSpeed() + 5);
        if(this.getSpeed() >= this.getMaxSpeed()){
            this.setSpeed(this.getMaxSpeed());
        }
    }
    public void decelerateSpeed(){
        this.setSpeed(this.getSpeed() - 5);
        if(this.getSpeed() <= 0){
            this.setSpeed(0);
        }
    }
    public void convertToElectric(){
        if(this.isElectric){
            System.out.println("This car is already electric.");
        } else {
            this.setElectric(true);
        }

    }

}
