import java.util.Scanner;

public class LCM {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int first=sc.nextInt();
        System.out.print("Enter second number:");
        int second=sc.nextInt();
        int i=1;
        while(i<=second)
        {
            int factor=first*i;
            if(factor%second==0)
            {
                System.out.println(factor +" is LCM of "+ first +" , "+second);
                break;
            }
            i++;
        }
    }

}
