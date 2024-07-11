package June28;

import java.util.Arrays;

//for searching in SORTED ARRAY
public class Staircase {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,},
                {4,5,6},
                {7,8,9},
        };

        int target = 9;

        System.out.println(Arrays.toString(search( matrix , target)));
    }

    static int[] search(int[][] array,int target) {
        int row = 0;
        int col = array[0].length-1;

        while( row < array.length && col >= 0) {
            if ( target == array[row][col]) {
                return new int[] {row,col};
            }

            else if ( target > array[row][col]) {
                row ++ ;
            }

            else{
                col -- ;
            }
        }
        return new int[] {row,col};
    }
}
