import java.util.Scanner;


public class Main {


    public static void main(String[] args)
            throws Exception {


        Scanner sc = new Scanner(System.in);



        System.out.println("===== Currency Converter =====");


        System.out.print("Enter Base Currency: ");
        String from = sc.next().toUpperCase();



        System.out.print("Enter Target Currency: ");
        String to = sc.next().toUpperCase();



        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();



        CurrencyConverterAPI converter =
                new CurrencyConverterAPI();



        double result =
        converter.convert(from,to,amount);



        System.out.println(
        amount + " " + from +
        " = " +
        result + " " + to);



        sc.close();
    }
}
