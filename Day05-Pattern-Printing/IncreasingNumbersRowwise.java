import java.util.Scanner;

public class IncreasingNumbersRowwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nummber of rows and columns:");
        int n = sc.nextInt();
        for (int rows = 1; rows <= n; rows++)
        {
            for (int col = 1; col <= n; col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
