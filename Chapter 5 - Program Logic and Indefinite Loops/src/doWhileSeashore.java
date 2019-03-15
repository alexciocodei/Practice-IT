/*Write a do/while loop that repeatedly prints a certain message until the user tells the program to stop.
 The do/while is appropriate because the message should always be printed at least one time, even if the user types n after the first message appears.
*/

import java.util.Scanner;

public class doWhileSeashore
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char y, n, letter;
        do
        {
            System.out.println("She sells seashells by the seashore.");
            System.out.print("Do you want to hear it again? ");
            letter = input.next().charAt(0);
        }
        while (letter == 'y');
    }
}
