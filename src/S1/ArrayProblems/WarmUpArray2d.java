package S1.ArrayProblems;

import java.util.Random;

public class WarmUpArray2d {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] table = new int[10][10];
        for(int row = 0; row < 10; row++) {
            for(int col = 0; col < 10; col++) {
                table[row][col] = random.nextInt(24)+1;
                System.out.print(table[row][col] + " ");

            }
            System.out.println();
        }
        // Find the largest element.
        int max = table[0][0];
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                if (table[row][col] > max) {
                    max = table[row][col];
                }
            }
        }
        // Does the element occur
        int element = 21; // element in question #2
        boolean isSeen = false;
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                if (table[row][col] == element) {
                    isSeen = true;
                    break;
                }
            }
        }

        System.out.println();
        System.out.println(max);
        System.out.println(isSeen);

        // #3
        for (int row = 1; row < 10; row += 2) {
            for (int col = 0; col < 10; col++) {
                System.out.print(table[row][col] + " ");
            }
        }

        // Q #4
        int sum = 0;
        int average;
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                sum += table[row][col];

            }
        }
        average = sum/(100);
        System.out.println();
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
