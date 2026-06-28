import java.util.Scanner;

public class SubjectBasedOnSubjectCode
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("001 for Java Programming");
        System.out.println("002 for DSA");
        System.out.println("003 for Applied Mathematics");
        System.out.println("004 for Engineering Workshop");
        System.out.print("Enter Subject Code:");
        int sub_code=sc.nextInt();
        switch(sub_code)
        {
            case 001:
                System.out.println("Java Programming");
                break;
            case 002:
                System.out.println("DSA");
                break;
            case 003:
                System.out.println("Applied Mathematics");
                break;
            case 004:
                System.out.println("Engineering Workshop");
                break;
            default:
                System.out.println("Invalid Subject Code!");
        }

    }
}
