import java.util.Scanner;

public class IsSymmetric
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size:");
        int rowSize = sc.nextInt();
        System.out.print(("Enter column size:"));
        int colSize = sc.nextInt();
        int[][] arr = new int[rowSize][colSize];
        System.out.println("Enter matrix elements");
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("  matrix is ");
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.printf("%-6d", arr[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<rowSize;i++)
        {
            for (int j=i+1;j<colSize;j++)
            {
               if(arr[i][j]!=arr[j][i])
               {
                   System.out.println("Matrix is not symmetric");
               }
            }
        }
        System.out.println("Matrix is symmetric");
    }
}
