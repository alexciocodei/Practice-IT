//Write a method named evenSum that prompts the user for many integers and print the total even sum and maximum of the even numbers.
//You may assume that the user types at least one non-negative even integer.

import java.util.Scanner;

public class evenSumMax
{
    public static void main(String[] args)
    {
        evenSum();
    }

    public static void evenSum()
    {
        int sum = 0;
        int max = 0;
        int number;

        Scanner in = new Scanner(System.in);
        System.out.print("how many integers? ");
        int range = in.nextInt();

        for (int i = 1; i <= range; i++)
        {
            System.out.print("next integer? ");
            number = in.nextInt();
            if (i == 1)
            {
                max = number;
            }
            if (number % 2 == 0)
            {
                sum += number;
            }
            if (number % 2 == 0 && number > max)
            {
                max = number;
            }
        }
        System.out.println("even sum = " + sum);
        System.out.println("even max = " + max);
    }
}
