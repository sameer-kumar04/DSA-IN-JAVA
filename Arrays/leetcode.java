import java.util.Arrays;

public class leetcode {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 10 };
        System.out.println(Arrays.toString(searchRange(arr, 6)));
    }

    public static int[] searchRange(int[] nums, int target) {
        return new int[] { firstoccurance(nums, target), lastoccurance(nums, target) };
    }

    static int firstoccurance(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // we will find in left for any other first occurrence then mid
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    static int lastoccurance(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // we will find in eight for any other last occurrence then mid
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}