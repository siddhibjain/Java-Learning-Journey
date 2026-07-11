import java.util.Scanner;

public class PrintColumn
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[2][3];
        System.out.println("Enter matrix elements");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("  matrix is ");

            for(int j=0;j<3;j++)
            {
                System.out.println((j+1)+" column:");
                for(int i=0;i<2;i++)
                {
                System.out.println(arr[i][j]);
            }
                System.out.println();
        }
    }
}
