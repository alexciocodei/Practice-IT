//Write a method called average that takes two integers as parameters and returns the average of the two integers.

public class average
{
    public static void main(String[] args)
    {
        average(5,6);
    }

    public static double average(int x, int y)
    {
        double average = (double)(x + y) / 2;
        System.out.println(average);
        return average;
    }
}
