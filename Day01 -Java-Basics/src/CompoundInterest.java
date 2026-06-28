import java.util.Scanner;

public class CompoundInterest
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the principal amount:");
       int p=sc.nextInt();
        System.out.println("Enter the rate of interest:");
        int r=sc.nextInt();
        System.out.println("Enter the no of years:");
        int t=sc.nextInt();
        double ci=p*(1+r/100)*t;
        System.out.println("Compound interest is:"+ ci);
    }
}
