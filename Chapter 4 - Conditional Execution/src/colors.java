import java.util.Scanner;

public class colors
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What color do you want? ");
        String letter = input.nextLine();

        if (letter.equalsIgnoreCase("b"))
        {
            System.out.println("You have chosen Blue.");
        }
        else if (letter.equalsIgnoreCase("g"))
        {
            System.out.println("You have chosen Green.");
        }
        else if (letter.equalsIgnoreCase("r"))
        {
            System.out.println("You have chosen Red.");
        }
        else
        {
            System.out.println("Unknown color: " + letter);
        }
    }
}
