import java.util.Scanner;

public class ReverseArray
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
        int start=0;
                int end=size-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array elements are:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
