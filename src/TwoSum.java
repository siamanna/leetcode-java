import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1 ; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr = new int[]{i, j};
                }
            }
        }
        return arr;
    }

    public static void main(String args[]) {
        int[] intarray = {3,3};
        int target = 6;
        int[] ansarray;
        ansarray = twoSum(intarray, target);
        System.out.println("The answer is: " + Arrays.toString(ansarray));

    }
}

