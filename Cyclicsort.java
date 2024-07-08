package SortingAlgo;

import java.util.Arrays;

public class Cyclicsort {
    public static void main(String[] args) {
        int[] array = { 1, 5, 3, 4, 2 };
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    static void sort(int[] array) {
        int i = 0;

        while (i < array.length) {
            int correct = array[i] - 1;

            if (array[correct] != array[i]) {
                swap(array, i, correct);
            }

            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
