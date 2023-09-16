import java.util.Scanner;

public class reverse {
    public static int reverse(int x) {
        int remainder = 0;
        int reversed = 0;
        int temp;
        temp = x;
        int tempremainder = 0;
        int tempreversed = 0;
        int iter = 0;
        int rev;
        rev = temp;

        while (temp != 0) {
            tempremainder = temp % 10;
            tempreversed = (tempreversed * 10) + tempremainder;
            iter++;
        }

        if (iter == 9) {
            if ((rev % 10) > 1){
                return 0;
            }
        }

        while (x != 0) {
            remainder = x % 10;
            reversed = (reversed * 10) + remainder;
            x = x / 10;
        }

        return reversed;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int userinput, useroutput = 0;
        System.out.println("Enter reversible: \n");
        userinput = sc.nextInt();
        useroutput = reverse(userinput);
        System.out.println("Output: " + useroutput);
    }
}
