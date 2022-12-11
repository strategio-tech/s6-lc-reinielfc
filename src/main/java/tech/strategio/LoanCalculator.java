package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {
    /**
     * Calculates the remaining amount of a loan after paying 10% of the 
     * remaining loan amount each month for 3 months.
     *
     * @param amount initial loan amount
     * @return remaining amount in 3 months
     */
    public static int getRemainingAmountIn3Months(int amount) {
        final double PERCENTAGE = 0.10;
        final int MONTHS = 3;

        return (int) (getExponentialDecay(amount, PERCENTAGE, MONTHS));
    }

    /**
     * Calculates exponential decay of a given amount.
     *
     * @param initialAmount
     * @param rateOfDecay
     * @param timeIntervals
     * @return exponential decay of initial amount
     */
    public static double getExponentialDecay(double initialAmount, double rateOfDecay, double timeIntervals) {
        return initialAmount * Math.pow(1 - rateOfDecay, timeIntervals);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
