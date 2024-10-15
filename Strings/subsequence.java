import java.util.ArrayList;
import java.util.List;

public class subsequence {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(subseq(str, ""));
    }

    static List<String> subseq(String str, String newString) {// returning a list of subsequence

        List<String> result = new ArrayList<>();

        if (str.isEmpty()) {
            result.add((newString));
            return result;
        }

        char currChar = str.charAt(0);

        // want to be in
        List<String> include = subseq(str.substring(1), currChar + newString);

        List<String> exclude = subseq(str.substring(1), newString);

        result.addAll(include);
        result.addAll(exclude);

        return result;
    }

    // static List<String> subseq(String str, int index, String newString) {

    // List<String> result = new ArrayList<>();

    // if (index == str.length()) {
    // result.add((newString));
    // return result;
    // }

    // char currChar = str.charAt(index);

    // // want to be in
    // List<String> include = subseq(str, index + 1, currChar + newString);

    // List<String> exclude = subseq(str, index + 1, newString);

    // result.addAll(include);
    // result.addAll(exclude);

    // return result;
    // }
}
