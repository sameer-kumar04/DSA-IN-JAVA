package JAVADSAREPO;

public class Xor {
    public static void main(String[] args) {
        System.out.println(xor(9));
    }

    static int xor ( int a) {
        if ( a % 4 == 0) {
            return a;
        }
        if ( a % 4 == 1) {
            return 1;
        }

        if (a % 4 == 2) {
            return a+1;
        }

        return 0;
    }
}
