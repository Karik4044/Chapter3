public class EX13
{
        public static void main(String[] args)
        {
            // Hinh tren
            // So hang
            for (int i = 0; i < 4; i++)
            {
                // In khoang trong
                for (int j = 0; j < i; j++)
                {
                    System.out.print("   ");
                }
                // In ngoi sao
                for (int j = 0; j < 10 - (i * 2); j++)
                {
                    System.out.print(" * ");
                }
                System.out.println();
            }

            // Hinh duoi
            // In so hang
            for (int i = 1; i < 4; i++)
            {
                // In khoang trong
                for (int j = 2; j > i - 1; j--)
                {
                    System.out.print("   ");
                }
                // In ngoi sao
                for (int j = 0; j < 4 + (i * 2); j++)
                {
                    System.out.print(" * ");
                }
                System.out.println();
            }
        }
    }
