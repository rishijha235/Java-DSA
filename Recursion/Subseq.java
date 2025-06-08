import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        String str = "abc";

        // subseq("", str);
        
        System.out.println(subSeq("", str));
    }

    // static void subseq(String p, String up) {
    //     if (up.isEmpty()) {
    //         System.out.print(p + " ");
    //         return;
    //     }

    //     char ch = up.charAt(0);

    //     // Include the character
    //     subseq(p + ch, up.substring(1));

    //     // Exclude the character
    //     subseq(p, up.substring(1));
    // }

    // Adding ans in arraylist and then retuen
    static ArrayList<String> subSeq(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        // Include the character
        ArrayList<String> left = subSeq(p + ch, up.substring(1));

        // Exclude the character
        ArrayList<String> right = subSeq(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
