import java.util.Scanner;

public class Withdraw {
    public static void WithdrawAmount(){
        Scanner inputOne = new Scanner(System.in);
        System.out.println("choose your language!");
        System.out.println("a.Telugu \nb.Hindi \nc.English");
        String ChooseLang = inputOne.nextLine();
        String language;
        switch (ChooseLang) {
            case "a":
                language = "Telugu is not available Continuous with English!";
                break;
            case "b":
                language = "Hindi is not available Continuous with English!";
                break;
            case "c":
                language = "your selected English language!";
                break;
            default:
                language = ChooseLang + " language is not available!";
                break;
        }
        System.out.println(language);
        System.out.print("please enter your pin number: ");
        int a = inputOne.nextInt();
        int amount;
        if (a == 7869){
            System.out.print("please enter your Amount: ");
            amount = inputOne.nextInt();
            if(amount<=12000){
                System.out.println(amount + " is Deducted from your amount!");
                System.out.println("Account Balance: "+ (12000-amount));
                System.out.println("*** Thank your for Visiting our ATM! ***");
            }
        }else{
            System.out.println("your Pin is Invalid!");
            System.out.println("Please try again!");
        }
    }
}
