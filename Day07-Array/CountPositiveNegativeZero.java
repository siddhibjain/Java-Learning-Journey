import java.util.Scanner;

public class CountPositiveNegativeZero
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size=sc.nextInt();
        System.out.println("Enter array elements");
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter "+(i+1)+" element:");
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements are:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int pos=0;
        int neg=0;
        int zero=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
              pos++;
            }
            else if (arr[i]==0)
            {
              zero++;
            }
            else
            {
                neg--;
            }
        }
        System.out.println("number of positive elements ="+pos);
        System.out.println("number of negative elements ="+neg);
        System.out.println("number of zero ="+zero);
    }
}
