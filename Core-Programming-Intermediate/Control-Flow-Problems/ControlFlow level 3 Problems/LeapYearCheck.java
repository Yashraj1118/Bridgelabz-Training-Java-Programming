import java.util.Scanner;
public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a year: ");
        int year = sc.nextInt();
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(" it is a Leap Year");
        } 
        else {
            System.out.println("it is not a Leap Year");
        }
    }
}