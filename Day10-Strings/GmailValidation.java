import java.util.Scanner;

public class GmailValidation
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter email:");
        String email=sc.nextLine();
        if(email.endsWith("@gmail.com") && email.indexOf('@')>0)
        {
            System.out.println("It is a valid Gmail!");
        }
        else
        {
            System.out.println("It is not a valid Gmail!");
        }
    }
}
