package chapter04;

import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        int number = scanner.nextInt();

        int digit1 = number / 1000;
        int digit2 = (number / 100) % 10;
        int digit3 = (number / 10) % 10;
        int digit4 = number % 10;

        System.out.println("Password: " + digit1 + " " + digit2 + " " + digit3 + " " + digit4);

        int term1 = (digit1 + 7) % 10;
        int term2 = (digit2 + 7) % 10;
        int term3 = (digit3 + 7) % 10;
        int term4 = (digit4 + 7) % 10;

        int temp = term1;
        term1 = term3;
        term3 = temp;

        temp = term2;
        term2 = term4;
        term4 = temp;

        System.out.println("Encrypted password: " + term1 + " " + term2 + " " + term3 + " " + term4);
    }
}
