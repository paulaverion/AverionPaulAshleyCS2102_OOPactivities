import java.util.Scanner;

class GetArrayMean 
{
    public static void getArrayMean(int size)
    {
        Scanner input  = new Scanner(System.in);
        int[] arr = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter number: ");
            int num = input.nextInt();
            arr[i] = num;
            sum += num;
        }
        input.close();
        float mean = (float) sum/size;
        String formattedMean = String.format("%.2f", mean);
        System.out.println("Mean of array is: " + formattedMean);
    }
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = input.nextInt();
        GetArrayMean.getArrayMean(size);
        input.close();

    }
}
