package JAVADSAREPO;

import java.util.Scanner;

public class Countzeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        System.out.println(countzero(n, 0));
    }

    public static int countzero(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return countzero(n / 10, c + 1);
        }

        return countzero(n / 10, c);
    }
}