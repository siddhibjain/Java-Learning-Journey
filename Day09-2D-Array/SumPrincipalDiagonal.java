import java.util.Scanner;

public class SumPrincipalDiagonal
{
    public static void main(String[] args) {
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
        int sum=0;
        System.out.print("Principal Diagonal elements are:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if(i==j)
                {
                    System.out.print(arr[i][j]+" ");
                   sum+=arr[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("Sum of principal diagonal="+sum);
    }
}
