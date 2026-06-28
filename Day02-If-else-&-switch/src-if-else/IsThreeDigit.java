import java.util.Scanner;

public class IsThreeDigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=sc.nextInt();
        if(num>=100 && num<=999)
        {
            System.out.println("It is a three digit number");
        }
        else {
            System.out.println("It is not a three digit number");
        }
    }

}
