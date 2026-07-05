import java.util.Scanner;

public class OneToTen
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        Numbers(n);
    }
    public static void Numbers(int n)
    {
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }

}
