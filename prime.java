package Earlier;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n) {
        if (n <= 1) { //for 0 and 1
            return false;
        }
        if (n == 2) {
            return true;
        }
        if ((n & 2) == 0) { // if number is even then it will not a prime number
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
