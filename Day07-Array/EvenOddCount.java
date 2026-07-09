import java.util.Scanner;

public class EvenOddCount
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=ArrayUtility.inputArray();
        ArrayUtility.displayArray(arr);
        int even=countEven(arr);
        int odd=countOdd(arr);
        System.out.println("Number of even elements in the array = "+even);
        System.out.println("Number of odd elements in the array = "+odd);
    }
    public static int countEven(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                count++;
            }
        }
        return count;
    }
    public static int countOdd(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                count++;
            }
        }
        return count;
    }
}
