import java.util.Scanner;

public class Search
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=ArrayUtility.inputArray();
        System.out.print("Enter the element to search");
        int search=sc.nextInt();
        boolean found=false;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==search)
            {
                found = true;
                break;
            }
        }
            if(found)
            {
                System.out.println(search+ " is present in array");
            }
            else {
                System.out.println(search+ " is not present in array");
            }
    }
}
