
import java.util.Scanner;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] ages=new int[3];
        int[] heights=new int[3];
        String[] names={"Amar", "Akbar", "Anthony"};

        for (int i=0;i<3;i++) {
            System.out.print("enter age of"+names[i]+": ");
            ages[i]=sc.nextInt();
            System.out.print("Enter height of "+names[i]+": ");
            heights[i]=sc.nextInt();
        }

        int youngestIdx=0;
        int tallestIdx = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIdx]) youngestIdx = i;
            if (heights[i] > heights[tallestIdx]) tallestIdx = i;
        }

        System.out.println("Youngest: "+names[youngestIdx]);
        System.out.println("Tallest: "+names[tallestIdx]);
    }
}
