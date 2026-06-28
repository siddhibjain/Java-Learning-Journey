import java.util.Scanner;

public class DaysInMonth
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to know number of days in January");
        System.out.println("Enter 2 to know number of days in February");
        System.out.println("Enter 3 to know number of days in March");
        System.out.println("Enter 4 to know number of days in April");
        System.out.println("Enter 5 to know number of days in May");
        System.out.println("Enter 6 to know number of days in June");
        System.out.println("Enter 7 to know number of days in July");
        System.out.println("Enter 8 to know number of days in August");
        System.out.println("Enter 9 to know number of days in September");
        System.out.println("Enter 10 to know number of days in October");
        System.out.println("Enter 11 to know number of days in November ");
        System.out.println("Enter 12 to know number of days in December");
        System.out.print("Enter number 1-12:");
        int months = sc.nextInt();
        switch (months)
        {
            case 1: {
                System.out.println("31 days in January");
                break;
            }
            case 2: {
                System.out.println("28 day in February and 29 days if Leap year" );
                break;
            }
            case 3: {
                System.out.println("31 days March");
                break;
            }
            case 4: {
                System.out.println("30 days in April");
                break;
            }
            case 5: {
                System.out.println("31 days in May");
                break;
            }
            case 6: {
                System.out.println("30 days in June");
                break;
            }
            case 7: {
                System.out.println("31 days in July");
                break;
            }
            case 8: {
                System.out.println("31 days in August");
                break;
            }
            case 9: {
                System.out.println("30 days in September");
                break;
            }
            case 10: {
                System.out.println("31 days in October");
                break;
            }
            case 11: {
                System.out.println("30 days in November");
                break;
            }
            case 12: {
                System.out.println("31 days in December");
                break;
            }
            default:
                System.out.println("Enter a valid number!");
        }
    }

}
