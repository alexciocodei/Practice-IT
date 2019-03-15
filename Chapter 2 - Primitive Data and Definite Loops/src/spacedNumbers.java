/* Write nested for loops to produce the following output:
 *
 *     1
 *    2
 *   3
 *  4
 * 5
 */

public class spacedNumbers
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 5 - i; j > 0; j--)
            {
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}