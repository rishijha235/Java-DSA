import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the fruit: ");
        String fruit = sc.next();

//         switch (fruit) {
//             case "Apple":
//                 System.out.println("Apple is red in color");
//                 break;

//             case "Mango":
//                 System.out.println("Mango is king of fruits");
//                 break;
        
//             case "Banana":
//                 System.out.println("Banana is yellow in color");
//                  break;
//             default:
//                 System.out.println("I don't know this fruit");
                
//         }
        
//     }    
// }



//M2
        switch (fruit) {
            case "Apple" -> System.out.println("Apple is red in color");
            case "Mango" -> System.out.println("Mango is king of fruits"); 
            case "Banana" ->System.out.println("Banana is yellow in color");
            default ->  System.out.println("I don't know this fruit");
                
        }
        
    }    
}
