import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter username: ");
        String username = reader.nextLine();
        System.out.println("Enter password: ");
        String password = reader.nextLine();
        
        if (username.equals("alex") && password.equals("sunshine") || username.equals("emma") && password.equals("haskell")) {
            System.out.print("You have successfully logged in!");
        } else {
            System.out.print("Incorrect username or password!");
        }
        
    }
}
