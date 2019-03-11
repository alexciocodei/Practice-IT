public class capitalLetter
{
    public static void main(String[] args)
    {
        String phrase = "Abc";

        if (Character.isUpperCase(phrase.charAt(0)))
        {
            System.out.println("capital");
        }
        else
        {
            System.out.println("not capital");
        }
    }
}
