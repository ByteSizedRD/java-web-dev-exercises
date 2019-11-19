package exercises.chapter3;

import java.util.ArrayList;
import java.util.Collections;



public class ArrayListPractice {
    public static void main(String[] args) {

        //Write a static method to find the sum of all the even numbers in an ArrayList. Within main, create a list
        // with at least 10 integers and call your method on the list.
        //Made EvenSumNum as the static method for this exercise

        ArrayList<Integer> numToSum = new ArrayList<>();
        Collections.addAll(numToSum, 1, 2, 3, 4, 5, 6, 7, 8,  9, 10);
        System.out.println(EvenNumSum.evenSum(numToSum));


        //Write a static method to print out each word in a list that has exactly 5 letters.
        //Made Print5LetterWord as the static method for this exercise

        ArrayList<String>  wordPrint = new ArrayList<>();
        Collections.addAll(wordPrint, "This", "is", "my", "five", "words", "search", "happy", "kitty");
        System.out.println((Print5LetterWord.lookForFive(wordPrint)));
    }
}
