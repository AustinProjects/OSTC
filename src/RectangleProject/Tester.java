package RectangleProject;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your length: ");
        int inpLength = scanner.nextInt();
        System.out.print("Enter your width: ");
        int inpWidth = scanner.nextInt();
        Rectangle rect = new Rectangle(inpLength, inpWidth);
        rect.area();
        System.out.println(rect.answer);
        rect.perimeter();
        System.out.println(rect.answer);
        rect.isSquare();
        System.out.println(rect.squareIs);
    }
}
