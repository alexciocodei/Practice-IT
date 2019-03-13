public class printRange
{
    public static void main(String[] args)
    {
        printRange(2, 7);
        printRange(19, 11);
        printRange(5, 5);
    }

    public static String printRange (int nr1, int nr2)
    {
        String printRange = "";
        if (nr1 < nr2)
        {
            for (int i = nr1; i <= nr2; i++)
            {
                printRange = printRange + i + " ";
            }
            System.out.println(printRange);
            return printRange;
        }
        else if (nr1 == nr2)
        {
            System.out.println(nr1);
            return String.valueOf(nr1);
        }
        else
        {
            for (int i = nr1; i >= nr2; i--)
            {
                printRange = printRange + i + " ";
            }
            System.out.println(printRange);
            return printRange;
        }
    }
}
