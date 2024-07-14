package JAVADSAREPO;

public class Findunique {
    public static void main(String[] args) {
        int[] array = { 2, 4, 2, 6, 4 ,2,2,4,4};

        System.out.println(find(array));
    }

    static int find(int[] arr) {
        int unique = 0;

        for (int num : arr) {
            unique ^= num;
        }

        return unique;
    }
}