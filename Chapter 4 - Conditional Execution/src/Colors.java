import java.util.Scanner;

public class Colors
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What color do you want? ");
        char letter = input.next().charAt(0);

        if (letter == 'B' || letter == 'b')
        {
            System.out.println("You have chosen Blue.");
        }
        else if (letter == 'G' || letter == 'g')
        {
            System.out.println("You have chosen Green.");
        }
        else if (letter == 'R' || letter == 'r')
        {
            System.out.println("You have chosen Red.");
        }
        else
        {
            System.out.println("Unknown color: " + letter);
        }
    }
}
