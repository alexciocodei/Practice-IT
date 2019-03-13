//Write a method called getGrade that accepts an integer representing a student's grade in a course and returns that student's numerical course grade.
//The grade can be between 0.0 (failing) and 4.0 (perfect). Assume that scores are in the range of 0 to 100 and that grades are based on the following scale: ...
//For an added challenge, make your method throw an IllegalArgumentException if the user passes a grade lower than 0 or higher than 100.

public class getGrade
{
    public static void main(String[] args)
    {
//        getGrade(-1);
        getGrade(92);
        getGrade2(88);
    }

    public static double getGrade(int score)
    {
        if ((score < 0 || score > 100))
        {
            throw new IllegalArgumentException("The grade should be between 0 and 100.");
        }
        double Grade = 0.7;

        if (score < 60)
        {
            Grade = 0.0;
        } else if (score >= 60 && score <= 62)
        {
            Grade = 0.7;
        } else if (score >= 63 && score < 95)
        {
            for (int i = 63; i <= score; i++)
            {
                Grade += 0.1;
            }
        } else if (score >= 95 && score <= 100)
        {
            Grade = 4.0;
        }
        System.out.println(Grade);
        return Grade;
    }

    public static double getGrade2(int score)
    {
        if (score < 0 || score > 100)
            throw new IllegalArgumentException();

        double grade;

        if (score < 60)
        {
            grade = 0.0;
        } else if (60 <= score && score <= 62)
        {
            grade = 0.7;
        } else if (63 <= score && score <= 94)
        {
            grade = 0.8 + (score - 63) * 0.1;
        } else
        {
            grade = 4.0;
        }
        System.out.println(grade);
        return grade;
    }
}
