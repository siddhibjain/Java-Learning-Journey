import java.util.Scanner;

public class IsArmstrong
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int num=sc.nextInt();
        boolean isArmstrong=isArmstrong(num);
        if(isArmstrong)
        {
            System.out.print("Your number is a armstrong number");
        }
        else
        {
            System.out.print("1your number is not an armstrong  number");
        }

    }
    public static boolean isArmstrong(int num)
    {
        int sum=0;
        int original=num;
        int digit=CountDigits(num);
        while(num!=0)
        {
            int ld=num%10;
            num/=10;
           sum += pow(ld,digit) ;
        }
        return sum==original;
    }
    public static int CountDigits(int num)
    {
        int count=0;
        while(num!=0)
        {
            count++;
            num/=10;
        }
        return count;
    }
    public static int pow(int digit,int count)
    {
        int power=1;
        for(int i=1;i<=count;i++)
        {
            power=power*digit;
        }
        return power;
    }
}
