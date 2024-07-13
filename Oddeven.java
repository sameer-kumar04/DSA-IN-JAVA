package JAVADSAREPO;
import java.util.Scanner;
public class Oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n = sc.nextInt();

        System.out.println(isEven(n));
    }

    static boolean isEven(int n) {
        return (n & 1) == 0;
    }
}
