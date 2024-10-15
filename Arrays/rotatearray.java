import java.util.Arrays;

public class rotatearray { // for rotating an array by k https://youtu.be/8RErc0VXAo8?si=G5x4RBrC1YAWh3Kd
                           // (for recap)
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] arr, int k) {

        k = k % arr.length; // case : when k is greater than the length of the array

        if (k < 0) { // when k is negative
            k = k + arr.length;
        }

        // for reversing 1st part
        reverse(arr, 0, arr.length - k - 1);

        // for reversing 2nd part
        reverse(arr, arr.length - k, arr.length - 1);

        // now for reversing the whole one again
        reverse(arr, 0, arr.length - 1);
    }

    static void reverse(int[] arr, int s, int e) { // this reverse function used in rotating the elements of the array
        int start = s;
        int end = e;

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
