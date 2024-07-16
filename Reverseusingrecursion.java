import java.util.Scanner;

public class Reverseusingrecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int n = sc.nextInt();
        reverse(n);
    }

    static void reverse(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }

        else {
            System.out.println(n % 10);
            reverse(n / 10);
        }
    }
}