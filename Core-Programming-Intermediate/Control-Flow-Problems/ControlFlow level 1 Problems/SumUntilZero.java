import java.util.Scanner;
public class SumUntilZero{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.print("enter a number:");
            int num=sc.nextInt();
            if (num<=0) break;
            sum+=num;
        }
        System.out.println("Sum is "+sum);
    }
}