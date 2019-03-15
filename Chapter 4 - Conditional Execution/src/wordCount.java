//Write a method called wordCount that accepts a String as its parameter and returns the number of words in the String.
//A word is a sequence of one or more nonspace characters (any character other than ' ').
//For example, the call wordCount("hello") should return 1, the call wordCount("how are you?") should return 3,
//the call wordCount(" this     string has     wide       spaces ") should return 5, and the call wordCount(" ") should return 0.

public class wordCount
{
    public static void main(String[] args)
    {
        wordCount("hello");
        wordCount("how are you?");
        wordCount(" this     string has     wide       spaces ");
        wordCount(" ");
    }

    public static int wordCount(String phrase)
    {
        String[] arr = phrase.split("\\s+");
        int count = 0;

        for (String s : arr)
        {
            if (s.length() > 0)
                count++;
        }
        System.out.println(count);
        return count;
    }
}
