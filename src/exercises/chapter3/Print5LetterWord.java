package exercises.chapter3;

import java.util.ArrayList;

public class Print5LetterWord {
    public static String lookForFive (ArrayList<String> arrayListParameter) {
        String fiveLetterWord = new String;

        for(int i = 0; i < arrayListParameter.size(); i++) {
            if(arrayListParameter.get(i).length() == 5) {
                fiveLetterWord += arrayListParameter.get(i);
            }
        }
        return fiveLetterWord;
    }
}








//Write a static method to print out each word in a list that has exactly 5 letters.