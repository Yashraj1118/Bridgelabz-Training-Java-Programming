public class ATM {
    String accountHolderName;
    String accountNumber;
    double balance;
    
    public ATM(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        ATM myATM = new ATM("Yash", "938749435",10000);
        myATM.deposit(5000);
        myATM.withdraw(20000);
    }
}

