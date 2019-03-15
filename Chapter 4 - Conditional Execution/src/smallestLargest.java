//Write a method named smallestLargest that asks the user to enter numbers, then prints the smallest and largest of all the numbers typed in by the user.
//You may assume the user enters a valid number greater than 0 for the number of numbers to read.

import java.util.Scanner;

public class smallestLargest
{
    public static void main(String[] args)
    {
        smallestLargest();
    }

    public static void smallestLargest()
    {
        int smallest = 0;
        int largest = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you want to enter? ");
        int range = in.nextInt();

        for (int i = 1; i <= range; i++)
        {
            System.out.print("Number " + i + ": ");
            int number = in.nextInt();
            if (i == 1)
            {
                smallest = number;
                largest = number;
            }
            if (number < smallest)
            {
                smallest = number;
            }
            else if (number > largest)
            {
                largest = number;
            }
        }
        System.out.println("Smallest = " + smallest);
        System.out.println("Largest = " + largest);
    }
}
