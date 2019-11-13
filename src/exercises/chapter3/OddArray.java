package exercises.chapter3;


public class OddArray {
    public static void main(String[] args) {

        int[] oddsArray = {1,  1, 2, 3,  5, 8};

        for(int i=0; i <oddsArray.length; i++) {
            if( oddsArray[i]%2 !=0) {
                System.out.println(oddsArray[i]);

                // using (int i : oddsArray didn't work, came back with error code for 8 being outside of the
                //array index boundaries since the array is only 6 items long and it was reading "8"
            }
        }
    }
}
