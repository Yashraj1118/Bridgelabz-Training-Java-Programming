
public class BankAccount {
    private static String bankName = "MyBank";
    private static int totalAccounts = 0;
    private final String accountNumber;
    private String accountHolderName;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder Name: " + accountHolderName);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("12345", "John Doe");
        BankAccount acc2 = new BankAccount("67890", "Jane Smith");  
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
        BankAccount.getTotalAccounts();
    }
}
