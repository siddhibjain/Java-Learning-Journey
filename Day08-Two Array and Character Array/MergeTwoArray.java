import java.util.Scanner;

public class MergeTwoArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array::");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Enter first array");
        for (int i = 0; i < size; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print(" Enter size of second array::");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter second array");
        for (int i = 0; i < size2; i++)
        {
            arr2[i] = sc.nextInt();
        }
        int[] arr3=new int[size+size2];
        int index=0;
        for(int i=0;i<size;i++)
        {
            arr3[index++] = arr1[i];
        }
        for(int i=0;i<size2;i++)
        {
            arr3[index]=arr2[i];
            index++;
        }
        System.out.println("ELements of third array:");
        for(int i=0;i<arr3.length;i++)
        {
            System.out.print(arr3[i] + " ");
        }
    }
}

