/*Write a method called zeroDigits that accepts an integer parameter and returns the number of digits in the number that have the value 0.
  For example, the call zeroDigits(5024036) should return 2, and zeroDigits(743) should return 0.
  The call zeroDigits(0) should return 1. You may assume that the integer is non-negative.
*/

public class zeroDigits
{
    public static void main(String[] args)
    {
        zeroDigits(5024036);
        zeroDigits(743);
    }

    public static int zeroDigits(int integer)
    {
        int count = 0;

        do
        {
            if (integer % 10 == 0)
            {
                count++;
            }
            integer = integer / 10;
        }
        while
        (integer > 0);
        System.out.println(count);
        return count;
    }
}
