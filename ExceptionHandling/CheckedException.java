package AdvanceJava.ExceptionHandling;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
   public static void main(String[] args) {

        try {
            FileReader file = new FileReader("abc.txt");
            System.out.println("File opened successfully");

        } catch (FileNotFoundException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

    }
}
