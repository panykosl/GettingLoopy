public class B2
{
    public static void main(String[] args)
    {
        for (int x = 5; x > 0; x-- )
        {
            for (int y = 5; y > 0; y-- )
            {
                if (x >= y)
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}