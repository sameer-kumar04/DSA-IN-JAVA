import java.util.Arrays;

public class selectionsort { // unstable sorting algorithm
    public static void main(String[] args) {
        int[] arr = { 23, 58, 96, 45, 71, 25 };
        selectionsorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionsorting(int[] arr) { // in this sorting technique we find out the max element in each iteration
        // and swapped it with the last element in each iteration
        for (int i = 0; i < arr.length; i++) {
            int lastelement = arr.length - i - 1;
            int max = getmax(arr, 0, lastelement);
            swap(arr, lastelement, max);
        }

    }

    static int getmax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
