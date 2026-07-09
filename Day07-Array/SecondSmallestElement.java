public class SecondSmallestElement
{
    public void main(String[] args)
    {
        int[] arr=ArrayUtility.inputArray();
        ArrayUtility.displayArray(arr);
        int min=arr[0];
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]<min)
                min=arr[i];
        }
        int smin=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<smin && arr[i]!=min)
            {
                smin=arr[i];
            }
        }
        System.out.println("Second largest element = "+ smin);
    }
}
