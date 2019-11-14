package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class countingCharacters {
    public static void main(String[] args) {
//Need string to count:
        String words = "If the product of two terms is zero then common sense says at least one of the " +
                "two terms has to be zero to start with. So if you move all the terms over to one side, you" +
                " can put the quadratics into a form that can be factored allowing that side of the " +
                "equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
//Make case insensitive or it'll count C and c separately
        String lowerCaseWords = words.toLowerCase();
//toCharArray reminder on studio page should be used.
        char[] charArray = lowerCaseWords.toCharArray();
//going to use a hashmap.  it feels like a Char and Integer are just a Key/Value set.
        HashMap<Character, Integer> charNum = new HashMap<>();


 //loop for going through where the data currently is:  charArray)
        for (char i : charArray) {
            if(charNum.containsKey(i)) {
                charNum.put(i, charNum.get(i)+1);
            } else {
                charNum.put (i, 1);
            }
        }
       for(Map.Entry<Character, Integer> i : charNum.entrySet()) {
           System.out.println(i.getKey() + " : " + i.getValue());
       }
    }
}
