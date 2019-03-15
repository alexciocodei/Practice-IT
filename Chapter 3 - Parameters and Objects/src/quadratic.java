/* Write a method called quadratic that solves quadratic equations and prints
 * their roots. Your method should accept the coefficients a, b, and c as
 * parameters and should print the roots of the equation. You may assume that
 * the equation has two real roots, though mathematically this is not always
 * the case. Also, there should be two roots, one the result of the addition,
 * the other, the result of the subtraction. Print the root resulting from the
 * addition first.
 */

public class quadratic
{
    public static void main(String[] args)
    {
        quadratic(1, -7, 12);
    }

    public static void quadratic(double a, double b, double c)
    {
        double rezPoz = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println("First root = " + rezPoz);

        double rezNeg = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println("Second root = " + rezNeg);
    }
}
