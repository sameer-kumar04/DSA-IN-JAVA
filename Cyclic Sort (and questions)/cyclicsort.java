import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, 3, 1 };
        cyclisorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclisorting(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // for range [1,N] //for [0,N] correctIndex = arr[i];
            if (arr[correctIndex] != arr[i]) {
                swap(arr, correctIndex, i);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
