import java.util.Scanner;

public class EligibilityToVote
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter your age:");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("Your are eligible to vote");
        }
        else if(age>=0 && age<18)
        {
            System.out.println("You are not eligible to vote");
        }
        else
        {
            System.out.println("Please enter a valid age");
        }
    }
}
