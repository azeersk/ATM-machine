import java.util.Scanner;

public class BalanceCheck {
    public static void checkBala(){
        Scanner inputThree = new Scanner(System.in);
        System.out.println("choose your language!");
        System.out.println("a.Telugu \nb.Hindi \nc.English");
        String ChooseLang = inputThree.nextLine();
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
        int a = inputThree.nextInt();
        System.out.println("your account balance is 12394 rupees!");
    }
}
