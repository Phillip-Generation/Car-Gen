public class Main{


    public static void main (String[] args) {
        Honda Civic = new Honda("Red", 2022, 138, true);
        Lexus rx350 = new Lexus("Blue", 2020, 141, true);
        Toyota supra = new Toyota("White", 2021, 135, false);

        System.out.println(Civic.getColor());
        System.out.println(rx350.getColor());
        System.out.println(supra.getColor());

        Civic.setSpeed(120);
        Civic.acceleratorSpeed();

    }
}
