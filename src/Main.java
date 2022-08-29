public class Main {
    public static void main(String[] args) {
        Honda civic = new Honda("Gray", 2014, 50, 200, true);
        Lexus rx350 = new Lexus("Black", 2020, 40, 220, true);
        Toyota supra = new Toyota("Red", 2018, 60, 180, true);

        System.out.println(civic.getSpeed());
        civic.accelerateSpeed();
        System.out.println(civic.getSpeed());

        System.out.println(civic.getSpeed());
        civic.decelerateSpeed();
        System.out.println(civic.getSpeed());

        System.out.println(civic.isElectric());
        civic.convertToElectric();
        System.out.println(civic.isElectric());
    }
}
