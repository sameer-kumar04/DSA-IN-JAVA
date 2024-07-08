package SortingAlgo;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] array1 = { 4, 6, 9, 5, 2, 30 };
        selection(array1);
        System.out.println(Arrays.toString(array1));
    }

    static void selection(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int last = array.length - i - 1;
            int getMaxIndex = getmax(array, 0, last);
            swap(array, getMaxIndex, last);
        }
    }

    static int getmax(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
