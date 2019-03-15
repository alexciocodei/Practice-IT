//Consider the following Java method, which is written incorrectly.
//Under what cases will the method print the correct answer, and when will it print an incorrect answer?
//What should be changed to fix the code?
//(For an extra challenge, can you think of a way to write the code correctly without any if/else statements?)

public class printNumOdd
{
    public static void main(String[] args)
    {
        printNumOdd(3, 5, 7);
        printNumOddv2(3, 5, 6);
    }

    public static void printNumOdd(int n1, int n2, int n3)
    {
        int counter = 0;
        if (n1 % 2 != 0)
        {
            counter++;
        }
        if (n2 % 2 != 0)
        {
            counter++;
        }
        if (n3 % 2 != 0)
        {
            counter++;
        }
        System.out.println(counter + " of the 3 numbers are odd.");
    }

    public static void printNumOddv2(int n1, int n2, int n3)
    {
        int count = n1 % 2 + n2 % 2 + n3 % 2;
        System.out.println(count + " of the 3 numbers are odd.");
    }
}
