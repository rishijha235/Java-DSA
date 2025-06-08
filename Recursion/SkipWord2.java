//Only skip the app if it is not equal to apple
public class SkipWord2 {
    public static void main(String[] args) {
        System.out.println((skip("applepieappl")));
    }

    static String skip(String up){
        if(up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skip(up.substring(3));
        } else {
            return up.charAt(0) + skip(up.substring(1));
        }
    }
}
