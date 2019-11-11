package org.launchcode.java.studios.areaofacircle;


import java.util.Scanner;


public class Area {
    public static void main(String[] args) {

        double radius;

        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:  ");
        radius = input.nextDouble();
        input.close();

        if (radius !>0 || radius = " ") && (assertThat(isNumeric(radius)).isTrue()) {
            System.out.println("Please enter a valid numerical value.")
        }
        else
            System.out.println("The area of the circle is: " + Circle.getArea(radius));
        }
    }
}
