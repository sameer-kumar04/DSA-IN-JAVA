import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr = { 23, 58, 96, 45, 71, 25 };
        bubblesorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubblesorting(int[] arr) { // stable sorting algorithm
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}