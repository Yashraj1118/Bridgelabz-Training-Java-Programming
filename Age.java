import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        int year=2000;
        Scanner sc=new Scanner(System.in);
        int currentYear=sc.nextInt();
        int age=currentYear-year;
        System.out.println("Your age is "+age);
        sc.close();
    }
}
