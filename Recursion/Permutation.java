import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        // permutations( "", "abc");

        // System.out.println(permutationsList("", "abc"));

        int count = permutationsCount("", "abc");
        System.out.println("Total permutations: " + count);
    }

    // static void permutations(String p, String up){
    //     if(up.isEmpty()) {
    //         System.out.println(p);
    //         return;
    //     }
    
    //     char ch = up.charAt(0);
    //     for(int i = 0; i <= p.length(); i++) {
    //         String first = p.substring(0, i);
    //         String second = p.substring(i);
    //         permutations(first + ch + second, up.substring(1));
    //     }
    // }

    // // Adding ans in arraylist and then return
    // static ArrayList<String> permutationsList(String p, String up){
    //     if(up.isEmpty()) {
    //         ArrayList<String> list = new ArrayList<>();
    //         list.add(p);
    //         return list;
    //     }

    //     char ch = up.charAt(0);
    //     ArrayList<String> ans = new ArrayList<>();
        
    //     for(int i = 0; i <= p.length(); i++) {
    //         String first = p.substring(0, i);
    //         String second = p.substring(i);
    //         ans.addAll(permutationsList(first + ch + second, up.substring(1)));
    //     }
    //     return ans;
    // }

    
    //counting no. or permutations
    static int permutationsCount(String p, String up){
        if(up.isEmpty()) {
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);
        for(int i = 0; i <= p.length(); i++) {
            String first = p.substring(0, i);
            String second = p.substring(i);
            count += permutationsCount(first + ch + second, up.substring(1));
        }
        return count;
    }
}
