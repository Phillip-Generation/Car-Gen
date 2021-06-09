package com.example.car_gen;

public class Car {
    private String color;
    private int year;
    private int speed=0;
    private int maxSpeed;
    private boolean isElectric;

    public Car(String color,int year,int speed ,int maxSpeed,boolean isElectric){
        this.color=color;
        this.year=year;
        this.speed=speed;
        this.maxSpeed=maxSpeed;
        this.isElectric=isElectric;

    }
    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color= color;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }
    public boolean getIsElectric(){
        return this.isElectric;
    }
     public void setIsElectric(boolean isElectric) {
        this.isElectric=isElectric;
     }

     public void accelerateSpeed() {
          if (this.speed <= this.maxSpeed) {
              this.speed += 5;
             System.out.println("Accelerate speed is: "+speed);
          }else {
              System.out.println("Accelerate speed is Max speed");
          }
      }

      public void decelerateSpeed() {
            if (this.speed -5 > 0){
                this.speed-=5;
              // System.out.println("Decelerate speed is: "+speed);
          }
            else {
                System.out.println("Decelerate speed is below zero");
            }
    }
    public void convertToElectric() {

        if(!isElectric) {
            System.out.println(" Car is already electric.");
        }
        else {
            this.setIsElectric(true);

        }
    }
}
