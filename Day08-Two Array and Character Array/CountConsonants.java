import java.util.Scanner;

public class CountConsonants
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
        int count=0;
        System.out.print("count of consonant::");
        for(int i=0;i< arr.length;i++)
        {
            char character=arr[i];
            char ch=Character.toLowerCase(character);
            if(!(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u'))
            {
                count++;
            }
        }
        System.out.print(count);
    }
}
