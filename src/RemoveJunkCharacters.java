import java.util.Scanner;

public class RemoveJunkCharacters
{
    public static void main(String [] args)
    {
        System.out.println("Enter the input String");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        input = input.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("The output is:" +input);


    }

}
