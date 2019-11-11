package exercises;

import java.util.Scanner;

public class AliceQuoteSearchStrings {
    public static void main(String[] args) {
        String quoteFromAlice;
        String searchTerm;
        int searchTermIndex;
        int searchTermLength;
        Scanner input;

        quoteFromAlice = "Alice was beginning to get very tired of" +
                " sitting by her sister on the bank, and of having" +
                " nothing to do: once or twice she had peeped into " +
                "the book her sister was reading, but it had no pictures" +
                " or conversations in it, 'and what is the use of a " +
                "book,' thought Alice 'without pictures or conversation?'";

        input = new Scanner(System.in);
        System.out.println("Please enter search term:  ");
        searchTerm = input.next();
        input.close();

        searchTermIndex = quoteFromAlice.indexOf(searchTerm);
        searchTermLength = searchTerm.length();

        if (quoteFromAlice.toLowerCase().contains(searchTerm.toLowerCase())) {
            System.out.println("The first instance of \"" + searchTerm + "\" was found in the quote from Alice at" +
                    " index " + searchTermIndex + " and was " + searchTermLength + " characters long");
        }
        else
            System.out.println(searchTerm + " wasn't found in the quote from Alice. Try Again.");
    }
}
