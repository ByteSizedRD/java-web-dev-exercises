package exercises;

import java.util.Scanner;

public class AliceQuoteSearch {
    public static void main(String[] args) {
        String quoteFromAlice;
        String searchTerm;
        Boolean searchTermResult;
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

        if (quoteFromAlice.toLowerCase().contains(searchTerm.toLowerCase())) {
            searchTermResult = true;
            System.out.println(searchTerm + " was found in the quote from Alice.");
        }
        else
            System.out.println(searchTerm + " wasn't found in the quote from Alice. Try Again.");
    }
}