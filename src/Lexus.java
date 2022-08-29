class Lexus extends Car {
    boolean hasLeatherSeats;

    public Lexus (String color, int year, int speed, int maxSpeed, boolean hasLeatherSeats) {
        super(color, year, speed, maxSpeed);
    }

    public boolean isHasLeatherSeats() {
        return hasLeatherSeats;
    }

    public void setHasLeatherSeats(boolean hasLeatherSeats) {
        this.hasLeatherSeats = hasLeatherSeats;
    }
}
