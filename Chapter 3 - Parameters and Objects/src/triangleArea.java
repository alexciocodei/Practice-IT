/* Write a method called triangleArea that accepts the three side lengths of a 
 * triangle (all real numbers) as parameters and returns the area of a 
 * triangle with those side lengths.
 */

public class triangleArea
{
    public static void main(String[] args)
    {
        triangleArea(2, 3, 5);
    }

    public static double triangleArea(double a, double b, double c)
    {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}