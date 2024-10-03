public class EX9
{
    public static void main(String[] args)
    {
        int i, b = 0;
        for ( i = 1; i <= 100; i++ )
        {
            if ( i % 7 == 0 )
            {
                b= i;
            }
        }
        System.out.println("The biggest number is: " + b);
    }
}
