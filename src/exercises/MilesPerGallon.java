package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {

        int miles;
        int gas;

        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter miles driven:  ");
        miles = input.nextInt();
        System.out.println("Enter gas consumed in gallons:  ");
        gas = input.nextInt();
        input.close();

        int milesPerGallon = (miles) / (gas);

        System.out.println("You are using " + milesPerGallon + "miles per gallon.");


    }
}
