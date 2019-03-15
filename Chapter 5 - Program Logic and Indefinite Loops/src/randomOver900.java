/*Write a do/while loop that repeatedly prints random numbers from 0 to 999 (inclusive) until a number above 900 (that is, greater than or equal to 900) is printed.
At least one line of output should always be printed, even if the first random number is above 900.
 */

import java.util.Random;
import java.util.Scanner;

public class randomOver900
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();
        int num;
        do {
            num = rand.nextInt(1000);
            System.out.println("Random number: " + num);
        } while (num < 900);
    }
}
