package AdvanceJava.ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

// public class Exceptions {
//     public static void main(String[] args) {
//         int a=10;
//         int b=0;
//         try{
//             int c=a/b;
//             System.out.println(c);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Cannot divide by zero");
//             System.out.println(e.getMessage());
//         }
//     }
// }




// Nested try-catch blocks------>>>>>

// public class Exceptions {
//     public static void main(String[] args) {
//         int[]arr={1,2,3};
//         try{
//             try{
//                 System.out.println(arr[5]);
//             }
//             catch(ArrayIndexOutOfBoundsException e){
//                 System.out.println("Array index is out of bounds");
//                 System.out.println(e.getMessage());
//             }
//             String str=null;
//             try{
//                 System.out.println(str.length());
//             }
//             catch(NullPointerException e){
//                 System.out.println("String is null");
//                 System.out.println(e.getMessage());
//             }

//         }
//         catch(Exception e){
//             System.out.println("An exception occurred");
//             System.out.println(e.getMessage());
//         }
//     }
// }





//    Throw keyword------>>>>>   


// public class Exceptions {

//     public static void main(String[] args) {
//         int age=15;
//             if(age<18){
//                 throw new ArithmeticException("Age must be at least 18 to vote");
//             }
//             else{
//                 System.out.println("You are eligible to vote");
//             }
//     }
// }





//  Throws Keyword------>>>>>  throws keyword ko hum method signature me use karte hai jab hum kisi method ke andar koi checked exception throw karte hai to usko handle karne ke liye throws keyword ka use karte hai. throws keyword se hum compiler ko batate hai ki ye method ek checked exception throw kar sakta hai aur is exception ko handle karna caller method ka responsibility hai. throws keyword se hum multiple exceptions bhi declare kar sakte hai, unhe comma se separate karke. throws keyword se hum apne code ko cleaner aur more readable bana sakte hai, kyunki hum exception handling ko caller method par delegate kar dete hai, jisse caller method apne hisab se exception ko handle kar sakta hai.

// public class Exceptions {

//     static void readFile() throws IOException {
//         FileReader file = new FileReader("abc.txt"); // may cause error
//     }

//     public static void main(String[] args) {
//         try {
//             readFile();   // calling method
//         } catch (IOException e) {
//             System.out.println("File not found");
//         }
//     }
// }





//   custom exception------>>>>>>

public class Exceptions {
    public static void main(String[] args) {
        int age = 16;

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18+");
            }
            System.out.println("Eligible");
        } 
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}