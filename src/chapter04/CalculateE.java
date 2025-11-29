package chapter04;

import java.util.Scanner;

public class CalculateE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();

        double e = 1.0;
        int factorial = 1;
        int i = 1;
        while (i <= terms){
            factorial *= i;
            e += 1.0 / factorial;
            i++;
        }

        System.out.println("e= " + e);
    }
}
