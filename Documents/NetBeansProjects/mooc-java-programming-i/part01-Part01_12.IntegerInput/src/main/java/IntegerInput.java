
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        /* Give a number:
        3
        You gave the number 3 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int variableX = Integer.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + variableX);
    }
}
