public class season
{
    public static void main(String[] args)
    {
        season(11, 13);
        season(12, 16);
        season(6, 15);
        season(7, 35);
    }

    public static String season (int month, int day)
    {
        if (month == 12 && day >= 16 || month == 1 || month == 2 || month == 3 && day <= 15)
        {
            System.out.println("Winter");
            return "Winter";
        }
        else if (month == 3 && day >= 16 || month == 4 || month == 5 || month == 6 && day <= 15)
        {
            System.out.println("Spring");
            return "Spring";
        }
        else if (month == 6 && day >= 16 || month == 7 || month == 8 || month == 9 && day <= 15)
        {
            System.out.println("Summer");
            return "Summer";
        }
        else //(month == 9 && day >= 16 || month == 10 || month == 11 || month == 12 && day <=15)
        {
            System.out.println("Fall");
            return "Fall";
        }
    }
}
