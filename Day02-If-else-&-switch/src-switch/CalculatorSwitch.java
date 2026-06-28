import java.util.Scanner;

public class CalculatorSwitch
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Addition");
        System.out.println("Enter 2 for Subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Divison");
        System.out.print("Enter number 1-4:");
        int cal = sc.nextInt();
        System.out.print("Enter first number:");
        int num1 = sc.nextInt();
        System.out.print("Enter second number:");
        int num2 = sc.nextInt();
        switch (cal)
        {
            case 1: {
                System.out.println(num1 + num2);
                break;
            }
            case 2: {
                System.out.println(num1 - num2);
                break;
            }
            case 3: {
                System.out.println(num1 * num2);
                break;
            }
            case 4: {
                System.out.println(num1 / num2);
                break;
            }
            default:
                System.out.println("Enter a valid number! ");
        }
    }
}
