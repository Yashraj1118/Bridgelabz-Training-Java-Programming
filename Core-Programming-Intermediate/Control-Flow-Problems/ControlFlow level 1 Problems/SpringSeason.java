import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month between 1 and 12: ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        if ((month==3 && day>=20)||(month == 6 && day <= 20) || (month == 4) || (month == 5)) {
            System.out.println("It is a Spring Season");
        } else {
            System.out.println("not a Spring Season");
        }
    }
}