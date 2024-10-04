import java.util.Scanner;

class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int size = input.nextInt();
        for(int i = 1; i <= size; i++)
        {
            for(int j = 1; j <= size; j++)
            {
                int num =  i * j;
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
        input.close();
    }
}