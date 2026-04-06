import java.util.Scanner;
public class Countdown{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter countdown start:");
        int counter = sc.nextInt();
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Launch");
    }
}