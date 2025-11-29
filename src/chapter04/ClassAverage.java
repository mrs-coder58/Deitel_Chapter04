package chapter04;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;

        System.out.print("Enter grade or -1 to quit: ");
        int grade = scanner.nextInt();

        while (grade != -1){
            total += grade;
            gradeCounter++;

            System.out.print("Enter grade or -1 to quit: ");
            grade = scanner.nextInt();
        }
        if (gradeCounter != 0) {
            double average = (double) total / gradeCounter;

            System.out.println("Class Average of " + gradeCounter + " grades : " + average);
        }
        else {
            System.out.println("No grades were entered!");
        }
    }
}
