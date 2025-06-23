
import java.util.Arrays;

// package OOPS;

public class Main {
    public static void main(String[] args) {
        //data of 5 students {rollNo, name, marks}
        // int[] rollNum = new int[5];
        // String[] names = new String[5];
        // float[] marks = new float[5];

        // we have created different data types for each attribute
        // we need a data structure in which every single element contains these three attributes
        // here class in introduced we can create a class to represent a student
        // class: a named group of properties and methods that define a type of object
        // object: an instance of a class, containing specific values for the properties defined by the
        // you can make your own data types using classes

        Student[] students = new Student[5];

        //object of class Student
        //this will call the constructor with parameters
        Student student1 = new Student(1, "Rohan", 85.5f);
        student1.greeting();
        System.out.println("Student1 Name: " + student1.name + ", Roll No: " + student1.rollNum + ",Marks: " + student1.marks);
        System.out.println();
        
        //this will call the default constructor
        Student student2 = new Student();
        student2.rollNum = 2;
        student2.name = "Shivam";
        student2.marks = 90.0f;

        System.out.println("Student2 Name: " + student2.name);
        System.out.println("Roll No: " + student2.rollNum);
        System.out.println("Marks: " + student2.marks);

        // by default, the array will contain null values
        System.out.println(Arrays.toString(students));
        
    }
}

// we can create a class to represent every single student
    class Student {
        int rollNum;
        String name;
        float marks;

        void greeting() {
            System.out.println("Hello, my name is " + name);
        }

        //we need a way to add the value of the students
        // we need one word to access every object //this keyword
        // Constructor with parameters (constructor overloading)
        //Student student1 = new Student(19, "Aniket", 85.5f);
        //here, this keyword refers to the current object(student1)
        Student(int rollNum, String name, float marks) {
            this.rollNum = rollNum;
            this.name = name;
            this.marks = marks;

            //return type is its class itself
        }

        // Default constructor
        Student() {
            // this.rollNum = 0;
            // this.name = "Unknown";
            // this.marks = 0.0f;
        }
    }
