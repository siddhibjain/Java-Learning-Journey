import java.util.Scanner;

public class RightTriangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();
        for(int rows=1;rows<=n;rows++)
        {
            for(int col=1;col<=rows;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
