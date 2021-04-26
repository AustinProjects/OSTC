package ArrayProblems;

import java.util.Arrays;
import java.util.Random;

public class ArrayProblems2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[100];
        int[] array2 = new int[100];
        int[] bigArray = new int[200];
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(49)+1;
            array2[i] = random.nextInt(49)+1;
        }
        for (int i = 0; i < array1.length; i+=2) {
            bigArray[i] = array1[i];
        }
        for (int i = 1; i < array1.length; i+=2) {
            bigArray[i] = array2[i];
        }
        for (int i = 0; i < array1.length; i++) {
            for(int j = 0; j < array1.length; j++) {
                if (array1[i] == array1[j]) {
                    count++;
                }
            }
        }

        System.out.println("Array 1: " +Arrays.toString(array1));
        System.out.println("Array 2: " +Arrays.toString(array2));
        System.out.println("Big Array: " +Arrays.toString(bigArray));
        System.out.println(count);
    }
}