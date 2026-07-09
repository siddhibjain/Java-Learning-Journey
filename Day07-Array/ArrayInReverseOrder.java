import java.util.Scanner;

public class ArrayInReverseOrder
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array:");
        int size=sc.nextInt();
        System.out.println("Enter array elements");
        int[] arr=new int[size];
        for(int i=0;i< size;i++)
        {
            System.out.print("Enter the "+(i+1)+" element:");
            arr[i]=sc.nextInt();

        }
        System.out.println("Array elements are:");
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Reversed arrayy is:");
        for(int i=size-1;i>=0;i--)
        {
                    System.out.print(arr[i]+" ");
        }
    }
}
