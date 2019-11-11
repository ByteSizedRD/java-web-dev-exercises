package exercises;

import java.util.Scanner;

public class AreaStudioWithoutCircle {
    public static void main(String[] args) {

        double radius;
        double areaOfCircle;

        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius:  ");
        radius = input.nextDouble();
        input.close();


        areaOfCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is: " + areaOfCircle);


    }
}
