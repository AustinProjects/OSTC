package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayListRandom {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> aList = new ArrayList<Integer>();

        for (int i = 0; i <= 25; i++) {
            aList.add(i, random.nextInt(100)+1);
        }
        System.out.println(aList);
        // Max of ArrayList
        System.out.println(Collections.max(aList));
        // Reverse ArrayList
        Collections.reverse(aList);
        System.out.println(aList);
        // Check if 3 occurs in ArrayList
        System.out.println(aList.contains(3));
        // Return odd elements
        for (int i = 1; i < aList.size(); i+=2) {
            System.out.println(aList.get(i));
        }
        // Running total
        int sum = 0;
        for (int i = 0; i < aList.size(); i++) {
            sum += aList.get(i);
        }
        System.out.println(sum);
        // Average of ArrayList
        double average = sum/aList.size();
        System.out.println(average);
        // Add 10 points
        for (int i = 0; i < 10; i++) {
            aList.add(random.nextInt(100)+1);
        }
    }

}
