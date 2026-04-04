import java.util.Scanner;
public class LargestOf3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter first number:");
        int a=sc.nextInt();
        System.out.print("enter second number:");
        int b=sc.nextInt();
        System.out.print("enter third number:");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("first number is the largest");
        }
        else if(b>a && b>c){
            System.out.println("second number is the largest");
        }
        else{
            System.out.println("third number is the largest");
        }
    }
}