import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("    Unit Converter   ");
        System.out.println("Enter 1 for Kilometer to Meter ");
        System.out.println("Enter 2 for Meter to Centimeter");
        System.out.println("Enter 3 for Celsius to Fahrenheit");
        System.out.print("Enter your choice:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter the value in Kilometer:");
                double km = sc.nextDouble();
                System.out.println("Meters = " + (km * 1000));
                break;
            case 2:
                System.out.print("Enter the value in meter:");
                double m = sc.nextDouble();
                System.out.println("Centimeters=" + (m * 100));
                break;
            case 3:
                System.out.print("Enter the value in Celsius:");
                double celsius = sc.nextDouble();
                System.out.println("Fahrenheit = " + ((celsius * 9 / 5) + 32));
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
