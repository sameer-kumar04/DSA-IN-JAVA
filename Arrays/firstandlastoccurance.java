public class firstandlastoccurance {// for recap : https://youtu.be/9NXZccIWNqU?si=rLOVn9RWJC1KBhMa
    public static void main(String[] args) {
        int[] arr = { 10, 10, 10, 20, 20, 30, 30, 30, 40, 40 };

        int firsttime = firstoccurance(arr, 20);
        int lasttime = lastoccurance(arr, 20);

        System.out.println("First Occurrence : " + firsttime + " , Last Occurrence : " + lasttime);
    }

    static int firstoccurance(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // we will find in left for any other first occurrence then mid
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    static int lastoccurance(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // we will find in eight for any other last occurrence then mid
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

}
