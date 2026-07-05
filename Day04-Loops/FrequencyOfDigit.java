import java.util.Scanner;

public class FrequencyOfDigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        System.out.print("Enter the digit whose frequency has to be checked:");
        int check=sc.nextInt();
        if(check<0 || check>9)
        {
            System.out.println("Enter a single digit!");
            return;
        }
        int original =n;
        int frequency=0;
        n = Math.abs(n);
        while(n!=0)
        {
            int digit =n%10;
            if(digit==check)
            {
                frequency++;
            }
            n=n/10;
        }
        System.out.println("The frequency of digit " +check+ " in "+ original+ " = "+frequency);
    }
}
