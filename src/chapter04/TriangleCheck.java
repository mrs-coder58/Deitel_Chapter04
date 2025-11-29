package chapter04;

import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1 = 0;
        int side2 = 0;
        int side3 = 0;

        while (side1 == 0){
            System.out.print("Enter side: ");
            side1 = scanner.nextInt();
        }
        while (side2 == 0){
            System.out.print("Enter side: ");
            side2 = scanner.nextInt();
        }
        while (side3 == 0){
            System.out.print("Enter side: ");
            side3 = scanner.nextInt();
        }

        if (    side1 + side2 > side3 &&
                side1 + side3 > side2 &&
                side2 + side3 > side1){
            System.out.println("These dimensions are suitable for a triangle");
        }
        else {
            System.out.println("These dimensions are not for a triangle...");
        }
    }
}
