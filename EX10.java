public class EX10 {
    public static void main(String[] args)
    {
        double sum = 0;
        for( int i = 0; i < 100; i++ )
        {
            if( i % 7 == 0 )
            {
                sum = sum + i;
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
