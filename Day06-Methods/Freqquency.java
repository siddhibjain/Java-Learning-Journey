import java.util.Scanner;

public class Freqquency
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        System.out.print("Enter the digit to check there frequency:");
        int check=sc.nextInt();
        freuqency(num,check);
    }
    public static void freuqency(int n,int check)
    {
        int frequency=0;
        while(n!=0)
        {
            int ld=n%10;
            frequency+=digitIsPresent(ld,check);
                    n/=10;
        }
        System.out.println("The frequency of "+check+" is " +frequency);
    }
    public static int digitIsPresent(int digit,int check)
    {

        if(digit==check)
            return 1;
        else
            return 0;
    }
}
