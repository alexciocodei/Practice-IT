//Write a method named daysInMonth that accepts a month (an integer between 1 and 12) as a parameter and returns the number of days in that month in this year.
//For example, the call daysInMonth(9) would return 30 because September has 30 days.
//Assume that the code is not being run during a leap year (that February always has 28 days).

public class daysInMonth
{
    public static void main(String[] args)
    {
        daysInMonth(1);
        daysInMonth(2);
        daysInMonth(3);
        daysInMonth(4);
        daysInMonth(11);
    }

    public static int daysInMonth (int month)
    {
        if ( month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            System.out.println(31);
            return 31;
        }
        else if ( month == 4 || month == 6 || month == 9 || month == 11)
        {
            System.out.println(30);
            return 30;
        }
        else
        {
            System.out.println(28);
            return 28;
        }
    }
}
