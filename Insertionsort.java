package SortingAlgo;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        insertion(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                }

                else { // array[j] > array[j-1]
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
