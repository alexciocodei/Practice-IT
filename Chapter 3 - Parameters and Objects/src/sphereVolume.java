/* Write a method called sphereVolume that accepts a radius (a real number) as
 * a parameter and returns the volume of a sphere with that radius.
 */

public class sphereVolume
{
    public static void main(String[] args)
    {
        sphereVolume(5);
    }

    public static double sphereVolume(double r)
    {
        return 4 * Math.PI * r * r * r / 3;
    }
}