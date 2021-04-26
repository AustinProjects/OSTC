package WeatherProject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class WeatherProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> wList = new ArrayList<Integer>();
        int day = 1;
        int average;
        int input;
        int sum = 0;
        boolean isTyping = true;
        int aboveDays = 0;


        System.out.println("Welcome to the weather average tool");

        while (isTyping) {

            System.out.print("Please enter day " + day + "'s weather (or EXIT to stop): ");
            String input1 = scanner.next();

            if (input1.equals("EXIT")) {
                isTyping = false;

            } else {
                input = Integer.parseInt(input1);
                wList.add(day-1, input);
                day++;
            }
        }
        for (Integer integer : wList) {
            sum += integer;
        }
        average = sum/wList.size();
        for (int i = 0; i < wList.size(); i++) {
            if (wList.get(i) > average);
            aboveDays++;
        }
        System.out.println("The average temp for each day is: " + average);
        System.out.println("Days above average temp: " + aboveDays);


    }
}
