import java.util.Scanner;

public class MergeTwoArrayAlternate
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
        int[] arr3 = new int[size+size2];
        int i=0,j=0,k=0;
        while(i<size && j<size2)
        {
            arr3[k]=arr1[i];
            i++;
            k++;
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        while(i<size)
        {
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j<size2)
        {
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        System.out.println("Third array alternately merged:");
        for(int x=0;x<arr3.length;x++)
        {
            System.out.print(arr3[x]+" ");
        }
    }
}
