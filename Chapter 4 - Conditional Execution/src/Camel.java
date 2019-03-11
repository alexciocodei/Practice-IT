public class Camel
{
    public static void main(String[] args)
    {
        int[] camel = {2, 7, 6, 9, 3, 5, 1, 2};
        for (int i = 0; i < camel.length-1; i++) {
            if ((i % 2 == 0)&& (camel[i] < camel[i + 1])) {
                System.out.print(camel[i] + "<" + camel[i + 1] + "; ");
            }
            else if ((i%2!=0)&&(camel[i] > camel[i + 1])) {
                System.out.print(camel[i] + ">" + camel[i + 1] + "; ");
            }
            else {
                System.out.println("Array not a camel!");
                return;
            }
        }
        System.out.println("\nArray is a camel!");
    }
}
