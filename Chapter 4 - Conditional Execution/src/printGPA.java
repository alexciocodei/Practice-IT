//Write a method named printGPA that calculates a student's grade point average. The user will type a line of input containing the student's name, then a number of scores,
//followed by that many integer scores.

import java.util.Scanner;

public class printGPA
{
    public static void main(String[] args)
    {
        printGPA();
    }

    public static void printGPA()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a student record: ");
        String name = in.next();
        int num = in.nextInt();
        double sum = 0;

        for (int i = 0; i < num; i++)
        {
            sum += in.nextInt();
        }
        System.out.println(name + "'s grade is " + sum / num);
    }
}
