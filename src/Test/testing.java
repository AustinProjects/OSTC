package Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class testing {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many days' temperatures? ");
        int days = scanner.nextInt();
        int[] temps = new int[days];
        double average;
        int total = 0;
        int count = 0;


        for (int i = 0; i < days; i++) {
            int day = i+1;
            System.out.print("Enter day " + day + "'s temperature: ");
            temps[i] = scanner.nextInt();
            total = total + temps[i];

        }
        average = (total / temps.length);
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > average) {
                count += 1;
            }
        }
        System.out.println(Arrays.toString(temps));
        System.out.println("Average: " + average);
        System.out.println("Days above average: ");
    }



}
