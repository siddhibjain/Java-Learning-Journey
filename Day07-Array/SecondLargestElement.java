public class SecondLargestElement
{
    public void main(String[] args)
    {
        int[] arr=ArrayUtility.inputArray();
        ArrayUtility.displayArray(arr);
        int max=arr[0];
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        int smax=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>smax && arr[i]!=max)
            {
                smax=arr[i];
            }
        }
        System.out.println("Second largest element = "+ smax);
    }
}
