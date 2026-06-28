import java.util.Scanner;

public class Divisiblity
{
    public static void main(String[] args)
{
    System.out.println("Numbers which is divisible by 3 & 5 betwwen 1 to 100");
    for(int i=1;i<=100;i++)
    {
        if(i%5==0 && i%3==0)
        {
            System.out.println(i);
        }
    }
}
}
