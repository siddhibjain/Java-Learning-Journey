import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        Printname(name);
    }

    public static void Printname(String name) {
        System.out.println("Hello "+name);
    }
}
