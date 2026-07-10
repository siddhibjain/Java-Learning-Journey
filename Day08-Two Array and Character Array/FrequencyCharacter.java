import java.util.Scanner;

public class FrequencyCharacter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of  array:");
        int size = sc.nextInt();
        char[] arr = new char[size];
        System.out.println("Enter  array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.next().charAt(0);
            arr[i]=Character.toLowerCase(arr[i]);
        }
        int count=0;
        System.out.println("Enter the character to check:");
        char ch=sc.next().charAt(0);
        for (int i = 0; i < arr.length; i++)
        {
              if(arr[i]==ch)
                  count++;
        }
        System.out.print("Count of "+ch+ "= " +count);
    }
}
