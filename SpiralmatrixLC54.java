package June28;

import java.util.*;

public class SpiralmatrixLC54 {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };

        System.out.println(printSpiral(matrix));
    }

    static ArrayList<Integer> printSpiral(int[][] matrix) {
        int sR = 0;
        int eR = matrix.length - 1;
        int sC = 0;
        int eC = matrix[0].length - 1;

        ArrayList<Integer> ans = new ArrayList<>(); // arraylist for storing spiral array

        while (sC <= eC && sR <= eR) {

            // TOP
            for (int j = sC; j <= eC; j++) {
                ans.add(matrix[sR][j]);
            }

            // RIGHT
            for (int i = sR + 1; i <= eR; i++) {
                ans.add(matrix[i][eC]);
            }

            // BOTTOM
            for (int j = eC - 1; j >= sC; j--) {
                if (sR == eR) {
                    break;
                }
                ans.add(matrix[eR][j]);
            }

            // LEFT
            for (int i = eR - 1; i >= sR + 1; i--) {
                if (sC == eC) {
                    break;
                }
                ans.add(matrix[i][sC]);
            }

            sR++;
            eR--;
            sC++;
            eC--;
        }
        return ans;
    }
}
