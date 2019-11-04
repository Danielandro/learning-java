package mortgage;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;
    static int principal;
    static float annualInterest;
    static byte years;
    static double mortgage;

    public static void main(String[] args) throws Exception {
        getUserInput();
        getMortgage();
        printMortgage(mortgage);
    }

    public static void getUserInput() {
        // scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        annualInterest = scanner.nextFloat();

        System.out.print("Period (Years): ");
        years = scanner.nextByte();

        scanner.close();
    }

    public static void getMortgage() {
        float monthlyInterest = calculateInterest();
        int numberOfPayments = years * MONTHS_IN_YEAR;
        mortgage = calculateMortgage(monthlyInterest, numberOfPayments);
    }

    public static void printMortgage(double mortgage) {
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

    private static float calculateInterest() {
        return (annualInterest / MONTHS_IN_YEAR) / PERCENT;
    }

    private static double calculateMortgage(double interest, int numOfPayments) {
        double numerator = interest * (Math.pow((1 + interest), numOfPayments));
        double denominator = Math.pow((1 + interest), numOfPayments) - 1;
        return principal * (numerator / denominator);
    }
}
