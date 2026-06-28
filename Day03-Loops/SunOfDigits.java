import java.util.Scanner;

public class SunOfDigits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(n!=0)
        {
             int ld=n%10;
            sum=sum+ld;
            n=n/10;
        }
        System.out.println("the sum of digits="+sum);
    }

}
