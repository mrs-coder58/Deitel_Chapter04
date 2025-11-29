package chapter04;

import java.util.Scanner;

public class RightTriangleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int side1 = 0;
        int side2 = 0;
        int side3 = 0;

        while (side1 == 0) {
            System.out.print("Enter side: ");
            side1 = scanner.nextInt();
        }
        while (side2 == 0) {
            System.out.print("Enter side: ");
            side2 = scanner.nextInt();
        }
        while (side3 == 0) {
            System.out.print("Enter side: ");
            side3 = scanner.nextInt();
        }

        int c = side1; //max
        int a = side2;
        int b = side3;

        if(side2 > c){
            c = side2;
            a = side1;
            b = side3;
        }
        if(side3 > c){
           c = side3;
           a = side1;
           b = side2;
        }

        if(c * c == a * a + b * b){
            System.out.println("These sides form a right triangle.");
        }
        else{
            System.out.println("These sides do not form a right triangle.");
        }

        }
}
