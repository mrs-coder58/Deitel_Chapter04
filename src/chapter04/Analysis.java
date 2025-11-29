package chapter04;

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 10){
            System.out.print("Enter results (1: passes, 2:failure): ");
            int result = scanner.nextInt();

            if(result == 1){
                passes++;
            } else if (result == 2){
                failures++;
            }
            else {
                System.out.println("Please enter a suitable result!");
                continue;
            }

            studentCounter++;
        }

        System.out.println("Passes: " + passes + "\nFailures: " + failures);

        if(passes > 8){
            System.out.println("Bonus to instructor!");
        }
    }
}
