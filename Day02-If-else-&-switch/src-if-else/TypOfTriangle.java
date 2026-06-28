import java.util.Scanner;

public class TypOfTriangle
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
            if (first_angle ==60 && second_angle ==60 && third_angle == 60)
            {
                System.out.println("It is an Equilateral Triangle");
            }
            else if (first_angle == second_angle || second_angle == third_angle || first_angle == third_angle)
            {
                System.out.println("It is an Isoceles Triangle");
            }
            else
            {
                System.out.println("It is a Scalene Triangle");
            }
        }
        else
        {
            System.out.println("It is not a valid Triangle");
        }
    }

}
