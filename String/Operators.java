import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        //convets a & b to its ASCII value
        System.out.println('a' + 'b'); // 195

        // add string a & b
        System.out.println("a" + "b"); // ab
        System.out.println("a" + 'b'); // ab
        
        System.out.println('a' + 3); // 100
        System.out.println((char)('a' + 3)); // d

        //Integer is converted to Integer that will call toString() method
        System.out.println("a" + 3); // a3

        System.out.println("Rishi" + new ArrayList<>()); // Rishi[]
        System.out.println("Rishi" + new Integer(4)); // Rishi4

        // + operator in java, youcan only use with primitives and you can only use this with all the
        // complex objects as well but the only condition is atleast one of these objects is of type string.
        // System.out.println(new ArrayList<>() + new Integer(4)); //error
        System.out.println(new ArrayList<>() + "" + new Integer(4)); //[]4
        
    }
}
