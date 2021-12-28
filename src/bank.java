import java.util.Scanner;

public class bank {
    public static void inBank(){
        Scanner inputFive = new Scanner(System.in);
        System.out.print("Enter Date: ");
        String date = inputFive.nextLine();
        System.out.print("Enter your bank account number: ");
        int BackNo = inputFive.nextInt();
        System.out.print("Please enter amount: ");
        int amountOf = inputFive.nextInt();
        System.out.print("Enter your Sign: ");
        String sing = inputFive.next();
        System.out.println("Your filed the all details successfully!");
        System.out.println(amountOf + " rupees deducted successfully thank you!");
    }
}
