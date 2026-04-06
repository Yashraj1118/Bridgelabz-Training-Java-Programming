import java.util.Scanner;
public class EmployeeBonus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter salary:");
        float salary = sc.nextFloat();
        System.out.print("enter years of service:");
        int years = sc.nextInt();
        if (years > 5) {
            float bonus=(float) (0.05*salary);
            System.out.println("bonus is: "+bonus);
        } else {
            System.out.println("no bonus");
        }
    }
}
