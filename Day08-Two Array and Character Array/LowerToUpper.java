import java.util.Scanner;

public class LowerToUpper
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
        System.out.print("After conversion:");
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>='a' && arr[i]<='z')
            {
                arr[i]=(char)(arr[i]-32);
            }
        }
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
