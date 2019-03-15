//A "perfect number" is a positive integer that is the sum of all its proper factors (that is, factors including 1 but not the number itself).
//The first two perfect numbers are 6 and 28, since 1+2+3=6 and 1+2+4+7+14=28.
//Write a static method perfectNumbers that takes an integer max as an argument and prints out all perfect numbers that are less than or equal to max.

import java.util.LinkedList;
import java.util.Queue;

public class perfectNumbers
{
    public static void main(String[] args)
    {
        perfectNumbers(6);
        perfectNumbers(500);
    }

    public static void perfectNumbers(int max)
    {
        System.out.print("Perfect numbers up to " + max + ":");
        for (int i = 6; i <= max; i += 2)
        {
            Queue<Integer> divisors = getProperDivisors(i);
            int sum = 0;

            for (int d : divisors)
                sum += d;

            if (i == sum)
                System.out.print(" " + i);
        }
        System.out.println();
    }

    public static Queue<Integer> getProperDivisors(int n)
    {
        Queue<Integer> q = new LinkedList<Integer>();
        for (int i = 1; i < n; i++)
        {
            if (n % i == 0)
                q.add(i);
        }
        return q;
    }
}
