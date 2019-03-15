//Write a method called stutter that accepts a parameter and returns the String with its characters returns repeated twice.
//For example, stutter("Hello!") returns "HHeelllloo!!"

public class stutter
{
    public static void main(String[] args)
    {
        stutter("Hello!");
    }

    public static String stutter(String word)
    {
        String stutter = "";
        for (int i = 0; i < word.length(); i++)
        {
            stutter = stutter + word.charAt(i) + word.charAt(i);
        }
        System.out.println(stutter);
        return stutter;
    }
}
