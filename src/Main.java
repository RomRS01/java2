public class Main {
    public static void main(String[] args) {
        int cost = 10000;
        int mileRub = 20;
        int mile;
        if (mileRub != 0) {
            mile = cost / mileRub;
            System.out.println(mile + " начисленных милей");
        } else {
            System.out.println("миля не может соответствовать 0 рублям");
        }

    }
}
