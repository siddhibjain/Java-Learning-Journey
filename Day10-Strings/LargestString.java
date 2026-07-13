public class LargestString
{
    public static void main(String[] args)
    {
        String[] arr = {"Apple", "Mango", "Banana", "Orange", "Pineapple"};
        String largest = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i].compareTo(largest) > 0)
            {
                largest = arr[i];
            }
        }
        System.out.println("Largest = " + largest);
    }
}