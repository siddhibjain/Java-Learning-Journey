import java.util.Scanner;

public class Even
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        isEven(num);
    }
    public static void isEven(int num)
    {
        if(num%2==0)
        {
            System.out.println("Your number is even!");
        }
        else
        {
         System.out.println("your number is odd!");
        }
    }
}
