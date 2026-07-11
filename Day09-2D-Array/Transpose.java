import java.util.Scanner;

public class Transpose
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
        for (int i = 0; i < n; i++)
        {
            for (int j = i+1; j < n; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
            System.out.println("     Transpose of matrix is    ");
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    System.out.printf("%-6d", arr[i][j]);
                }
                System.out.println();
            }
    }
}
//import java.util.Scanner;
//
//public class Transpose
//{
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.print(("Enter number of rows and column:"));
//        int n = sc.nextInt();
//        int[][] arr = new int[n][n];
//        System.out.println("Enter matrix elements");
//        for (int i = 0; i < n; i++)
//        {
//            for (int j = 0; j < n; j++)
//            {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("  matrix is ");
//        for (int i = 0; i < n; i++)
//        {
//            for (int j = 0; j < n; j++)
//            {
//                System.out.printf("%-6d", arr[i][j]);
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < n; i++)
//        {
//            for (int j = i+1; j < n; j++)
//            {
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//        }
//            System.out.println("     Transpose of matrix is    ");
//            for (int i = 0; i < n; i++)
//            {
//                for (int j = 0; j < n; j++)
//                {
//                    System.out.printf("%-6d", arr[i][j]);
//                }
//                System.out.println();
//            }
//    }
//}