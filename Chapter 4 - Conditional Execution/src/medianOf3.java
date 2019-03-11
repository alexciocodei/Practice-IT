public class medianOf3
{
    public static void main(String[] args)
    {
        medianOf3(2, 4, 6);
    }

    public static int medianOf3(int n1, int n2, int n3)
    {
        if (n1 < n2 && n1 < n3) {
            if (n2 < n3) {
                return n2;
            } else {
                return n3;
            }
        } else if (n2 < n1 && n2 < n3) {
            if (n1 < n3) {
                return n1;
            } else {
                return n3;
            }
        } else { // (n3 < n1 && n3 < n2)
            if (n1 < n2) {
                return n1;
            } else {
                return n2;
            }
        }
    }
}
