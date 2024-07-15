package JAVADSAREPO;
import java.util.*;
public class Magicnumber {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(magic(4));
    }

    static int magic(int n) {
        int sum = 0;
        int base = 5;

        while ( n > 0 ) {
            int last = n & 1;
            n = n >> 1;
            sum += last * base;
            base = base * 5;
        }
        return sum;
    }
}
