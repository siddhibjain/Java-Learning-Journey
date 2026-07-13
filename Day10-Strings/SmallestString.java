public class SmallestString
{
    public static void main(String[] args)
    {
        String[] arr = {"Apple", "Mango", "Banana", "Orange", "Pineapple"};
        String smallest = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i].compareTo(smallest) < 0)
            {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest = " + smallest);
    }
}
