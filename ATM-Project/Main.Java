public class Main {

    public static void main(String[] args) {


        BankAccount account =
                new BankAccount("Geetha", 123456, 5000);


        ATM atm = new ATM(account);


        atm.start();

    }
}
