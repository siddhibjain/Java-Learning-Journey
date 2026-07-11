import java.util.Scanner;

public class SecondaryDiagonal
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
        System.out.print("Secondary Diagonal elements are:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if(i+j==n-1)
                {
                    System.out.print(arr[i][j]+"  ");
                }
            }
        }
    }
}
//Second method
//import java.util.Scanner;
//
//public class PrintDiagonal
//{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
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
//        System.out.print("Principal Diagonal elements are:");
//        for (int i = 0; i < n; i++)
//        {
//               System.out.print(arr[i][n-1-i]+"  ");
//        }
//    }
//}

