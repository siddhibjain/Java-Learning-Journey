import java.util.Scanner;

public class Diamond
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        for(int row=1;row<=n;row++)
        {
                for(int col=1;col<=n-row;col++)
                {
                    System.out.print(" ");
                }
                for(int col=1;col<=2*row-1;col++)
                {
                    System.out.print("*");
                }
                System.out.println();
        }
        for(int row=1;row<=n;row++)
        {
            if (row==1)
                continue;
            else
            {
                for (int col = 1; col <= row - 1; col++) {
                    System.out.print(" ");
                }
                for (int col = 1; col <= 2 * (n - row) + 1; col++) {
                    System.out.print("*");
                }
            }
System.out.println();
        }

    }

}
