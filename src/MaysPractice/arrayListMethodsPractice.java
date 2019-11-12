package MaysPractice;


import java.util.ArrayList;
import java.util.Collections;

public class arrayListMethodsPractice {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<String>();

        Collections.addAll(planets, "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");


        Collections.sort(planets);
        planets.add("Pluto");
        int size = planets.size();
        boolean contains = planets.contains("Earth");



        System.out.println(planets);
        System.out.println("The \"planets\" array list is " + size + " items long.");
        System.out.println("the \"planets\" arrary list contains the word \"Earth\": " + contains);
    }
}
