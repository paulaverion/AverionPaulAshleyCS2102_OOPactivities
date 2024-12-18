import java.util.Scanner;

public class FactorialRecursive
{
    public static int factorial(int n)
    {
        if (n<=1)
        {
            if (n == 0)
            {
                return 1;
            }
            return n;
        }
        else
        {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to get the factorial: ");
        int num = input.nextInt();
        int resulting = factorial(num);
        System.out.print("The factorial is " + resulting + ".");
        input.close();
    }
}