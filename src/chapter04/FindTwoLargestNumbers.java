package chapter04;

import java.util.Scanner;

public class FindTwoLargestNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest;
        int secondLargest;

        System.out.print("Number 1: ");
        largest = scanner.nextInt();

        System.out.print("Number 2: ");
        int second = scanner.nextInt();

        if(second > largest){
            secondLargest = largest;
            largest = second;
        }
        else {
            secondLargest = second;
        }

        int counter = 2;
        while (counter < 10){
            System.out.print("Number " + (counter + 1) +": ");
            int number = scanner.nextInt();

            if (number > largest){
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }

            counter++;
        }
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);

        scanner.close();
    }
}
