import java.util.Scanner;

public class myPow {
    public static double myPow(double x, int n) {
        double pow = 1.0;
        long negative = -1 * n;
        if (n == Integer.MIN_VALUE) {
            return 0.0;
        }else if (n == Integer.MAX_VALUE) {
            return 0.0;
        } else {
            if (n < 0) {
                for (long i = 0; i < negative; i++) {
                    pow = pow * x;
                }
                return 1 / pow;
            } else if (n > 0) {
                for (int i = 0; i < n; i++) {
                    pow = pow * x;
                }
                return pow;
            } else {
                return 1;
            }
        }
    }

    public static void main (String args[]) {
        double x, res;
        int n;
        x = 2.00000;
        n = -2147483648;
        res = myPow(x, n);
        System.out.println("Result: " + res);

    }
}
