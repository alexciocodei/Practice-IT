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
