/* Write a method named area that accepts the radius of a circle as a
 * parameter and returns the area of a circle with that radius. You may assume
 * that the radius is non-negative.
 */

public class area
{
    public static void main(String[] args)
    {
        area(2);
    }

    public static double area(double r)
    {
        return Math.PI * r * r;
    }
}