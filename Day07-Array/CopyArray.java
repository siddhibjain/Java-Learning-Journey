import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < size)
        {
            System.out.print("Enter value of " + (i + 1) + " element:");
            arr[i] = sc.nextInt();
            i++;
        }
            int[] copyarr = new int[size];
            for (int j = 0; j < arr.length; j++)
            {
                i = j;
                copyarr[j] = arr[i];
            }
           System.out.println("Elements of coppied array are:");
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(copyarr[j]+" ");
            }
    }
}
