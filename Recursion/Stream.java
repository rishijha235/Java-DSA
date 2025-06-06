public class Stream {
    //Remove all 'a' from the string using recursion
    // and return the new string.
    public static void main(String[] args) {
        // skip("", "baccad");
        String ans = skip2("baccad");
        System.out.println(ans);

    }

    // static void skip(String p, String up) {
    //     if(up.isEmpty()) {
    //         System.out.println(p);
    //         return;
    //     }

    //     char ch = up.charAt(0);

    //     if (ch == 'a') {
    //         skip(p, up.substring(1));
    //     } else {
    //         skip(p + ch, up.substring(1));
    //     }
    // }

    //returning String
    static String skip2(String up) {
        if(up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip2(up.substring(1));
        } else {
            return ch + skip2(up.substring(1));
        }
    }
}
