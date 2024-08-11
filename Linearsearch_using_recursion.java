package Earlier;

public class Linearsearch_using_recursion {
    public static void main(String[] args) {
        int[] array = {2,4,6,8,10};
        System.out.println(linearsearch(array,8,0));
    }

    static int linearsearch(int[] arr, int target, int index) {
        if ( index > arr.length - 1) {
            return -1; //target not found
        }

        if ( arr[index] == target) { //when target is found 
            return index;
        }

        return linearsearch(arr,target,index+1);
    }
}
