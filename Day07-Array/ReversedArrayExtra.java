import java.util.Scanner;

public class ReversedArrayExtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int rev[] = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter "+ (i+1) +" element:");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < size; i++)
        {
            rev[i] = arr[size - 1 - i];
        }
        System.out.println("Reversed Array:");
        for (int i = 0; i < size; i++)
        {
            System.out.print(rev[i] + " ");
        }
    }
}