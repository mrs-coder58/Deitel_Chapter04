package chapter04;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int factorial = 1;
        int number = -1;
        while (number < 0){
            System.out.print("Enter a non-negative number: ");
            number = scanner.nextInt();
            if(number < 0){
                System.out.println("error");
            }
        }

        int i = 1;
        while (i <= number){
            factorial *= i;
            i++;
        }
        System.out.println("Factorial: " + factorial);
    }
}
