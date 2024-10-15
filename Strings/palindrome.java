public class palindrome {
    public static void main(String[] args) {
        String str = "mada";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        str = str.toLowerCase();

        int s = 0;
        int e = str.length() - 1;

        while (s <= e) {
            if (str.charAt(s) == str.charAt(e)) {
                s++;
                e--;
            } else {
                return false;
            }
        }
        return true;
    }
}
