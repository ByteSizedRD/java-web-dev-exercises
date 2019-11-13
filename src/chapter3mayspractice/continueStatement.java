package chapter3mayspractice;

public class continueStatement {
    public static void main(String[] args) {
        int[] someInts = {1, 10, 2, 3, 5, 8, 10};
        int searchTerm = 10;
        for (int oneInt : someInts) {
            if (oneInt == searchTerm) {
                System.out.println("Found it!");
                continue;
            }
            System.out.println("Not  Here.");
        }

        String[] someWords = {"This", "is", "just", "for", "practice", "so", "is", "this."};
        String searchTerm2 = "is";
        for (String oneWord : someWords) {
            if (oneWord.equals(searchTerm2)) {
                System.out.println("Found the word!");
                continue;
            }
            System.out.println("This isn't the word you're looking for...");
        }
    }
}
