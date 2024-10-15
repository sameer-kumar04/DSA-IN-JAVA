public class leetocde268 {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 1 };
        System.out.println(missing(arr));

    }

    static int missing(int[] arr) {
        int n = arr.length;
        int rsum = n * (n + 1) / 2;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        return rsum - sum;
    }

}
