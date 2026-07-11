import java.util.Scanner;

public class MaxSumRow
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
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
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
         int maxSum= Integer.MIN_VALUE;
        int maxSumRow=0;
        for (int i = 0; i < rowSize; i++)
        {
            int sum=0;
            System.out.print("Sum of "+(i+1)+" row:");
            for (int j = 0; j < colSize; j++)
            {
                sum+=arr[i][j];
            }
            System.out.println(sum);
            if(sum>maxSum)
            {
                maxSum=sum;
                maxSumRow=i+1;
            }
        }
        System.out.println("Maximum row sum="+maxSum);
        System.out.println("Row ="+maxSumRow);
    }
}
