/* Write a method called scientific that accepts two real numbers as
 * parameters for a base and an exponent and computes the base times 10 to the
 * exponent, as seen in scientific notation.
 */

public class scientific
{
    public static void main(String[] args)
    {
        scientific(2, 5);
    }

    public static double scientific(double base, double exp)
    {
        return base * Math.pow(10, exp);
    }
}