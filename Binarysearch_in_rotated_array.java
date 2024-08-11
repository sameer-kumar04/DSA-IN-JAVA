package Earlier;

public class Binarysearch_in_rotated_array {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr,8,0,arr.length-1));
    }

    static int search(int[] arr, int target,int start, int end ) {
        if (start > end) { //base case if target is not found 
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        //left side is sorted
        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target < arr[mid]) { //is target is at left side or not
                return search(arr,target,start,mid-1);
            }

            else {
                return search(arr,target,mid+1,end);
            }
        }

        //right side is sorted
        else{
            if (target <= arr[end] && target > arr[mid]) {//is target is at right side or not
                return search(arr,target,mid + 1,end);
            }

            else {
                return search(arr,target,start,mid -1);
            }
        }
    }
}
