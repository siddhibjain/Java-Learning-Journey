import java.util.Scanner;

public class FirstOccurence
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your string:");
        String s=sc.nextLine();
        System.out.print("Enter a character to find its first ocurence:");
        char ch=sc.next().charAt(0);
        int index=s.indexOf(ch);
        if(index==-1)
        {
            System.out.print("Character not found!");
        }
        else
        {
            System.out.println("Character found at index "+index);
        }
    }
}
