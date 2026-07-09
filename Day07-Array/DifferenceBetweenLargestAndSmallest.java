public class DifferenceBetweenLargestAndSmallest
{
    public static void main(String[] args)
    {
        int[] arr = ArrayUtility.inputArray();
        int max = maximum(arr);
        int min = minimum(arr);
        int diff=max-min;
        System.out.print("Differnce between largest and smallest element="+diff);
    }

        public static int maximum(int[] arr)
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
