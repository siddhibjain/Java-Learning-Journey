import java.util.Scanner;

public class FahrenheitToCelsius
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value in Fahrenheit");
        int fahren=sc.nextInt();
        double celsius=(fahren-32)*5/9;;
        System.out.println("The value returned in celsius is : "+ celsius);
    }
}
