import java.util.Scanner;

public class AlternateElements
{
    public static void main(String[] args)
    {
        int[] arr=ArrayUtility.inputArray();
        ArrayUtility.displayArray(arr);
        for(int i=0;i< arr.length;i+=2)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
