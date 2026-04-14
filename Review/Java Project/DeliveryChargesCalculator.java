// Problem 3: Delivery Charges Calculator
// Step 1 – Calculate Delivery Fee
// Given weight (kg) and distance (km), the calculator should return the delivery fee.

// Cost: ₹5/km + ₹10/kg
// Minimum Fee: ₹50

// Step 2 – Multiple Parcels
// The Calculator should now accept multiple parcels and return the aggregate total delivery fee.
// Step 3 – Enhanced Receipt
// The Receipt should now include:

// Total Number of Parcels
// Total Delivery Fee
// Average Fee Per Parcel

// Step 4 – Delivery Service
// Given a sender ID, the Delivery Service fetches parcel records from the Parcel Repository and returns the Receipt.
// Step 5 – Express Delivery
// The service now supports 2 delivery types:

// Standard: ₹5/km + ₹10/kg, Minimum ₹50
// Express: ₹10/km + ₹20/kg, Minimum ₹100

import java.util.Scanner;
public class DeliveryChargesCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Do you want to add a user? (yes/no)");
        
        String response=sc.nextLine();
        if(response.equals("no")){
            break;
        }
        if(!response.equals("yes")){
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            continue;
        }
        System.out.println("Enter the user ID: ");
        int userId=sc.nextInt();
        System.out.println("Enter the user name: ");
        String userName=sc.next();
        System.out.println("Enter the user Phone Number: ");
        Long userPhoneNumber=sc.nextLong();

        double totalFees=0.0;
        int numberOfParcels=0;

        while(true){
            System.out.println("Do you want to add a parcel? (yes/no) ");
            String parcelResponse=sc.next();
            if(parcelResponse.equals("no")){
                break;
            }
            if(!parcelResponse.equals("yes")){
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                continue;
            }
            System.out.println("Enter the weight of the parcel in kg: ");
            double weight=sc.nextDouble();
            System.out.println("Enter the distance for delivery in km: ");
            double distance=sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter the delivery type (Standard/Express): ");
            String deliveryType=sc.next();
            double fee=calculateDeliveryFee(weight, distance, deliveryType);
            totalFees+=fee;
            numberOfParcels++;
            System.out.println("Delivery fee for this parcel: Rs "+ fee);
        }
        
        System.out.println("\n--- Delivery Receipt ---");
        System.out.println("Customer ID: " + userId);
        System.out.println("Customer Name: " + userName);
        System.out.println("Customer Phone Number: " + userPhoneNumber);
        System.out.println("Total Number of Parcels: " + numberOfParcels);
        System.out.println("Total Delivery Fee: Rs " + totalFees);
        if(numberOfParcels > 0) {
            System.out.println("Average Fee Per Parcel: Rs " + (totalFees / numberOfParcels));
        } 
        
    }
}
    
    public static double calculateDeliveryFee(double weight, double distance,String deliveryType) {
        if(deliveryType.equals("Standard")){
            double fee = 5 * distance + 10 * weight;
            return Math.max(fee, 50);
        }
        else{
            double fee= 10 * distance + 20 * weight; 
            return Math.max(fee, 100);
        }
         
    }
    
    
}