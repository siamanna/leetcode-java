import java.util.Scanner;

public class isGood {
    public static boolean isGood(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        boolean booly;
        int[] arr = {1, 2, 3, 3, 5};
        booly = isGood(arr);
        System.out.println("Result: " + booly);
    }

}
