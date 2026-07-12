import java.util.Scanner;

public class RemoveDigits {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(!Character.isDigit(ch))
            {
                result += ch;
            }
        }
        System.out.println(result);
    }
}