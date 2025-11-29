package chapter04;

import java.util.Scanner;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        double population = 8_000_000_000.0; // 8 milyar
        double growthRate = 0.0085; // %0.85

        double currentPopulation = population;
        double newPopulation;
        double increase;

        int year = 1;
        int yearDouble = 0;

        System.out.println("Year\tPopulation\tIncrease");

        while (year <= 75) {
            newPopulation = currentPopulation * (1 + growthRate);
            increase = newPopulation - currentPopulation;

            System.out.printf("%d\t%.0f\t\t%.0f\n", year, newPopulation, increase);

            if (yearDouble == 0 && newPopulation >= 2 * population) {
                yearDouble = year;
            }

            currentPopulation = newPopulation;
            year++;
        }

        System.out.println("\nPopulation doubles in year: " + yearDouble);

    }
}
