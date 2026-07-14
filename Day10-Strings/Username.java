import java.util.Scanner;

public class Username
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter email:");
        String email=sc.nextLine();
        int at=email.indexOf('@');
        String username=email.substring(0,at);
        System.out.println(username);
    }
}
