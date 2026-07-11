import java.util.Scanner;

public class IsIdentityMatrix
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
        boolean identity=true;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == j)
                {
                    if (arr[i][j] != 1)
                    {
                        identity = false;
                        break;
                    }
                }
                else
                {
                    if (arr[i][j] != 0)
                    {
                        identity = false;
                        break;
                    }
                }
            }
            if(!identity)
            {
                break;
            }
        }
        if(identity)
        {
            System.out.println("It is an identity matrix");
        }
        else
        {
            System.out.println("It is not an identity matrix");
        }
    }
}
