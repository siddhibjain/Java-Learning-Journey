import java.util.Scanner;

public class LargestDigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        int largest=0;
        if(n<0)
        {
            n=-n;
        }
        while(n!=0)
        {
            int digit=n%10;
            if(digit>largest)
            {
                largest=digit;
            }
            n=n/10;
        }
        System.out.println(largest+" is largest digit");
    }

}
