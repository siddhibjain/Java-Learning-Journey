import java.util.Scanner;

public class IsUpperTriangular
{
        public static void main (String[]args)
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
            boolean upper = true;
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    if (i > j && arr[i][j] != 0)
                    {
                        upper = false;
                        break;
                    }
                }
                if (!upper)
                {
                    break;
                }
            }
            if(upper)
            {
                System.out.print("It is an Upper Triangular Matrix");
            }
            else
            {
                System.out.print("It is not an Upper Triangular Matrix");
            }
        }
    }

