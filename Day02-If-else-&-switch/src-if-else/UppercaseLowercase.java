import java.util.Scanner;

public class UppercaseLowercase
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter an alphabet:");
        String input=sc.next();
        if(input.length()!=1)
        {
            System.out.println("Please enter a single alphabet");
            return;
        }
        char ch=input.charAt(0);
        if(!Character.isLetter(ch))
        {
            System.out.println("Please enter an alphabet");
            return;
        }
        if(ch>='A'&& ch<='Z')
        {
            System.out.println(ch+ "is Uppercase");
        }
        else if (ch>='a'&& ch<='z')
        {
            System.out.println(ch+" is Lowercase");
        }
        else
        {
            System.out.println(ch+ " is not an alphabet");
        }
    }
}
