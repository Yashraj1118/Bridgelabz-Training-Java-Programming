import java.util.*;
public class TotalPrice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double price=sc.nextDouble();
        int quantity=sc.nextInt();
        double totalPrice=price*quantity;
        System.out.println("total price: "+ totalPrice);
    }
}
