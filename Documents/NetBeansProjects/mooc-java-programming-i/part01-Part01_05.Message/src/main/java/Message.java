
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Write a message:");
        
        // Read the string written by the user, and assign it
        // to program memory "String message = (string that was given as input)"
        String message = entrada.nextLine();

        // Print the message written by the user
        System.out.println(message);

    }
}
