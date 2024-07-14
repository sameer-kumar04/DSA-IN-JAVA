package JAVADSAREPO;

public class ResetIthbit {
    public static void main(String[] args) {
        int n = 86;
        int i = 4;
        System.out.println(resetbit(n,i));
    }

    static int resetbit(int n, int i) {
        return  n & ~(1 << i);
    }
}
