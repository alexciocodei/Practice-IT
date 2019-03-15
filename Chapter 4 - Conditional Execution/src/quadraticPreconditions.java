//Exercise 3.8 asked you to write a method called quadratic that solves quadratic equations and prints their roots.
//Recall that a quadratic equation is a polynomial equation in terms of a variable x of the form a x2 + b x + c = 0.
//But for some values of a, b, and c, the formula does not find any valid roots. Under what conditions would this formula fail?
//Modify the quadratic method so that it will reject invalid values of a, b, or c by throwing an IllegalArgumentException.

public class quadraticPreconditions
{
    public static void main(String[] args)
    {
        quadratic(10, 5, 6);
    }

    public static void quadratic(double a, double b, double c)
    {
        double radical = b * b - 4 * a * c;

        if (a == 0)
        {
            throw new IllegalArgumentException("Invalid because a = 0.");
        }
        if (radical<0)
        {
            throw new IllegalArgumentException("Invalid because you cannot extract radical from a negative number.");
        }

        double rezPoz = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println("First root = " + rezPoz);

        double rezNeg = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println("Second root = " + rezNeg);
    }
}
