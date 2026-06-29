import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int count = 0;
        if(n==0)
        {
            count=1;
        }
        else {
            while (n != 0) {
                count++;
                n /= 10;
            }
        }
        System.out.println("The no of digits =" + count);
    }
}
