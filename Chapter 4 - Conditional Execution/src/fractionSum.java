public class fractionSum
{
    public static void main(String[] args)
    {
        fractionSum(10);
        fractionSum(5);
    }

    public static double fractionSum (int n)
    {
        double fractionSum = 0;
        for(int i = 1; i <= n; i++)
        {
            fractionSum = fractionSum + 1.0/i;
        }
        System.out.println(fractionSum);
        return fractionSum;
    }
}
