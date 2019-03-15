//Consider the task of writing a method named countFactors that accepts an integer (assumed to be positive) as its parameter and returns a count of its positive factors.
//For example, the six factors of 12 are 1, 2, 3, 4, 6, and 12, so the call countFactors(12) should return 6.
//The following is an attempt at solving the problem, but it is incorrect.
//Determine what is wrong with the code, and submit a corrected version that works properly.

public class countFactors
{
    public static int countFactorsList(int n)
    {
        int i = 1;
        for (i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                System.out.print(i + " ");
            }
        }
        return i;
    }

    public static int countFactors(int n)
    {
        int i = 1;
        int counter = 0;
        for (i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }

    public static void main(String[] args)
    {
        countFactorsList(12);
        System.out.println();
        countFactorsList(18);
        System.out.println();
        countFactorsList(216);
        System.out.println();
        countFactors(12);
        countFactors(18);
        countFactors(216);
    }
}
