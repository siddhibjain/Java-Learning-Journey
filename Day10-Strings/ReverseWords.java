import java.util.Scanner;

public class ReverseWords
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        int start=0;
        for(int i=0;i<=s.length();i++)
        {
            if(i==s.length() || s.charAt(i)==' ')
            {
                String word=s.substring(start,i);
                for(int j=word.length()-1;j>=0;j--)
                {
                    System.out.print(word.charAt(j));
                }
                System.out.print(" ");
                start=i+1;
            }
        }
    }
}
