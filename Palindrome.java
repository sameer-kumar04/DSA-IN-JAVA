import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type any Word or Number : ");
        String line = sc.nextLine();
        line = line.toLowerCase();

        System.out.println(isPalindrome(line, 0, line.length() - 1));

    }

    public static boolean isPalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindrome(str, start + 1, end - 1);
    }

}