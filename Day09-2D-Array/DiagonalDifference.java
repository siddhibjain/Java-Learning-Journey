import java.util.Scanner;

public class DiagonalDifference
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print(("Enter number of rows and column:"));
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter matrix elements");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("  matrix is ");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.printf("%-6d", arr[i][j]);
            }
            System.out.println();
        }
        int primarySum=0;
        int secondarySum=0;
        for (int i = 0; i < n; i++)
        {
            primarySum+=arr[i][i];
            secondarySum+=arr[i][n-1-i];
        }
        System.out.println("Difference between principal diagonal and secondary diagonal="+(secondarySum-primarySum));
    }
}

