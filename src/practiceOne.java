import java.util.Scanner;

public class practiceOne {
    public static void main(String[] args){
        Scanner inputSix = new Scanner(System.in);
        int a = inputSix.nextInt();
        for(int i=0; i<a; i++){
            System.out.println(" ".repeat(a-i)+"* ".repeat(i));
        }
        for(int j = 0; j<70;j++){
            System.out.println(" ".repeat(j)+ "* ".repeat(a-j) );
        }
    }
}
