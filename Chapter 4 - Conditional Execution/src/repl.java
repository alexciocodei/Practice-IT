//Write a method named repl that accepts a String and a number of repetitions as parameters and returns the String concatenated that many times.
//For example, the call repl("hello", 3) returns "hellohellohello". If the number of repetitions is 0 or less, an empty string is returned.

public class repl
{
    public static void main(String[] args)
    {
        repl("Hello", 3);
        repl("Hello", 1);
        repl("Hello", 0);
        repl("Hello", -5);
        repl("", 0);
    }

    public static String repl (String sir, int rep)
    {
        String repl = "";
        for (int i = 1; i <= rep; i++)
        {
            repl += sir;
        }
        System.out.print(repl + "\n");
        return repl;
    }
}
