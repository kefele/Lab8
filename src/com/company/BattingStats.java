package com.company;

import java.util.Scanner;

public class BattingStats {

    public static void main(String[] args) {

        String answer = "";

        do {


            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the number of at bats: ");

            int useInBats = scan.nextInt();
            int numBases = 0;
            int[] bases = new int[useInBats];


            for (int i = 0; i < useInBats; i++) {
                System.out.println("Please enter the number of bases for each at bat: ");

                bases[i] = scan.nextInt();


            }

            System.out.println("0 = out, 1 = sinle, 2 = double, 3 = triple 4 = home run");
            for (int i = 0; i < useInBats; i++) {

                int bats = i;
                System.out.println("Results for at-bt " + i + ": " + bases[i]);
            }


            double basesSum = 0.0;
            for (int base : bases) {
                basesSum += base;

            }
            double avg = (double) basesSum / useInBats;
            System.out.println();
            System.out.println("Batting average: " + avg);
            System.out.println();
            System.out.println("another batter? (y/n)");
            answer = scan.nextLine();
            scan.nextLine();

        } while (answer.equalsIgnoreCase("yes"));


    }
}
