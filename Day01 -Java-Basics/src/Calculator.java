import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int num1=sc.nextInt();
        System.out.print("Enter the second number:");
        int num2=sc.nextInt();

        int sum=num1+num2;
        int sub=num1-num2;
        double mul=num1*num2;
        double div=num1/num2;
        System.out.println("Calculator");
        System.out.println("Addtion of two numbers is = "+ sum);
        System.out.println("Subtraction of two numbers is = "+ sub);
        System.out.println("Multiplication of two numbers is ="+ mul);
        System.out.println("Division of two numbers is = "+ div);
    }
}
