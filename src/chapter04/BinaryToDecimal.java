package chapter04;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int number = scanner.nextInt();
        int originalNumber = number;

        int decimal = 0;
        int power = 1;

        while (number > 0){
            int digit = number % 10;

            if (digit != 0 && digit != 1) {
                System.out.println("Invalid input! Only 0s and 1s are allowed.");
                return;
            }

            decimal = decimal + digit * power;
            power = power * 2;
            number = number / 10;

        }
        System.out.println("Decimal equivalent of " + originalNumber + " is " + decimal);
    }
}
