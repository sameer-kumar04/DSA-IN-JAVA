public class stringreverse {
    public static void main(String[] args) {
        String a = "Sameer";
        reverse(a, a.length() - 1);
    }

    static void reverse(String str, int index) {
        if (index == 0) {
            System.out.print(str.charAt(index) + " ");
            return;
        }

        System.out.print(str.charAt(index) + " ");
        reverse(str, index - 1);
    }
}