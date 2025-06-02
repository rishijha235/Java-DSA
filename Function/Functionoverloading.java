import java.util.Arrays;

public class Functionoverloading {
    public static void main(String[] args) {

        same("Rishi");           //at compile time it will decide which function to run by comparing parameters 
        same(23);
        same("Rishi", "Pratik", "Shubham", "Aminesh");

    }
    //when two or more functions have same name then it is called function overloading
    //and they can exists if the type of arguments/parameters are different or no. of arguments are different
    static void same(int age){
        System.out.println(age);
    }
    static void same(String name){
        System.out.println(name);
    }
    //Varargs
    //when we don't know the no. of arguments then we can use varargs
    static void same(String... names){
            System.out.println(Arrays.toString(names));
    }

}
