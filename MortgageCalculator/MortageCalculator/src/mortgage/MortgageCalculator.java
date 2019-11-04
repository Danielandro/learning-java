package mortgage;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    static int principal;
    static double annualInterestRate;
    static int periodInYears;
    static String mortgageInDollars;

    public static void main(String[] args) throws Exception {

        // int paymentPeriod;
        // NumberFormat mortgage;
        // System.out.println("Hey");
        getUserInput();
        calculateMortgage();
    }

    public static void getUserInput() {
        // scan for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        // get user input
        principal = scanner.nextInt();

        // APR
        System.out.print("Annual Interest Rate: ");
        annualInterestRate = scanner.nextDouble();

        // Period
        System.out.print("Period (Years): ");
        periodInYears = scanner.nextInt();

        scanner.close();
        // System.out.println("Principal: " + principal + "\nAnnual Interest Rate: " +
        // annualInterestRate
        // + "\nPeriod (Years): " + periodInYears);
    }

    public static void calculateMortgage() {
        double monthlyInterestRate = (annualInterestRate / 12) / 100;
        int periodInMonths = periodInYears * 12;

        double mortgage = principal * ((monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), periodInMonths)))
                / (Math.pow((1 + monthlyInterestRate), periodInMonths) - 1));

        mortgageInDollars = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: " + mortgageInDollars);
    }
}
