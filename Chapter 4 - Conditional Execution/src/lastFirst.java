import java.util.Scanner;

public class lastFirst
{
    public static void main(String[] args)
    {
        lastFirst("Alexandru Ciocodei");
        lastFirst("Bogdan Radulescu");
    }

    public static String lastFirst (String name)
{
    System.out.println(name.substring(name.indexOf(" ") + 1) + ", " + name.charAt(0) + ".");
    return (name.substring(name.indexOf(" ") + 1) + ", " + name.charAt(0) + ".");
}
}
