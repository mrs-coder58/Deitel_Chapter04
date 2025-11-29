package chapter04;

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of one side of the square (1-20): ");
        int side = scanner.nextInt();
        int row = 1;

        while (row <= side) {

            int col = 1;

            while (col <= side) {
                if (row == 1 || row == side) {
                    System.out.print("*");
                }
                else {
                    if (col == 1 || col == side) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
