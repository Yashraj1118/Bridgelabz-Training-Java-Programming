import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int number=sc.nextInt();
        int orgNumber=number, sum = 0;
        while (orgNumber!=0) {
            int digit=orgNumber % 10;
            sum += digit;
            orgNumber/=10;
        }
        if (sum != 0 && number % sum == 0){
            System.out.println(number + " is a Harshad number.");
        }
        else{
            System.out.println(number + " is not a Harshad number.");
        }
    }
}