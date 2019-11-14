package exercises.chapter3;

import java.util.ArrayList;

public class EvenNumSum {
    public static int evenSum(ArrayList<Integer> arrayListParameter) {
        Integer sumOfEvenNums = 0;

        for (int i = 0; i < arrayListParameter.size(); i++) {
            if (arrayListParameter.get(i)%2 == 0) {

                sumOfEvenNums += arrayListParameter.get(i);
            }
        }
        return sumOfEvenNums;
    }
}
