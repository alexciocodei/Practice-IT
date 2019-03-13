//Write a method named pow2 (a variation of the previous pow exercise) that accepts a real number base and an integer exponent as parameters
//and returns the base raised to the given power. Your code should work for both positive and negative exponents.
// For example, the call pow2(2.0, -2) returns 0.25. Do not use Math.pow in your solution.

public class pow2
{
    public static void main(String[] args)
    {
        pow2(2.0, -2);
    }

    public static double pow2(double base, int exponent)
    {
        double pow2 = 1;
        if (exponent == 0)
        {
            System.out.println(1);
            return 1;
        } else if (exponent > 0)
        {
            for (int i = 1; i <= exponent; i++)
            {
                pow2 = pow2 * base;
            }
            System.out.println(pow2);
            return pow2;
        }else
        {
            for (int j = -1; j >= exponent; j--)
            {
                pow2 = pow2 * 1/base;
            }
            System.out.println(pow2);
            return pow2;
        }
    }
}
