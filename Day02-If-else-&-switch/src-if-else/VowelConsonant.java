import java.util.Scanner;

public class VowelConsonant
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an alphabet:");
        String input= sc.next();
    if(input.length()!=1)
    {
        System.out.println("Please enter a single alphabet");
        return;
    }
    char ch = Character.toLowerCase(input.charAt(0));
    if(!Character.isLetter(ch))
    {
        System.out.println("Please enter an alphabet");
        return;
    }
        if (ch=='a'|| ch=='e' || ch=='i'|| ch=='o'|| ch=='u')
        {
            System.out.println("The given alphabet is an vowel");
        }
        else
        {
            System.out.println("The given alphabet is a consonant");
        }
    }
}
