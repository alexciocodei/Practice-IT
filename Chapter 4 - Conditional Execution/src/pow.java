public class pow
{
    public static void main(String[] args)
    {
        pow(3, 4);
        pow(2, 10);
        pow(15, 15);
        pow(0,8);
        pow(8,0);
    }

    public static int pow (int base, int exponent)
    {
        int pow = 1;
        for (int i = 1; i <= exponent; i++)
        {
            pow = pow * base;
        }
        System.out.println(pow);
        return pow;
    }
}
