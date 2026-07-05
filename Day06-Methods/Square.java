import java.util.Scanner;

public class Square
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        double num=sc.nextDouble();
        square(num);
    }
    public static void square(double num)
    {
        double sqrt=num*num;
        System.out.print(sqrt);


    }
}
