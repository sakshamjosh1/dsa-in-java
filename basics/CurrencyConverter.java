import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your currency in INR: ");
        int inr = input.nextInt();
        int toUsd = inr/85;
        System.out.println("The currency in USD is "+ toUsd+"$");
    }
}
