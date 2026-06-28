import java.util.Scanner;

public class CheckDivisibility
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check divisibility:");
        int num=sc.nextInt();
        if(num%5==0  && num%7==0)
        {
            System.out.println("The number is divisible by 5 and 7");
        }
        else
        {
            System.out.println("The number is not divisible by 5 and 7");
        }
    }
}
