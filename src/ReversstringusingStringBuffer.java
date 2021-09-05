import java.util.Scanner;

public class ReversstringusingStringBuffer
{
    public static void main(String[]args)
    {
        System.out.println("Enter the input string");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        StringBuffer sf = new StringBuffer(input);
        System.out.println("The output is:" +sf.reverse());
    }

}
