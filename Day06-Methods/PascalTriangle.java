import java.util.Scanner;

public class PascalTriangle
{
    public static int fact(int x)
    {
        int xFact=1;
        for(int i=1;i<=x;i++)
        {
            xFact*=i;
        }
        return xFact;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=sc.nextInt();
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<n-row;col++)
            {
                System.out.print(" "+" ");
            }
            for(int col=0;col<=row;col++)
            {
                int icj=fact(row)/(fact(col)*fact(row-col));
                System.out.print(icj+"  ");
            }
            System.out.println();
        }
    }
}
