//The following program contains 7 errors. Correct the errors and submit a working version of the program.
//The corrected version of the program should produce the following output: a is the smallest!

public class oops4Errors
{
    public static int smaller;

    public static void main(String[] args)
    {
        int a = 7, b = 42;
        minimum(a, b);
        if (smaller == a)
        {
            System.out.println("a is the smallest!");
        }
    }

    public static void minimum(int a, int b)
    {
        if (a < b)
        {
            smaller = a;
        } else if (a >= b)
        {
            smaller = b;
        }
    }
}
