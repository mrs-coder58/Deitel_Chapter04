package chapter04;

import java.util.Scanner;

public class Decrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter encrpyted password: ");
        int number = scanner.nextInt();

        int digit1 = number / 1000;
        int digit2 = (number / 100) % 10;
        int digit3 = (number / 10) % 10;
        int digit4 = number % 10;

        int temp = digit1;
        digit1 = digit3;
        digit3 = temp;

        temp = digit2;
        digit2 = digit4;
        digit4 = temp;

        int term1 = (digit1 + 10 - 7) % 10;
        int term2 = (digit2 + 10 - 7) % 10;
        int term3 = (digit3 + 10 - 7) % 10;
        int term4 = (digit4 + 10 - 7) % 10;

        System.out.println("Decrypted password: " + term1 + " " + term2 + " " + term3 + " " + term4);
    }
}
