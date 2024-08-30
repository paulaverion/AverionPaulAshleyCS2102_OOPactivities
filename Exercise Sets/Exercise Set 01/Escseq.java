public class Escseq
{
    public static void main(String[] args)
    {
        int count = 1;
        for ( int i = 7; i < 100; i+=7)
        {
            if (count % 2 == 1)
            {
                System.out.print(i + "\n");
                count++;
            }
            else
            {
                System.out.print("\t" + i + "\n");
                count++;
            }
        }
            
    }
}