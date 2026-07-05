import java.util.Scanner;

public class RightTriangle4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n=sc.nextInt();

        for(int row=1;row<=n;row++)
        {
            int original=n;
            for(int col=1;col<=row;col++)
            {

                System.out.print(original);
                original--;

            }
            System.out.println();
        }
    }
}
