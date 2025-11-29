package chapter04;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your account number: ");
            int accountNumber = scanner.nextInt();
            if (accountNumber == -1){
                break;
            }

            System.out.print("\nEnter your beginning balance: ");
            double beginningBalance = scanner.nextDouble();

            System.out.print("\nEnter your total charges: ");
            double totalCharges = scanner.nextDouble();

            System.out.print("\nEnter your total credits: ");
            double totalCredits = scanner.nextDouble();

            System.out.print("\nEnter your allowed credit limits: ");
            double allowedCreditLimit = scanner.nextDouble();

            double newBalance = beginningBalance + totalCharges - totalCredits;
            System.out.println("New Balance: " + newBalance);
            if (newBalance > allowedCreditLimit){
                System.out.println("Credit limit exceeded!");
            }
            else {
                System.out.println("Credit limit is within the allowed range.");
            }
        }
        scanner.close();
    }
}
