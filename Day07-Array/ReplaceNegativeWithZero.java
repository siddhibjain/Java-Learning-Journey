public class ReplaceNegativeWithZero
{
    public static void main(String[] args)
    {
        int[] arr=ArrayUtility.inputArray();
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]<0)
                arr[i]=0;
        }
        System.out.println("New array:");
        ArrayUtility.displayArray(arr);
    }
}
