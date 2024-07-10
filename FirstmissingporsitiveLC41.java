package Leetcode;

public class FirstmissingporsitiveLC41 {
    public static void main(String[] args) {
        int[] array = { 7, 8, 9, 11, 12 };
        System.out.println(firstMissingPositive(array));
    }

    static int firstMissingPositive(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] > 0 && nums[i] < nums.length && nums[correct] != nums[i]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // search for missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }

        return nums.length;
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

}