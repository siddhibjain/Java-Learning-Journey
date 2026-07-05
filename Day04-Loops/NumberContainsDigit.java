import java.util.Scanner;
public class NumberContainsDigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=sc.nextInt();
        System.out.print("Enter the digit which needs to be checked if it is present:");
        int check=sc.nextInt();
        if(check<0 || check>9)
        {
            System.out.println("Please enter a single digit!");
            return;
        }
        int original=n;
        boolean found=false;
        while(n!=0)
        {
            int digit = n % 10;
            if (digit == check) {
                found = true;
                break;
            }
            n = n / 10;
        }
            if (found) {
                System.out.println(check + " is present in the number " + original);
            } else {
                System.out.println(check + "  is not present in the number " + original);
            }
    }
}
