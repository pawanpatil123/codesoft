import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("1. USD to EUR");
        System.out.println("2. EUR to USD");
        System.out.println("3. USD to GBP");
        System.out.println("4. GBP to USD");
        System.out.print("Select an option: ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                usdToEur();
                break;
            case 2:
                eurToUsd();
                break;
            case 3:
                usdToGbp();
                break;
            case 4:
                gbpToUsd();
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
        }
        
        scanner.close();
    }

    private static void usdToEur() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in USD: ");
        double usdAmount = scanner.nextDouble();
        double eurAmount = usdAmount * 0.85; // Conversion rate from USD to EUR
        System.out.println("Equivalent amount in EUR: " + eurAmount);
    }

    private static void eurToUsd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in EUR: ");
        double eurAmount = scanner.nextDouble();
        double usdAmount = eurAmount / 0.85; // Conversion rate from EUR to USD
        System.out.println("Equivalent amount in USD: " + usdAmount);
    }

    private static void usdToGbp() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in USD: ");
        double usdAmount = scanner.nextDouble();
        double gbpAmount = usdAmount * 0.73; // Conversion rate from USD to GBP
        System.out.println("Equivalent amount in GBP: " + gbpAmount);
    }

    private static void gbpToUsd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in GBP: ");
        double gbpAmount = scanner.nextDouble();
        double usdAmount = gbpAmount / 0.73; // Conversion rate from GBP to USD
        System.out.println("Equivalent amount in USD: " + usdAmount);
    }
}
