public class ceilfloor {// visit this link for recap : https://youtu.be/qaQRRWXgFIQ?si=8YztaztbP31WPLim
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        find(arr, 31);

    }

    static void find(int[] arr, int target) { // here target means ceil and floor of which number you want

        int start = 0;
        int end = arr.length - 1;
        int ceil = Integer.MAX_VALUE;// taking it as +infinity
        int floor = Integer.MIN_VALUE;// taking it as -infinity

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
                floor = arr[mid];
            }

            else if (target < arr[mid]) {
                end = mid - 1;
                ceil = arr[mid];
            }

            else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }
        System.out.println("Ceil : " + ceil);
        System.out.println("Floor : " + floor);
    }
}
