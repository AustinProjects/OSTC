package ArrayProblems;

import java.util.Arrays;
import java.util.Random;

public class ArrayProblems {


    public static void main(String[] args) {
        int[] array = new int[25];
        Random random = new Random();
        int sum = 0;

        for (int i = 0; i < array.length; i++ ) {
            array[i] = random.nextInt(100);
        }
        int max = Arrays.stream(array).max().getAsInt();
        for(int i=0; i < array.length/2; i++){
            int nums = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = nums;
        }
        boolean contains = Arrays.stream(array).anyMatch("5"::equals);
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Does array contain 5: " + contains);
        System.out.println("Reversed: " + Arrays.toString(array));
        System.out.println("(Original: " + Arrays.toString(array) + ")");
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);


    }
}
