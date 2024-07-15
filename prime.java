package Earlier;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int n = sc.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }
    static boolean isPrime(int n) {
        if (n<=1) {
            return false;
        }
        if (n==2) {
            return true;
        }
        if ((n & 1)==0) { //if number is even then it will not a prime number
            return false;
        }
        for (int i = 3; i<=Math.sqrt(n); i++) {
            if ( n % i == 0) {
                return false;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
