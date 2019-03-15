//Write a method named pow that accepts a base and an exponent as parameters and returns the base raised to the given power.
//For example, the call pow(3, 4) returns 3 * 3 * 3 * 3 or 81. Do not use Math.pow in your solution.
//Assume that the base and exponent are non-negative.

public class pow
{
    public static void main(String[] args)
    {
        pow(3, 4);
        pow(2, 10);
        pow(15, 15);
        pow(0,8);
        pow(8,0);
    }

    public static int pow (int base, int exponent)
    {
        int pow = 1;
        for (int i = 1; i <= exponent; i++)
        {
            pow = pow * base;
        }
        System.out.println(pow);
        return pow;
    }
}
