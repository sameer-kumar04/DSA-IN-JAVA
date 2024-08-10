package JAVADSAREPO.Earlier;

public class Sumofdigits {
    public static void main(String[] args) {
        System.out.println(sumofeach(12345));
    }

    static int sumofeach(int n) {
        if (n == 0) {
            return 0;
        }

        return sumofeach(n / 10) + ( n % 10 );
    }
}
