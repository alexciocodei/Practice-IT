import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class cumulativeProduct
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int nr = in.nextInt();
        int product = 1;

        for (int i = 0; i < nr; i++)
        {
            System.out.print("Next number --> ");
            int n = in.nextInt();
            product = product * n;
        }

        System.out.print("Product = " + product);
    }
}
