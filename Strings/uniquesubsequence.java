import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class uniquesubsequence {
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> Set = new HashSet<>();

        System.out.println(uniquesubseq(str, "", Set));
    }

    static List<String> uniquesubseq(String str, String newString, HashSet<String> Set) {

        List<String> result = new ArrayList<>();

        if (str.isEmpty()) {
            if (!Set.contains(newString)) { // Directly check and add if absent
                result.add(newString);
                Set.add(newString);
            }
            return result;
        }

        char currChar = str.charAt(0);

        List<String> include = uniquesubseq(str.substring(1), currChar + newString, Set);

        List<String> exclude = uniquesubseq(str.substring(1), newString, Set);

        result.addAll(include);
        result.addAll(exclude);

        return result;
    }
}
