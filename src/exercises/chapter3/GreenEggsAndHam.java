package exercises.chapter3;

import java.util.Arrays;

public class GreenEggsAndHam {
    public static void main(String[] args) {

        String catQuote = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse.";

        String[]  sentenceArray = catQuote.split("[.]");
// used [.] per https://javarevisited.blogspot.com/2017/01/how-to-split-string-based-on-delimiter-in-java.html.
// could also use \\.
        System.out.println(Arrays.toString(sentenceArray));

        String[] quoteArray = catQuote.split(" ");

        System.out.println(Arrays.toString(quoteArray));


    }

}
