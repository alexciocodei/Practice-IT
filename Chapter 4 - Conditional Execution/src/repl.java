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
