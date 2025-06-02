public class Comparator {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        // compareTo method used to compare the content of the object
        System.out.println(s1.compareTo(s2)); // 0
        // == compares the reference of the object
        System.out.println(s1 == s2); // true

        String s3 = "abc";
        String s4 = new String("abc");
        System.out.println(s3 == s4); // false
        // equals method used to compare the content of the object
        System.out.println(s3.equals(s4)); // true
        
    }   
}
