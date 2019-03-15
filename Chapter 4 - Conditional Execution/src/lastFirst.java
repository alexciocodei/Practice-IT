//Write a method named lastFirst that accepts a string as its parameter representing a person's first and last name.
//The method should return the person's last name followed by the first initial and a period.
//For example, the call lastFirst("Marla Singer") should return "Singer, M.".
//You may assume that the string passed consists of exactly two words separated by a single space.

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
