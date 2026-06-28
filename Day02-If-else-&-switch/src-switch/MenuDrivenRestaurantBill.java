import java.util.Scanner;

public class MenuDrivenRestaurantBill
{
    public static void main(String[] args)
      {
    Scanner sc=new Scanner(System.in);
    System.out.println("   MENU    ");
    System.out.println("1.Pizza-450");
    System.out.println("2.Mac & Cheese-390");
    System.out.println("3.French fries-180");
    System.out.println("4.Chinese platter-400");
   System.out.println("Enter your choice:");
    int choice=sc.nextInt();
    switch(choice)
    {
        case 1: {
            System.out.println("Pizza-450");
            break;
        }
        case 2: {
            System.out.println("Mac & Cheese-390");
            break;
        }
        case 3: {
            System.out.println("French fries-180");
            break;
        }
        case 4: {
            System.out.println("Chinese platter-400");
            break;
        }
        default:
            System.out.println("Enter a valid choice");
    }
}
}
