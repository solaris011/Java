
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Give a string: ");
        String text = reader.nextLine();
        
        if (text.equals("true")) {
            System.out.print("You got it right!");
        } else {
            System.out.print("Try again!");
        }
        
    }
}
