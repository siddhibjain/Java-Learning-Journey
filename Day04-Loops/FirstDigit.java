import java.util.Scanner;

public class FirstDigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        n = Math.abs(n);
        while(n>=10)
        {
            n=n/10;
        }
        System.out.print("First Digit = "+n);
    }
}
