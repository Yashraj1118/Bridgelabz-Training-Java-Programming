import java.util.*;
public class Height {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double heightInCm=sc.nextDouble();
        double heightInInches=heightInCm/2.54;
        double heightInFeet=heightInInches/12;
        System.out.println(heightInCm+" cm is equal to "+ heightInInches+" inches and "+ heightInFeet+" feet");
    }
}
