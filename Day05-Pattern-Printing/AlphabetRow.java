import java.util.Scanner;

public class AlphabetRow
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows and columns:");
        int n=sc.nextInt();
        for(int rows=1;rows<=n;rows++)
        {
            for(int cols=1;cols<=n;cols++)
            {
                System.out.print((char)(cols+64));
            }
            System.out.println();
        }
    }
}
