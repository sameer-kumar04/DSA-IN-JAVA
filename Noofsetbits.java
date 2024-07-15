package JAVADSAREPO;

public class Noofsetbits {
    public static void main(String[] args) {
        int n = 234567;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setbits(n));
    }

    static int setbits(int n) {
        int count = 0;

        while ( n > 0 ) {
            int ld = n & 1;

            if ( ld == 1) {
                count ++ ;
            }

            n = n >> 1;
        }

        return count;
    }
}
