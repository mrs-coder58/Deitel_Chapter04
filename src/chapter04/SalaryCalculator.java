package chapter04;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grossPay = 0.0;
        while (true){
            System.out.print("User number: ");
            int userNo = scanner.nextInt();
            if (userNo == 4){
                break;
            }

            System.out.print("\nHow many hours worked? ");
            int hoursWorked = scanner.nextInt();

            System.out.print("\nHourly rate: ");
            int hourlyRate = scanner.nextInt();

            if (hoursWorked <= 40){
                grossPay = hoursWorked * hourlyRate;
            }
            else if (hoursWorked > 40){
                grossPay = 40 * hourlyRate + (hoursWorked - 40) * 1.5 * hourlyRate;
            }

            System.out.println("Gross Pay: " + grossPay);
        }

        scanner.close();
    }
}
