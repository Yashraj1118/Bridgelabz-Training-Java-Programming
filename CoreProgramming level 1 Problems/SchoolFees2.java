import java.util.*;
public class SchoolFees2 {
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Double fees=sc.nextDouble();
        double discountPercentage=sc.nextDouble();
        double discountAmount=(fees*discountPercentage)/100;
        double discountedFees=fees-discountAmount;
        System.out.println("discounted fees: "+discountedFees+ " discount amount: "+discountAmount);
      }    

}
