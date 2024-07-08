package SortingAlgo;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] a = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        bubble(a);
        System.out.println(Arrays.toString(a));
    }

    static void bubble(int[] array) {

        boolean swapped;

        for (int i = 0; i < array.length; i++) {
            swapped = false;
            for (int j = 1; j < array.length - i; j++) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) { // condition if the given array is already sorted then the whole loop will not
                                    // run
                break;
            }
        }
    }
}
