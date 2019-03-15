//The following code was intended to print a message when the double gpa variable's value is 3.2, but it actually produces the wrong output.
//Fix the code to print the expected message.

public class gpaMessage
{
    public static double gpa(double gpa)
    {
        double diff = (gpa * 3) - 9.6;
        if (diff < 0.01)
        {
            System.out.println("You earned enough credits.");
        }
        return gpa;
    }

    public static void main(String[] args)
    {
        gpa(3.2);
    }
}
