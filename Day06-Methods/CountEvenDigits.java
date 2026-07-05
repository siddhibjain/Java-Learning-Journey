import java.util.Scanner;

public class CountEvenDigits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        sum(num);
    }
    public static void sum(int n)
    {
        int count=0;
        while(n!=0)
        {
            int ld=n%10;
            count+=checkeven(ld);
            n=n/10;
        }
        System.out.print("Count of even digits = "+ count);
    }
    public static int checkeven(int digit)
    {
        if(digit%2==0)
        {
            return 1;
        }
        else {
            return 0;
        }
    }
}
