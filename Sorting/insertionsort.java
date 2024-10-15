import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = { 23, 58, 96, 45, 71, 25 };
        insertionsorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionsorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                } else {
                    break;
                }
            }

        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
