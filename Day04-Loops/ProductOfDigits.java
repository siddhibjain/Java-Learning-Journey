import java.util.Scanner;

public class ProductOfDigits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int product=1;
        if(n<0)
        {
            n=-n;
        }
        while(n!=0)
        {
            int lastdigit=n%10;
            product*=lastdigit;
            n=n/10;
        }
       System.out.println("The product of digits = "+ product);
    }
}
