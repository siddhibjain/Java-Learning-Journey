import java.util.Scanner;

public class SumOfEvenDigits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int num=sc.nextInt();
        sum(num);
    }
    public static void sum(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int ld=n%10;
            sum+=checkeven(ld);
            n=n/10;
        }
        System.out.print("Sum of even digits = "+ sum);
    }
    public static int checkeven(int digit)
    {
        if(digit%2==0)
        {
            return digit;
        }
        else {
            return 0;
        }
    }
}
