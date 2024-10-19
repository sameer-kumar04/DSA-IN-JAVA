class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {//still we are in increasing side slope will be at right 
                left = mid + 1;  // Move left to the right side
            } else {
                right = mid;     // Move right to the left side
            }
        }

        // left and right are equal at the peak index, so returning either is correct
        return right;  // You can also use "return left;"
    }
}
