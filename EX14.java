public class EX14
{
    public static void main(String[] args)
    {
        int r = 5;
        for (int i = 0; i < r; i++)
        {
            for (int j = r; j > i; j--)
            {
                System.out.print("     ");
            }
            for (int k = 1; k <= (2*i)-1; k++)
            {
                System.out.print("  *  ");
            }
            System.out.println();
        }
    }
}
