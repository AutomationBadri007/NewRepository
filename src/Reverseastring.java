import java.util.Scanner;

public class Reverseastring
{
    public static void main (String [] args)
    {
        System.out.println("Enter the string value");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String rev = "";
        for(int i=input.length()-1;i>=0;i--)
        {
             rev = rev +input.charAt(i);


        }

        System.out.println("The output is:" +rev);

    }


}
