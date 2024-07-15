package JAVADSAREPO;

public class Powerof2 {
    public static void main(String[] args) {
        int n = 0;
        System.out.println(ispower(n));
    }
/*Another Method (From 2's complement) : Ex- 10000 = 1111 + 1
 and if you take (10000 & 1111 = 0) hence , if ( n & (n-1)) == 0 {It is power of 2}*/
    static boolean ispower(int n) {
        int count = 0;

        while ( n > 0 ){
            int ld = n & 1;

            if (ld == 1) {
                count++;
            }

            n = n >> 1;
        }

        if (count == 1) {
            return true;
        }

        return false;
    }
}
