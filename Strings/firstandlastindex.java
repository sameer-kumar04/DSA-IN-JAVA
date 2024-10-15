public class firstandlastindex {
    public static void main(String[] args) {
        String str = "abcda";
        findfirstlast(str, 0, 'a');
    }

    public static int first = -1;
    public static int last = -1;

    static void findfirstlast(String str, int index, char target) {
        if (index == str.length()) {
            System.out.println("First occurrence : " + first + ", Last occurrence : " + last);
            return;
        }

        char currChar = str.charAt(index);

        if (currChar == target) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        findfirstlast(str, index + 1, target);
    }
}
