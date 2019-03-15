//Write a method named numUnique that takes three integers as parameters and that returns the number of unique integers among the three.
//For example, the call numUnique(18, 3, 4) should return 3 because the parameters have 3 different values.
// By contrast, the call numUnique(6, 7, 6) would return 2 because there are only 2 unique numbers among the three parameters: 6 and 7.

public class numUnique
{
    public static void main(String[] args)
    {
        numUnique(18, 3, 4);
        numUnique(6, 7, 6);
    }

    public static int numUnique (int x, int y, int z)
    {
        int count = 0;

        if (x == y && y == z)
        {
            count = 1;
        }
        else if (x == y || y == z || x == z)
        {
            count = 2;
        }
        else
        {
            count = 3;
        }
        System.out.println(count);
        return count;
    }
}
