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


            System.out.println("The area of the circle is: " + Circle.getArea(radius));

    }
}
