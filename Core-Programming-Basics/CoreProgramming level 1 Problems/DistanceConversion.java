import java.util.*;
public class DistanceConversion {
    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        double distanceInFeet=sc.nextDouble();
        double distanceInYards=distanceInFeet/3;
        double distanceInMiles=distanceInYards/1760;
        System.out.println(distanceInFeet+" feet is equal to "+ distanceInYards+" yards and "+ distanceInMiles+" miles");
        
    }
}
