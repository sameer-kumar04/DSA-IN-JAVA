package sort;

import java.util.*;

public class DissapearednumLC448 {
    public static void main(String[] args) {

    }

    static List<Integer> findDisappearedNumbers(int[] nums) {

        int i = 0;

        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[correct] != nums[i]) {
                swap(nums, i, correct);
            }

            else {
                i++;
            }
        }
        // now here we have to find missing numbers
        List<Integer> ans = new ArrayList<Integer>();

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(nums[index + 1]);
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}