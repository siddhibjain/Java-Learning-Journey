import java.util.Scanner;

public class FileType
{
    public static void main(String[] ars)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a file name:");
        String file=sc.nextLine();
        if(file.endsWith(".pdf"))
        {
            System.out.println("It is a PDF File!");
        }
        else if(file.endsWith(".jpg"))
        {
            System.out.println("It is a Jpg file!");
        }
        else
        {
             System.out.println("It is an unknown file!");
        }
    }
}
