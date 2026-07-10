import java.util.Scanner;

public class CheckArrayEqual
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array:");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Enter first array");
        for (int i = 0; i < size; i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.print(" Enter size of second array");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter second array");
        for (int i = 0; i < size2; i++)
        {
            arr2[i] = sc.nextInt();
        }
        System.out.println("First array:");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("Second array:");
        for(int i=0;i<size2;i++)
        {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        boolean equal=true;
        if(size!=size2)
        {
            System.out.print("Array is not equal");
            return;
        }
        for(int i=0;i<arr1.length;i++)
        {
             if(arr1[i]!=arr2[i])
             {
                 equal=false;
                 break;
             }
        }
        if(equal)
        {
            System.out.println("Array is equal");
        }
        else
        {
            System.out.println("Array is not equal!");
        }
    }
}
