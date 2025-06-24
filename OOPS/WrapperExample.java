public class WrapperExample {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 7;
        // ` // This will not swap the values of a and b because Java is pass-by-value

        // Integer a = 10;
        // Integer b = 7;
        // System.out.println(swap(a, b)); // This will also not swap the values of a and b because Integer is final class
        

        // //Integer is final , so we can't change its value
        // Integer num = 10; // it is an object of Integer class (this is known as a wrapper class)

        // // Wrapper classes are used to convert primitive data types into objects
        // // we can't do this with primitive data types (int a = 10;), but we can do it with wrapper classes (Integer num = 10;)
        // boolean ans = num.equals(10);
        // System.out.println(ans);
        
        // final int bonus =  2;
        // bonus = 3; // This will not compile because bonus is final and cannot be reassigned

        // Student rishi = new Student("Rishi");
        // System.out.println(rishi.name); // This will print Rishi

        // final Student rishi = new Student("Rishi");
        // rishi.name = "Rishabh"; // This is allowed because we are modifying the state of the object, not the reference
        // //when a non premitive is final, you cannot chnage it.
        // rishi = new Student("new object"); // This will not compile because rishi is final and cannot be reassigned

        Student obj;
        // Creating a large number of objects to demonstrate garbage collection
        // This will create a lot of objects and then they will be eligible for garbage collection
        for (int i = 0; i < 100000; i++) {
            obj = new Student("Random Student " + i);
            System.out.println(obj.name);
            // The object will be eligible for garbage collection after this loop iteration
        }

    }

    // // This will not work because Java is pass-by-value
    // static void swap(int a, int b) {
    //     int temp = a;
    //     a = b;
    //     b = temp;
    // }

    // // This will not work because Integer is a final class and cannot be modified
    // static void swap(Integer a, Integer b) {
    //     int temp = a;
    //     a = b;
    //     b = temp;
    // }
}

class Student {
    final int num = 10;
    String name;
    
    public Student(String name) {
        System.out.println("Object is created");
        this.name = name;
    }

    // whenever an object of class Student is destroyed, this method is called
    // This is called a destructor in C++ but in Java, it is called a finalizer
    // Note: finalize() method is deprecated in Java 9 and should not be used in production code.
    // It is recommended to use try-with-resources or explicit resource management instead.
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is being garbage collected (destroyed)");
    }
}
