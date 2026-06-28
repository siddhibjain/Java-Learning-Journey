import java.util.Scanner;

public class StudentPortal
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to view Profile.");
        System.out.println("Enter 1 to view Marks.");
        System.out.println("Enter 1 to view Attendance.");
        System.out.println("Enter 4 to Logout.");
        System.out.print("Enter your choice:");
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Viewing profile...");
                System.out.println("Name:Siddhi Banthia Jain");
                break;
            case 2:
                System.out.println("Viewing Marks...");
                System.out.println("Marks obtained 89/100");
                break;
            case 3:
                System.out.println("Viewing Attendance...");
                System.out.println("Attendance:93%");
                break;
            case 4:
                System.out.println("Logging out...");
                System.out.println("Thank you for using the Student Portal!");
                break;
            default:
                System.out.println("Invalid Choice");
        }

    }
}
