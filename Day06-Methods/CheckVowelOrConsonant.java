import java.util.Scanner;

public class CheckVowelOrConsonant
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character");
        String input = sc.next();
        check(input);
    }
    public static void check(String input)
    {
        if(input.length()!=1)
        {
            System.out.print("Enter a single character!");
            return;
        }
        char  ch=input.charAt(0);
        if(!Character.isLetter(ch))
        {
            System.out.print("Please enter an alphabet");
            return;
        }
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println(input+ " is vowel");
        }
        else
        {
            System.out.println(input+ " is consonant");
        }
    }
}
