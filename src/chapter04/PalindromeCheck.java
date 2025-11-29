package chapter04;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();

        if(number >= 10000 && number <= 99999){

            int digit1 = number / 10000;
            int digit2 = (number / 1000) % 10;
            int digit3 = (number / 100) % 10;
            int digit4 = (number / 10) % 10;
            int digit5 = number % 10;

            if(digit1 == digit5 && digit2 == digit4){
                System.out.println(number + " is a palindrome number.");
            }
            else {
                System.out.println(number + " isn't a palindrome number!");
            }
        }
        else{
            System.out.println("Please enter a 5-digit number!");
        }
    }
}
