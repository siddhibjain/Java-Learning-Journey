import java.util.Scanner;

public class AbsoluteValue
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter an number:");
        int num=sc.nextInt();
        if(num>=0)
        {
            System.out.println("The absolute value of the number "+num+" = " +num);
        }
        else if (num<0)
        {
            System.out.println("The absolute value of the number "+num+" = "+ -num);
        }
        else
        {
            System.out.println("Please enter an valid number");
        }
    }
}
