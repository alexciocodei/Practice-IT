//Write a static method called quadrant that takes as parameters a pair of real numbers representing an (x, y) point and that returns the quadrant number for that point.
//Recall that quadrants are numbered as integers from 1 to 4 with the upper-right quadrant numbered 1 and the subsequent quadrants numbered in a counter-clockwise fashion.
//If a point falls on the x-axis or the y-axis, then the method should return 0.

public class quadrant
{
    public static void main(String[] args)
    {
        quadrant(12.4, 17.8);
        quadrant(-2.3, 3.5);
        quadrant(-15.2, -3.1);
        quadrant(4.5, -42.0);
        quadrant(0.0, 3.14);
    }

    public static int quadrant(double x, double y)
    {
        int quadrant;

        if (x > 0 && y > 0)
        {
            quadrant = 1;
        }
        else if (x < 0 && y > 0)
        {
            quadrant = 2;
        }
        else if (x < 0 && y < 0)
        {
            quadrant = 3;
        }
        else if (x > 0 && y < 0)
        {
            quadrant = 4;
        }
        else
        {
            quadrant = 0;
        }
        System.out.println(quadrant);
        return quadrant;
    }
}
