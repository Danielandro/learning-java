package mortgage;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    static int principal;
    static double annualRate;
    static int periodInYears;
    static String mortgageInDollars;

    public static void main(String[] args) throws Exception {
        getUserInput();
        getMortgage();
    }

    public static void getUserInput() {
        // scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        annualRate = scanner.nextDouble();

        System.out.print("Period (Years): ");
        periodInYears = scanner.nextInt();

        scanner.close();
    }

    public static void getMortgage() {
        double monthlyRate = calculateRate();
        int periodInMonths = periodInYears * 12;
        double mortgage = calculateMortgage(monthlyRate, periodInMonths);
        printMortgage(mortgage);
    }

    public static void printMortgage(double mortgage) {
        mortgageInDollars = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageInDollars);
    }

    private static double calculateRate() {
        return (annualRate / 12) / 100;
    }

    private static double calculateMortgage(double rate, int months) {
        double numerator = rate * (Math.pow((1 + rate), months));
        double denominator = Math.pow((1 + rate), months) - 1;
        return principal * (numerator / denominator);
    }
}
