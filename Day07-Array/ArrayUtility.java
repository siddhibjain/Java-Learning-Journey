import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size = sc.nextInt();
        int[] num = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("Enter value of " + (i + 1) + " element:");
            num[i] = sc.nextInt();
            i++;
        }
        return num;
    }
    public static void displayArray(int[] arr)
    {
        int i=0;
        while(i< arr.length)
        {
            System.out.print(arr[i]+" ");
            i++;
        }
    }
}
