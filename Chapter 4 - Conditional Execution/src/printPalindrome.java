//Write a method called printPalindrome that accepts a Scanner for the console as a parameter, and prompts the user to enter one or more words and prints whether the entered
//String is a palindrome (i.e., reads the same forwards as it does backwards, like "abba" or "racecar").

import java.util.Scanner;

public class printPalindrome
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        printPalindrome(console);
    }

    public static void printPalindrome(Scanner console)
    {
        System.out.print("Type one or more words: ");
        String word = console.nextLine();
        boolean palindrome = false;
        for (int i = 0; i < word.length()/2; i++)
        {
            if (word.toLowerCase().charAt(i) != word.toLowerCase().charAt(word.length() - 1 - i))
            {
                System.out.print(word + " is not a palindrome.");
                return;
            }
            else
            {
                palindrome = true;
            }
        }
        if (palindrome == true)
        {
            System.out.print(word + " is a palindrome!");
        }
    }
}
