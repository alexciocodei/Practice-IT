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
