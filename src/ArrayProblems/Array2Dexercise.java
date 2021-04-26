package ArrayProblems;// Example of creating and using two-dimensional arrays

import java.util.Arrays;
import java.util.Collections;

public class Array2Dexercise {

    public static void main(String[] args) {

        // Declare a two-dimensional array
        int[][] table1;

        // Create a two-dimensional array filled with zeros
        table1 = new int[5][4];

        // Assign random numbers to the array

        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 4; col++) {
                table1[row][col] = (int)(Math.random() * 10 * (row+1));
            }
        }

        System.out.println("table1: " + tableToString(table1));


		// Print the sum of col 3
		int sum = 0;
		for (int row = 0; row < table1.length; row++) {
			                   //table1.length is number of rows
			sum += table1[row][3];
		}
		System.out.println("Sum of column 3 is " + sum);

		// Print the smallest value in row 2
		int min = table1[2][0];
		for (int col = 1; col < table1[2].length; col++) {
			if (table1[2][col] <  min) {
				min = table1[2][col];
			}
		}
		System.out.println("The smallest value in row 2 is " + min);


		// Create a "ragged" array of 4 rows
		int[][] table2 = {{11,18,12,15,18},{22,26,23},{32},{35,38,32,36}};

		System.out.println();
		System.out.println("table2: " + tableToString(table2));

		// count the number of entries in table2
		int count = 0;
		for (int row= 0; row< table2.length; row++) {
			count += table2[row].length;
		}
		System.out.println("The number of entries in table2 is " + count);

    }

    // Prints a 2-D table.  Precondition: the entries all 2-digit numbers
    public static String tableToString(int[][] table) {

        if (table.length == 0) return "";

        String str = "";

        // find the max number of columns
        int numCols = table[0].length;
        for (int row = 1; row < table.length; row++) {
            if (table[row].length > numCols) {
                numCols = table[row].length;
            }
        }

        // include size of table
        str += table.length + " rows by " + numCols + " cols\n     ";
        // include column indices
        for (int col = 0; col < table[0].length; col++) {
            str += col + "  ";
        }
        str += "\n   ";  // end the col indices

        // include line of dashes
        for (int col = 0; col < table[0].length; col++) {
            str += "---";
        }
        str += "\n";  // end dashes

        // Print the table row by row
        for (int row = 0; row < table.length; row++) {
            str += row + " | ";  // row index

            // include row
            for (int col = 0; col < table[row].length; col++) {
                str += table[row][col] + " ";
            }
            str += "\n";  // end the row
        }

        return str;
    }

}

