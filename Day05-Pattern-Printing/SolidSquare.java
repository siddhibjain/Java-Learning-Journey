import java.util.Scanner;

public class SolidSquare
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows and columns:");
        int n=sc.nextInt();
        //for rows
        for(int rows=1;rows<=n;rows++)
        {
            //for star
            for(int col=1;col<=n;col++)
            {
                System.out.print("* ");
            }
            //next line after each row
            System.out.println();
        }
    }
}
