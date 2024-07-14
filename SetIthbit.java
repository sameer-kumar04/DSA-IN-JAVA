package JAVADSAREPO;

/*Set means if bit is 0 -> 1   and   if  1 -> 1 */
public class SetIthbit {
    public static void main(String[] args) {
        int n = 86;
        int i = 3;
        System.out.println(setbit(n, i));
    }

    static int setbit(int n, int i) {
        return n | (1 << i);
    }
}
