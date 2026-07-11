import java.util.Scanner;

public class BoundarySequence
{
    public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter row size: ");
            int rowSize = sc.nextInt();
            System.out.print("Enter column size: ");
            int colSize = sc.nextInt();
            int[][] arr = new int[rowSize][colSize];
            System.out.println("Enter matrix elements:");
            for (int i = 0; i < rowSize; i++)
            {
                for (int j = 0; j < colSize; j++)
                {
                    arr[i][j] = sc.nextInt();
                }
            }
            // First row
            for (int j = 0; j < colSize; j++)
            {
                System.out.print(arr[0][j] + " ");
            }
            // Last column
            for (int i = 1; i < rowSize - 1; i++)
            {
                System.out.print(arr[i][colSize - 1] + " ");
            }
            // Last row (right to left)
            if (rowSize > 1)
            {
                for (int j = colSize - 1; j >= 0; j--)
                {
                    System.out.print(arr[rowSize - 1][j] + " ");
                }
            }
            // First column (bottom to top)
            if (colSize > 1)
            {
                for (int i = rowSize - 2; i >= 1; i--)
                {
                    System.out.print(arr[i][0] + " ");
                }
            }
        }
}


