import java.util.Scanner;

public class IsTrangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of first angle of a triangle:");
        int first_angle=sc.nextInt();
        System.out.print("Enter the value of second angle of a triangle:");
        int second_angle=sc.nextInt();
        System.out.print("Enter the value of third angle of a triangle:");
        int third_angle=sc.nextInt();
        if(first_angle+second_angle+third_angle==180)
        {
            System.out.println("Hurrayy!It makes triangle");
        }
        else
        {
            System.out.println("It is not a valid triangle");
        }
    }

}
