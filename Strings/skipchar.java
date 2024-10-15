public class skipchar {
    public static void main(String[] args) {
        String str = "Sameer";
        System.out.println(skip(str, 'e'));
    }

    static String skip(String str, char skipthat) {
        if (str.isEmpty()) {
            return "";
        }

        char currChar = str.charAt(0);

        if (currChar == skipthat) {
            return skip(str.substring(1), skipthat);
        }

        return currChar + skip(str.substring(1), skipthat);
    }
}

// static void skip(String str, int index, String newString, char skipthat) {
// if (index == str.length()) {
// System.out.println(newString);
// return;
// }

// char currChar = str.charAt(index);
// if (currChar == skipthat) {
// skip(str, index + 1, newString, skipthat);
// } else {
// newString += currChar;
// skip(str, index + 1, newString, skipthat);
// }
// }
