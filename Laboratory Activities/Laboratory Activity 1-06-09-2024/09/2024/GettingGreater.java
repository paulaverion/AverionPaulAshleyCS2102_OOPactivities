import java.util.Scanner;

class GettingGreater
{
    public static void main(String[]args){
        Scanner chValue = new Scanner(System.in);
        System.out.println("Getting the Greater Value");
        System.out.print("Enter the first character: ");
        char ch1 = chValue.next().charAt(0);
        int asciiCh1 = (int) ch1;
        System.out.print("Enter the second character: ");
        char ch2 = chValue.next().charAt(0);
        int asciiCh2 = (int) ch2;
        int greaterValue = Math.max(ch1, ch2);
        char greaterChar = (char) greaterValue;
        System.out.println("-------------------------------------------");
        System.out.println("The character with greater value is: " + greaterChar);
        System.out.println("-------------------------------------------");
        System.out.println("Showing the ASCII Codes");
        System.out.println(ch1 + " : " + asciiCh1);
        System.out.println(ch2 + " : " + asciiCh2);
        chValue.close();
    }
}