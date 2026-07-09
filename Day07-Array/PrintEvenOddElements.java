public class PrintEvenOddElements
{
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        System.out.println("Array elements are:");
        ArrayUtility.displayArray(arr);
        EvenElement(arr);
        OddElement(arr);
    }
        public static void EvenElement(int[] arr)
        {
            System.out.println("Even elements");
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]%2==0)
                {
                    System.out.print(arr[i]+ " ");
                }
            }
            System.out.println();
        }
      public static void OddElement(int[] arr)
    {
        System.out.println("Odd elements");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                System.out.print(arr[i]+ " ");
            }
        }
    }
}