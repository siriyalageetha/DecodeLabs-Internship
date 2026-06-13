public class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful!");
            System.out.println("Deposited Amount: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }


    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");

        } else if (amount > balance) {
            System.out.println("Insufficient balance!");

        } else {
            balance -= amount;
            System.out.println("Withdrawal successful!");
            System.out.println("Withdrawn Amount: ₹" + amount);
        }
    }


    public void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }
}
