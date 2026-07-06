public class MaxAndMin
{
    public static void main(String[] args)
    {
        int[] numArr=ArrayUtility.inputArray();
                int max=maximun(numArr);
                int min=minimum(numArr);
                System.out.println("The maximum value is: "+max);
                System.out.println("The minimum value is: "+min);
    }
    public static int maximun(int[] arr)
    {
        int max= Integer.MIN_VALUE;
        int i=0;
        while(i< arr.length)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            i++;
        }
        return max;
    }
    public static int minimum(int[] arr)
    {
        int min=arr[0];
        int i=1;
        while(i< arr.length)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            i++;
        }
                return min;
    }
}
