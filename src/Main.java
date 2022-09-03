public class Main {
    public static void main(String[] args) {
        int stoimost = 10000;
        int miljaRub = 20;
        int mili;
        if (miljaRub != 0) {
            mili = stoimost / miljaRub;
            System.out.println(mili + " начисленных милей");
        } else {
            System.out.println("миля не может соответствовать 0 рублям");
        }

    }
}
