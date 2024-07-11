package July1;

import java.util.Arrays;

public class SortcolorsLC75 {
    public static void main(String[] args) {
        int[] array = {2,0,2,1,1,0};
        sortColors(array);
        System.out.println(Arrays.toString(array));
    }

    static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }
}