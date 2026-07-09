import java.util.Scanner;

public class RotateArrayLeft
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter " + (i + 1) + " element:");
            arr[i] = sc.nextInt();
        }
        int k=3;
      reverse(arr,0,size-1);
      reverse(arr,0,k-1);
      reverse(arr,k,size-1);
      System.out.println("Array rotated left:");
      for(int i=0;i<arr.length;i++)
      {
          System.out.print(arr[i]+" ");
      }
    }
    public static int[] reverse(int[] arr,int start,int end)
    {
        while(start<end)
        {
           int  temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
}
