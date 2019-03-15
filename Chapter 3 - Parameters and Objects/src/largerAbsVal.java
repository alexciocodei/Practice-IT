/* Write a method called largerAbsVal that takes two integers as parameters
 * and returns the larger of the two absolute values.
 */

public class largerAbsVal
{
    public static void main(String[] args)
    {
        largerAbsVal(2, -3);
    }

    public static int largerAbsVal(int a, int b)
    {
        return Math.max(Math.abs(a), Math.abs(b));
    }
}
