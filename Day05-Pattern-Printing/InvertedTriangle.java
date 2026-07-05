import java.util.Scanner;

public class InvertedTriangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        for(int row=1;row<=n;row++)
        {
            for (int col=1;col<=n-row+1;col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
