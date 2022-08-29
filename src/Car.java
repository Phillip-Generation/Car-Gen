public class Car {
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    public Car(String color, int year, int speed, int maxSpeed) {
        this.color = color;
        this.year = year;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
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

    public void accelerateSpeed() {
        if(this.speed+5 <= this.maxSpeed) {
            this.speed += 5;
        } else {
            System.out.println("Max speed reached.");
        }
    }
    public void decelerateSpeed() {
        if(this.speed-5 >= 0) {
            this.speed -= 5;
        } else {
            System.out.println("Can't go below 0MPH");
        }
    }
    public void convertToElectric() {
        if(this.isElectric = true) {
            System.out.println("The car is already electric");
        } else {
            this.isElectric = true;
            System.out.println("Changing to an electric car...");
        }
    }
}
