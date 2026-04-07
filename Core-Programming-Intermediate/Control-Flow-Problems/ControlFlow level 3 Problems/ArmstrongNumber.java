import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int number=sc.nextInt();
        int orgNumber=number, sum = 0;
        while (orgNumber!=0) {
            int digit=orgNumber % 10;
            sum += digit*digit*digit;
            orgNumber/=10;
        }
        if (sum == number){
            System.out.println(number + " is an Armstrong number.");
        }
        else{
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}