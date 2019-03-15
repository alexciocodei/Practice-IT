//Write a piece of code that reads a shorthand text description of a color and prints the longer equivalent.
//Acceptable color names are B for Blue, G for Green, and R for Red. If the user types something other than B, G, or R, the program should print an error message.
// Make your program case-insensitive so that the user can type an uppercase or lowercase letter.

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
