import java.util.Scanner;
public class CharacterCount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String s = sc.nextLine();
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int space = 0;
        int special = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                upper++;
            }
            else if(Character.isLowerCase(ch))
            {
                lower++;
            }
            else if(Character.isDigit(ch))
            {
                digit++;
            }
            else if(Character.isWhitespace(ch))
            {
                space++;
            }
            else
            {
                special++;
            }
        }
        System.out.println("Uppercase Letters : " + upper);
        System.out.println("Lowercase Letters : " + lower);
        System.out.println("Digits            : " + digit);
        System.out.println("Spaces            : " + space);
        System.out.println("Special Characters: " + special);
    }
}
