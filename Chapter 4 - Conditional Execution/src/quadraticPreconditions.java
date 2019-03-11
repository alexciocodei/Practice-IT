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
