package chapter04;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int largest = Integer.MIN_VALUE;

        while (counter <= 10){
            System.out.print("Number: ");
            int number = scanner.nextInt();

            if(number > largest){
                largest = number;
            }
            counter++;
        }
        System.out.println("Largest: " + largest);
        scanner.close();
    }
}
