import java.util.ArrayList;
import java.util.List;

public class spiralmatrix { // famous question based on 2d matrix (or array)
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        System.out.println(spiral(matrix));
    }

    static List<Integer> spiral(int[][] matrix) {

        int sr = 0;
        int er = matrix.length - 1;
        int sc = 0;
        int ec = matrix[0].length - 1;

        ArrayList<Integer> ans = new ArrayList<>(); // for storing in the order of spiral

        while (sr <= er && sc <= ec) {

            for (int j = sc; j <= ec; j++) {// top
                ans.add(matrix[sr][j]);
            }

            for (int i = sr + 1; i <= er; i++) {// right
                ans.add(matrix[i][ec]);
            }

            for (int j = ec - 1; j >= sc; j--) {// bottom
                if (sr == er) {
                    break;
                }
                ans.add(matrix[er][j]);
            }

            for (int i = er - 1; i >= sr + 1; i--) {// left
                if (sc == ec) {
                    break;
                }
                ans.add(matrix[i][sc]);
            }

            sr++;
            sc++;
            er--;
            ec--;
        }

        return ans;
    }
}
