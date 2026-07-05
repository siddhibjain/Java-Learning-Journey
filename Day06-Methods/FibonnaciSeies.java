import java.util.Scanner;

public class FibonnaciSeies
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        printFibonnaci(num);
    }
    public static void printFibonnaci(int num)
    {
        if(num==0)
        return;
        System.out.print("0 ");
        if(num<0)
        System.out.print("1 ");
        int first=0,second=1;
        while(first+second<=num)
        {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
