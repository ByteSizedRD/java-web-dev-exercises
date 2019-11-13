package Chapter3MaysPractice;

public class loops {
    public static void main(String[] args) {
     int nums[] = {1, 1, 2, 3, 5, 8, 12, 21};
     String msg = " Hello World ";
     int j = 0;

//standard for loop
        for (int i = 0; i <10; i++)
        {
            System.out.println(i);
        }
//for-each loop
        for (int i : nums)
        {
            System.out.println(i);
        }
//for-each loop converting a String into an Array of char
        for (char c : msg.toCharArray())
        {
            System.out.println(c);
        }
//while loop.  i changed to j as variable since it exists outside of the loop statement & can effect other variables
        while (j < 3)
        {
            j++;
        }
//do-while loop
        do
        {
            System.out.println("Hello World");
        }
        while (false);





    }
}
