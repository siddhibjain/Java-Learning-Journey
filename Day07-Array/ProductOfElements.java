import java.util.Scanner;

public class ProductOfElements
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an array :");
        int size = sc.nextInt();
        System.out.println("Enter array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter " + (i + 1) + " element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int product = 1;
        int i = 0;
        while (i < arr.length) {
            product *= arr[i];
            i++;
        }
        System.out.println("Product of elements of array are = "+product);
    }
}
