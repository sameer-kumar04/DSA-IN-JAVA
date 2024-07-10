package Leetcode;

public class DuplicatenumLC287 {
    public static void main(String[] args) {

    }

    static int findDuplicate(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;

                if (nums[correct] != nums[i]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }

        }

        return -1;

    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}