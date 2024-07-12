package JAVADSAREPO;

import java.util.*;

public class Bintodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Binary Number : ");
        int n = sc.nextInt();

        System.out.println("In Decimal : " + bintoDecimal(n));
    }

    static int bintoDecimal(int n) {
        int decimal = 0;
        int power = 0;

        while (n > 0) {
            decimal += (int) ((n % 10) * Math.pow(2, power));
            n = n / 10;
            power++;
        }

        return decimal;
    }
}