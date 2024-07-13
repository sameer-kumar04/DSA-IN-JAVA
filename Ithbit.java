package JAVADSAREPO;
import java.util.Scanner;

public class Ithbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.print("Enter Ith bit you want : ");
        int i = sc.nextInt();

        System.out.println(bit(n,i));
    }

    static int bit(int n, int i) {
        return (n >> i) & 1;
    }
}
