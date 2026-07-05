import javax.swing.*;
import java.util.Scanner;

public class CheckUppercaseOrLowercase
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a alphabet:");
        String input=sc.next();
        check(input);
    }
    public static void check(String input)
    {
        if(input.length()!=1)
        {
            System.out.println("Enter a single character");
            return;
        }
        char ch=input.charAt(0);
        if(!Character.isLetter(ch))
        {
            System.out.println("Enter an alphabet");
            return;
        }
        if(ch>='A'||ch<='Z')
        {
            System.out.println(input+" is Uppercase");
        }
        else
        {
            System.out.println(input+" is Lowercase");
        }
    }
}
