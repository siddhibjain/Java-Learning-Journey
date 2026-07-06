import java.util.Scanner;

public class Occurence
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] numArr=ArrayUtility.inputArray();
        System.out.println("Enter the number to find occurence :");
        int check=sc.nextInt();
       int occurence=Occurence(numArr,check);
        System.out.println("The occurence of "+check+" in the array is "+occurence);
    }
    public static int Occurence(int[] arr,int check)
    {
        int occ=0;
        int i=0;
        while(i< arr.length)
        {
            if(arr[i]==check)
            {
                occ++;
            }
            i++;
        }
        return occ;

    }
    }

