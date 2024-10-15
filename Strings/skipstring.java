public class skipstring {
    public static void main(String[] args) {
        String str = "myloveisapple";
        System.out.println(skipthis(str, "apple"));
    }

    static String skipthis(String str, String skipthat) {
        if (str.isEmpty()) {
            return "";
        }

        if (str.startsWith(skipthat)) {
            return skipthis(str.substring(skipthat.length()), skipthat);
        } else {
            return str.charAt(0) + skipthis(str.substring(1), skipthat);
        }
    }
}
