import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int sum=num1+num2;
        int difference=num1-num2;
        int product=num1*num2;
        double quotient=(double)num1/num2;
        System.out.println("sum: "+sum);
        System.out.println("difference: "+difference);
        System.out.println("product: "+product);
        System.out.println("quotient: "+quotient);
    }

}
