package exercises.chapter2;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        double length;
        double width;
        double areaOf;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter length:  ");
        length = input.nextDouble();
        System.out.println("Enter width:  ");
        width = input.nextDouble();
        input.close();

        areaOf = (width) * (length);
        System.out.println("Area of rectangle is:  " + areaOf);

    }
}
