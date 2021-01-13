package For_loop_6;

public class For_loop_6 {
    public static void main(String[] args) {
        
        for(int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + " % interest = " + String.format("%.2f", Interest(10000, i))); // i is int but interestrate double
        }                                                                                                        //java auto convert int to double
    }
    public static double Interest(double amount, double interestrate) {
        return (amount*(interestrate/100));
    }
}
