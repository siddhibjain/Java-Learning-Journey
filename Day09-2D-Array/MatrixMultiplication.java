import java.util.Scanner;

public class MatrixMultiplication
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size of first matrix: ");
        int rowSize1 = sc.nextInt();
        System.out.print("Enter column size of first matrix: ");
        int colSize1 = sc.nextInt();
        System.out.print("Enter row size of second matrix: ");
        int rowSize2 = sc.nextInt();
        System.out.print("Enter column size of second matrix: ");
        int colSize2 = sc.nextInt();
        if (colSize1 != rowSize2)
        {
            System.out.println("Matrix multiplication is not possible.");
            return;
        }
        int[][] arr1 = new int[rowSize1][colSize1];
        int[][] arr2 = new int[rowSize2][colSize2];
        int[][] result = new int[rowSize1][colSize2];
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rowSize1; i++)
        {
            for (int j = 0; j < colSize1; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rowSize2; i++)
        {
            for (int j = 0; j < colSize2; j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rowSize1; i++)
        {
            for (int j = 0; j < colSize2; j++)
            {
                for (int k = 0; k < colSize1; k++)
                {
                    result[i][j]+= arr1[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println("Result Matrix:");
        for (int i = 0; i < rowSize1; i++)
        {
            for (int j = 0; j < colSize2; j++)
            {
                System.out.printf("%-6d", result[i][j]);
            }
            System.out.println();
        }
    }
}
