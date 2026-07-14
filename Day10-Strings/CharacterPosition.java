import java.util.Scanner;

public class CharacterPosition
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String s=sc.nextLine();
        System.out.print("Enter a character to check its position");
        char ch=sc.next().charAt(0);
        int index=s.indexOf(ch);
        while(index !=-1)
        {
            System.out.println(index);
            index=s.indexOf(ch,index+1);
        }
    }
}
