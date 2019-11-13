package Chapter3MaysPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class hashMapMethodsPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> moons = new HashMap<>();

        moons.put("Mercury", 0);
        moons.put("Venus", 0);
        moons.put("Earth", 1);
        moons.put("Mars", 2);
        moons.put("Jupiter", 79);
        moons.put("Saturn", 82);
        moons.put("Uranus", 27);
        moons.put("Neptune", 14);

        int size = moons.size();
        Set<String> keys = moons.keySet(); //Set<String> suggested by auto correct
        Collection<Integer> values = moons.values(); //Collection<Integer> suggested by auto correct
        moons.put("Pluto", 5);
        boolean thisKey = moons.containsKey("Earth");
        boolean thisValue = moons.containsValue(79);



        System.out.println(moons);
        System.out.println(size);
        System.out.println(keys);
        System.out.println(values);
        System.out.println(moons);
        System.out.println(thisKey);
        System.out.println(thisValue);


    }
}
