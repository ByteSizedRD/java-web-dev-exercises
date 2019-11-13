package MaysPractice;


import java.util.ArrayList;
import java.util.Collections;

public class arrayListMethodsPractice {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<String>();

        Collections.addAll(planets, "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus",
                "Neptune");


        Collections.sort(planets);
        planets.add("Pluto");
        int size = planets.size();
        boolean contains = planets.contains("Earth");
        int index = planets.indexOf("Earth");



        System.out.println(planets);
        System.out.println("The \"planets\" array list is " + size + " items long.");
        System.out.println("The \"planets\" array list contains the word \"Earth\": " + contains);
        System.out.println("The \"planets\" array list contains the word \"Earth\" at " +index+ " index.");


        //toArray method returns an Array contains the elements of the ArrayList.  Need to know the size of an array
        //before you can create it, so need to include the size() method also.
        String[] planetsArray = new String[planets.size()];
        planets.toArray(planetsArray);
    }
}
