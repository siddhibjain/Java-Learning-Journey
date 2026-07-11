import java.util.Scanner;

public class AreMatrixEqual
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Matrix addition!");
        System.out.print("Enter row size of first array:");
        int rowSize1 = sc.nextInt();
        System.out.print(("Enter column size of first array:"));
        int colSize1 = sc.nextInt();
        int[][] arr1 = new int[rowSize1][colSize1];
        System.out.println("Enter matrix elements of first array");
        for (int i = 0; i < rowSize1; i++)
        {
            for (int j = 0; j < colSize1; j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter row size of second array:");
        int rowSize2 = sc.nextInt();
        System.out.print(("Enter column size:"));
        int colSize2 = sc.nextInt();
        int[][] arr2 = new int[rowSize2][colSize2];
        System.out.println("Enter matrix elements of second array");
        for (int i = 0; i < rowSize2; i++)
        {
            for (int j = 0; j < colSize2; j++)
            {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println(" First matrix is ");
        for (int i = 0; i < rowSize1; i++)
        {
            for (int j = 0; j < colSize1; j++)
            {
                System.out.printf("%-6d", arr1[i][j]);
            }
            System.out.println();
        }
        System.out.println(" Second matrix is ");
        for (int i = 0; i < rowSize2; i++)
        {
            for (int j = 0; j < colSize2; j++)
            {
                System.out.printf("%-6d", arr2[i][j]);
            }
            System.out.println();
        }
        if(rowSize1!=rowSize2 && colSize1!=colSize2)
        {
            System.out.println("Matrices are not equal!");
            return;
        }
        for(int i=0;i<rowSize1;i++)
        {
            for(int j=0;j<colSize1;j++)
            {
                if(arr1[i][j]!=arr2[i][j])
                {
                    System.out.println("Matrices are not equal");
                    return;
                }
            }
        }
        System.out.println("matrices are equal!");
    }
}
