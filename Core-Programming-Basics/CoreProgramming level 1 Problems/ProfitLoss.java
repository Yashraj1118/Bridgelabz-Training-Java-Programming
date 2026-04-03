public class ProfitLoss {
    public static void main(String[] args){
        int costPrice=129;
        int sellingPrice=191;
        int profit=sellingPrice-costPrice;
        double profitPercentage=((double)profit/costPrice)*100;
        System.out.println("the cost price in INR is: "+costPrice+ " the selling price in INR is: "+sellingPrice+"\n" +"the profit in Rs will be: "+profit+ " and the profit percentage will be: "+profitPercentage+"%");
    }
}
