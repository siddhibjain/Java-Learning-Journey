import java.util.Scanner;

public class MoveZeroEnd
{
    public static void main(String[] args)
    {
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
        System.out.println("Array elements are:");
        for (int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int position=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[position]=arr[i];
                position++;
            }
        }
        while(position<arr.length)
        {
            arr[position]=0;
            position++;
        }
        System.out.println();
        System.out.println("Array after moving zeroes to end:" );
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}
