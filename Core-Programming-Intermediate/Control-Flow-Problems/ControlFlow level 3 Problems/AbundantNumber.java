import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum += i;
        }
        if (sum > number)
            System.out.println("it is an abundant number");
        else
            System.out.println("it is not an abundant number");
    }
}