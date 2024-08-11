package Earlier;

public class Issorted {
    public static void main(String[] args) {
        int[] array = {1,3,4,2,5,6};
        System.out.println(issorted(array));
    }

    static boolean issorted(int[] arr) {
        return helper(arr,0);
    }

    static boolean helper (int[] arr, int index) {

        if (index == arr.length - 1) { //when the pointed reaches at last it means arrays is sorted 
            return true;
        }

        return arr[index] < arr[index + 1] && helper(arr,index + 1);
    }
}
