public class staircasesearch { // searching algorithm for 2d array
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 }
        };
        Staircasesearch(arr, 7);
    }

    static void Staircasesearch(int[][] arr, int target) {// from top_right (you can also do from bottomleft)

        int row = 0, column = arr[0].length - 1;

        while (column >= 0 && row < arr.length) {

            if (target == arr[row][column]) {
                System.out.println("found at : " + "[" + row + "," + column + "]");
                return; // break the loop when you found the elements

            } else if (target < arr[row][column]) { // if target is less than the current element go left
                column--;
            } else { // and if the target is greater than the current element go down
                row++;
            }
        }
        System.out.println("Not found");
    }
}
