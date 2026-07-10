import java.util.Scanner;

public class SortCharacterArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of  array:");
        int size = sc.nextInt();
        char[] arr = new char[size];
        System.out.println("Enter  array");
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.next().charAt(0);
        }
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    char temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Sorted Array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }
}
