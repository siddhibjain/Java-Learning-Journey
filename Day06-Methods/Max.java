import java.util.Scanner;

public class Max
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int first=sc.nextInt();
        System.out.print("Enter second number:");
        int second=sc.nextInt();
        max(first,second);
    }
    public static void max(int a,int b)
    {
        if(a>b)
        {
            System.out.println(a+"is greater");
        }
        else
        {
            System.out.println(b+ " is greater");
        }
    }
}
