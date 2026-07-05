import java.util.Scanner;

public class PermutationCombination
{
    public static int fact(int num)
{
    int numFact=1;
    for(int i=1;i<=num;i++)
    {
        numFact*=i;
    }
    return numFact;
}
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        System.out.print("Enter the value of r:");
        int r= sc.nextInt();
        int nCr=fact(n)/(fact(r)*fact(n-r));
        System.out.println(nCr);
        int nPr=fact(n)/fact(n-r);
        System.out.println(nPr);
    }
}
