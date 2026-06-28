import java.util.Scanner;

public class AlphabetDigitSpecial
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter a character:");
        String input=sc.nextLine();
        if(input.length()!=1)
        {
            System.out.println("Please enter a sngle character");
            return;
        }
        char ch=input.charAt(0);
        if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
        {
            System.out.println(input+" is an alphabet");
        }
        else if(ch>=0 && ch<=9)
        {
            System.out.println(input+"is a digit");
        }
        else
        {
            System.out.println(input+ " is a special character");
        }
    }
}
