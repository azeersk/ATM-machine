import java.util.Scanner;

public class ChanagePin {
    public static void Pin(){
        Scanner inputTwo = new Scanner(System.in);
        System.out.print("Enter your Old pin: ");
        int old = inputTwo.nextInt();
        System.out.print("Enter your new pin: ");
        int newPin = inputTwo.nextInt();
        System.out.print("please click enter: ");
        String b = inputTwo.next();
        if (b.equals("enter"))
            System.out.println("Your pin is successfully Changed!");
        else
            System.out.println("please try again!");
    }
}
