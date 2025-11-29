package chapter04;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       while (true){
           System.out.print("Enter miles (-1 to quit): ");
           int miles = scanner.nextInt();
           if (miles == -1){
               break;
           }

           System.out.print("Enter gallons: ");
           int gallons = scanner.nextInt();
           if (gallons <= 0) {
               System.out.println("Invalid gallons, try again.");
               continue;
           }


           float mpg = (float) miles / gallons;
           System.out.println("MPG for this trip: " + mpg);
       }
    }
}
