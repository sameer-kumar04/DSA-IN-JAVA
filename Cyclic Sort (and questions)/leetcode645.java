import java.util.Arrays;

public class leetcode645 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4 };
        System.out.println(Arrays.toString(solution(arr)));
    }

    static int[] solution(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int corrIndex = arr[i] - 1;
            if (arr[corrIndex] != arr[i]) {
                swap(arr, i, corrIndex);
            } else {
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return new int[] { arr[index], index + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
