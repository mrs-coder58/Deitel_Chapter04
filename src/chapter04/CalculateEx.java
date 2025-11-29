package chapter04;

import java.util.Scanner;

public class CalculateEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();

        double result = 1.0;
        int factorial = 1;
        int i = 1;

        while (i <= terms){
            factorial *= i;
            result += Math.pow(x,i) / factorial;
            i++;
        }

        System.out.println("e^" + x + " = " + result);

    }
}
