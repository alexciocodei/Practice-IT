public class secondHalfLetters
{
    public static void main(String[] args)
    {
        secondHalfLetters("ruminates");
    }

    public static int secondHalfLetters (String phrase)
    {
        int counter = 0;
        for (int i = 0; i < phrase.length(); i++)
        {
            if (Character.toLowerCase(phrase.charAt(i)) >= 'n')
            {
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }
}
