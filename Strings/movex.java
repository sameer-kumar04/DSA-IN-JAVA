public class movex {
    public static void main(String[] args) {
        String str = "axxbcdxx";
        String str1 = " ";
        move(str, 0, 0, str1);
    }

    static void move(String str, int count, int index, String newString) {
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }

            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);

        if (currChar == 'x') {
            count++;
            move(str, count, index + 1, newString);
        } else {
            newString += currChar;
            move(str, count, index + 1, newString);
        }
    }
}
