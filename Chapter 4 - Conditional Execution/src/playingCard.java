import java.util.Scanner;

public class playingCard
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a card: ");
        String rank = console.next();
        String suit = console.next();
        switch (rank)
        {
            case "2":
                rank = "Two";
                break;
            case "3":
                rank = "Three";
                break;
            case "4":
                rank = "Four";
                break;
            case "5":
                rank = "Five";
                break;
            case "6":
                rank = "Six";
                break;
            case "7":
                rank = "Seven";
                break;
            case "8":
                rank = "Eight";
                break;
            case "9":
                rank = "Nine";
                break;
            case "10":
                rank = "Ten";
                break;
            case "J":
                rank = "Jack";
                break;
            case "Q":
                rank = "Queen";
                break;
            case "K":
                rank = "King";
                break;
            default:  // rank.equals("A")
                rank = "Ace";
                break;
        }

        switch (suit)
        {
            case "C":
                suit = "Clubs";
                break;
            case "D":
                suit = "Diamonds";
                break;
            case "H":
                suit = "Hearts";
                break;
            default:  // suit.equals("S")
                suit = "Spades";
                break;
        }

        System.out.println(rank + " of " + suit);
    }
}
