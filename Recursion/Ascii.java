import java.util.ArrayList;

public class Ascii {
    public static void main(String[] args) {
        // subSeqAscii("", "abc");

        System.out.println(subSeqAsciiRet("", "abc"));;
    }

    // static void subSeqAscii(String p, String up) {
    //     if (up.isEmpty()) {
    //         System.out.print(p + " ");
    //         return;
    //     }

    //     char ch = up.charAt(0);

    //     // Include the character
    //     subSeqAscii(p + ch, up.substring(1));

    //     // Exclude the character
    //     subSeqAscii(p, up.substring(1));

    //     // Include ASCII value of the character
    //     subSeqAscii(p + (ch + 0), up.substring(1)); //ch + 0 gives the ASCII value of the character
    // }

    //Returning the ans in String
    static ArrayList<String> subSeqAsciiRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        // Include the character
        ArrayList<String> first = subSeqAsciiRet(p + ch, up.substring(1));

        // Exclude the character
        ArrayList<String> second = subSeqAsciiRet(p, up.substring(1));

        // Include ASCII value of the character
        ArrayList<String> third = subSeqAsciiRet(p + (ch + 0), up.substring(1)); //ch + 0 gives the ASCII value of the character
        first.addAll(second);
        first.addAll(third);
        return first;
    }

}
