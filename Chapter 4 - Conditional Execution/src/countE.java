public class countE
{
    public static void main(String[] args)
    {
        countE("eadsasdWEeEeee");
    }

    public static int countE(String s)
    {
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (Character.toLowerCase(s.charAt(i)) == 'e')
            {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
