import java.util.Scanner;

public class MarksPercentageGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter marks in Physics: ");
        int physics = sc.nextInt();
        System.out.print("enter marks in Chemistry: ");
        int chemistry = sc.nextInt();
        System.out.print("enter marks in Maths: ");
        int maths = sc.nextInt();
        double average = (physics + chemistry + maths) / 3.0;
        System.out.println("average Marks is: " + average);
        if (average >= 90) {
            System.out.println("Grade: A+");
        } 
        else if (average >= 75) {
            System.out.println("Grade: A");
        } 
        else if (average >= 60) {
            System.out.println("Grade: B");
        } 
        else if (average >= 40) {
            System.out.println("Grade: C");
        } 
        else {
            System.out.println("Grade: F");
        }
    }
}