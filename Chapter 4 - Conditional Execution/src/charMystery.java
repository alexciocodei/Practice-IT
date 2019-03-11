public class charMystery
{
    public static void printRange(char startLetter, char endLetter)
    {
        for (char letter = startLetter; letter <= endLetter; letter++)
        {
            System.out.print(letter);
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        printRange('e', 'g');
        printRange('n', 's');
    }
}
