package com.example.car_gen;

public class Car {
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    boolean isElectric;


    public Car(String color, int year, int maxSpeed){
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }
      public void accelerateSpeed() {
        if (speed < this.maxSpeed){
            this.speed += 5;
        }
    }

//        public void accelerateSpeed(){
//        if(this.speed + 5 > this.maxSpeed) {
//            System.out.println("You cannot exceed maximum speed");
//        }else this.speed += 5;
//        }
          public void decelerateSpeed () {
              if (this.speed >= 5) {
                  this.speed -= 5;
              } else if (this.speed < 5) {
                  this.speed = 0;
                  System.out.println("You are now at 0 MPH");
              }
          }
          public void convertToElectric(){
        if(this.isElectric){
            System.out.println("The car is already electric");
        } else{this.setElectric(true);}
          }
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


