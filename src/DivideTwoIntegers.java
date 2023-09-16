import java.lang.Math;
public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {

        long dd = dividend;
        long dr = divisor;
        //System.out.println ("Values: Dividend: " + dd + " and Divisor: " + dr);
        int sign = 0;
        if (dd < 0 && dr < 0) {
            sign = 1;
        } else if (dd < 0 || dr < 0){
            sign = -1;
        } else {
            sign = 1;
        }

        //System.out.println ("Values after quotient sign is determined: Dividend: " + dd + " and Divisor: " + dr);

        if (dd < 0) {
            dd = dd * -1;
        }

        //System.out.println("Dividend after sign change: " + dd);
        if (dr < 0) {
            dr = dr * -1;
        }

        //System.out.println("Divisor after sign change: " + dr);
        long quotient = 0;
        while (dd >= dr) {
            dd = dd - dr;
            ++quotient;
            System.out.println ("Quotient after each time divisor is subtracted: " + quotient);
        }
        //System.out.println("Quotient before sign formatting: " + quotient);
        //System.out.println("Quotient after sign formatting: " + quotient * sign);
        //int answer = quotient * sign;
        return (int)quotient;
    }

    public static void main(String[] args)
    {
        int a = -2147483648;
        int b = -1;

        System.out.println(divide(a, b));

//        a = 43;
//        b = -8;
//
//        System.out.println(divide(a, b));
    }
}
