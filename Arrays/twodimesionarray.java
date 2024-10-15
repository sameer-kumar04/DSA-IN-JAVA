public class twodimesionarray {
    public static void main(String[] args) {
        int[][] array2d = {
                { 2, 4, 6, 8 },
                { 10, 12, 14, 16 },
                { 18, 20, 22, 24 }
        };

        print2darray(array2d);
    }

    static void print2darray(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
