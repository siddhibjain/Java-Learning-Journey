import java.util.Scanner;

public class StudentGrade
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name of the student:");
        String name=sc.nextLine();
        System.out.print("Enter marks of the student");
        int marks=sc.nextInt();
        if(marks<0 && marks>100)
        {
            System.out.println("Please enter a vaid number");
        }
        if(marks<=100 && marks>=90)
            System.out.println("A+");
        else if(marks<90 && marks>=80)
        {
            System.out.println("A");
        }
        else if(marks<80 && marks>=70)
        {
            System.out.println("B");
        }
        else if(marks<70 && marks>=60)
        {
            System.out.println("C");
        }
        else if(marks<60 && marks>=50)
        {
            System.out.println("D");
        }
        else if(marks<50 && marks>=40)
        {
            System.out.println("E");
        }
        else
        {
        System.out.println("F");
        }
    }

}
