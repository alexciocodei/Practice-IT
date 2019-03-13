//Write a method called printTriangleType that accepts three integer arguments representing the lengths of the sides of a triangle and prints what type of triangle it is.
//The three types are equilateral, isosceles, and scalene.
//An equilateral triangle has all three sides the same length, an isosceles triangle has two sides the same length, and a scalene triangle has three sides of different lengths.

public class printTriangleType
{
    public static void main(String[] args)
    {
        printTriangleType(5, 7, 7);
        printTriangleType(6, 6, 6);
        printTriangleType(5, 7, 8);
        printTriangleType(12, 18, 12);
    }

    public static String printTriangleType (int x, int y, int z)
    {
        if (x == y && y == z)
        {
            System.out.println("equilateral");
            return "equilateral";
        }
        else if (x == y || y == z || x == z)
        {
            System.out.println("isosceles");
            return "isosceles";
        }
        else
        {
            System.out.println("scalene");
            return "scalene";
        }
    }
}
