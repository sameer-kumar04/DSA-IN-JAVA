package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class DuplicatenumarrayLC442 {

    static List<Integer> findDuplicates(int[] nums) {
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

        List<Integer> ans = new ArrayList<Integer>();

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(nums[index]);
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
