package JAVADSAREPO;

import java.util.Arrays;

public class FlipimageLC832 {
    public static void main(String[] args) {
        int[][] array = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flip(array)));
    }

    static int[][] flip(int[][] arr) {

        for (int[] num : arr) {
            int start = 0;
            int end = num.length - 1;
            while (start <= end) {
                int temp = num[start] ^ 1;
                num[start] = num[end] ^ 1;
                num[end] = temp;

                start++;
                end--;
            }
        }


        return arr;
    }
}
