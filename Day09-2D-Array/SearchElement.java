import java.util.Scanner;

public class SearchElement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size:");
        int rowSize = sc.nextInt();
        System.out.print(("Enter column size:"));
        int colSize = sc.nextInt();
        int[][] arr = new int[rowSize][colSize];
        System.out.println("Enter matrix elements");
        for (int i = 0; i < rowSize; i++)
        {
            for (int j = 0; j < colSize; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("  matrix is ");
        for (int i = 0; i < rowSize; i++)
        {
            for (int j = 0; j < colSize; j++)
            {
                System.out.printf("%-6d", arr[i][j]);
            }
            System.out.println();
        }
        System.out.print("Enter number to search:");
        int search = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < rowSize; i++)
        {
            for (int j = 0; j < colSize; j++)
            {
                if (arr[i][j] == search)
                {
                    System.out.println("Number is present in the matrix!");
                    found = true;
                    return;
                }
            }
        }
            System.out.println("Number is not present in the matrix!");
    }
}
