import java.util.Scanner;

public class Season
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter month number 1-12: ");
            int month = sc.nextInt();
            switch (month)
            {
                //fall through
                //This is called fall-through in a switch statement.
                // When month is 1, Java enters case 1 and continues until it finds a break.
                //So all three cases (12, 1, 2) share the same code:This avoids writing the same System.out.println("Winter"); three times.
                case 12:
                case 1:
                case 2:
                    System.out.println("Winter Season");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Summer Season");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Monsoon Season");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Autumn Season");
                    break;
                default:
                    System.out.println("Invalid Month");
            }
        }
}
