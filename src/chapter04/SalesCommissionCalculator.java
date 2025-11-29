package chapter04;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final float product1 = 239.99f;
        final float product2 = 120.75f;
        final float product3 = 99.95f;
        final float product4 = 350.89f;

        double grossSales = 0.0;

        while (true){
            System.out.print("Enter item number sold (-1 to quit): ");
            int itemNumber = scanner.nextInt();

            if (itemNumber == -1){
                break;
            }

            if (itemNumber == 1) {
                System.out.print("Enter quantity sold of item 1: ");
                int qty = scanner.nextInt();
                grossSales += product1 * qty;
            } else if (itemNumber == 2) {
                System.out.print("Enter quantity sold of item 2: ");
                int qty = scanner.nextInt();
                grossSales += product2 * qty;
            } else if (itemNumber == 3) {
                System.out.print("Enter quantity sold of item 3: ");
                int qty = scanner.nextInt();
                grossSales += product3 * qty;
            } else if (itemNumber == 4) {
                System.out.print("Enter quantity sold of item 4: ");
                int qty = scanner.nextInt();
                grossSales += product4 * qty;
            } else {
                System.out.println("Invalid item number. Try again.");
            }
        }

        double earnings = 200 + 0.09 * grossSales;

        System.out.println("Gross sales: " + grossSales);
        System.out.println("Earnings : " + earnings);

        scanner.close();
    }
}
