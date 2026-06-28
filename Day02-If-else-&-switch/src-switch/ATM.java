import java.io.PrintStream;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 232827;
        System.out.println("Enter 1 to check balance");
        System.out.println("Enter 2 to deposit");
        System.out.println("Enter 3 to withdraw");
        System.out.print("Enter your choice:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Your current balance is = " + balance);
                break;
            case 2: {
                System.out.print("Enter deposit amount:");
                double deposit = sc.nextDouble();
                balance = balance + deposit;
                System.out.println("Updated balance = " + balance);
                break;
            }
            case 3: {
                System.out.print("Enter withdrawal amount:");
                double withdraw = sc.nextDouble();
                if (withdraw < balance) {
                    balance = balance - withdraw;
                    System.out.println("Updated balance =" +balance);
                } else {
                    System.out.println("Insufficient balance");
                }
                break;
            }
            default:
                System.out.println("Enter a valid choice!");
        }
    }
}