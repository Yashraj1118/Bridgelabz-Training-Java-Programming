public class SchoolFees {
    public static void main(String[] args){
        int fee=125632;
        int discountPercentage=13;
        double discountAmount=(fee*discountPercentage)/100.0;
        double discountedFee=fee-discountAmount;
        System.out.println("The original fee is: "+fee+" INR\n"+"The discount percentage is: "+discountPercentage+"%\n"+"The discount amount is: "+discountAmount+" INR\n"+"The discounted fee is: "+discountedFee+" INR");

    }
}
