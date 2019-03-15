/* Write a method called vertical that accepts a String as its parameter and 
 * prints each letter of the string on separate lines.
 */

public class vertical
{
    public static void main(String[] args)
    {
        vertical("digi24");
    }

    public static void vertical(String str)
    {
        for (int i = 0; i < str.length(); i++)
            System.out.println(str.charAt(i));
    }
}