import java.util.Arrays;

public class inverseofarray {// for recap : https://youtu.be/1NvhnN56NKc?si=xDR6js9-ibcYS9be
    public static void main(String[] args) {
        int[] arr = { 2, 1, 4, 3, 0 };
        System.out.println(Arrays.toString(inverse(arr)));
    }

    static int[] inverse(int[] arr) {
        int[] inv = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int v = arr[i];
            inv[v] = i;
        }

        return inv;
    }
}
