import java.util.Scanner;

public class ATM {

    private BankAccount account;
    private Scanner sc = new Scanner(System.in);


    public ATM(BankAccount account) {
        this.account = account;
    }


    public void start() {

        int choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();


            switch(choice) {

                case 1:
                    account.displayBalance();
                    break;


                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    account.deposit(deposit);
                    break;


                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();
                    account.withdraw(withdraw);
                    break;


                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;


                default:
                    System.out.println("Invalid choice!");

            }

        } while(choice != 4);
    }
}
